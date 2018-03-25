package com.example.a100523538.assignmenttwo;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrowseProductsActivity extends AppCompatActivity implements AsyncResponse {
    int currItem = 0;                                   // First item
    int size;                                    // Amount of items
    String currentBTC;
    ProductDBHelper db = new ProductDBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_products);
        db.deleteAllProducts();
        db.addNewProduct("Chair", "A chair to sit", 15); // |
        db.addNewProduct("Hat", "A hat to wear", 5); //     |
        db.addNewProduct("Book", "A book to read", 10); //  | Add Starter Values
        db.addNewProduct("Door", "A door to enter", 50); // |

        displayCurrent();

    }

    public void displayCurrent() {

        TextView nameToEdit = (TextView) findViewById(R.id.editname);           //|
        TextView descToEdit = (TextView) findViewById(R.id.editdescription);    //|-- Find the TextViews to change
        TextView priceCADToEdit = (TextView) findViewById(R.id.editpricecad);   //|

        List<Product> products = db.getAllProducts();
        nameToEdit.setText(products.get(currItem).name);                        //|
        descToEdit.setText(products.get(currItem).description);                 //|
        priceCADToEdit.setText(String.valueOf(products.get(currItem).price));   //|-- Set the TextViews
        size = products.size();                                                 //|
        CADtoBTC(products.get(currItem).price);                                 //|

        }

    public void previous(View v) {
        if (currItem != 0) {    // Can't go to previous when at the first item
            currItem--;         // Item before current
            displayCurrent();   // Show that item
        }
    }

    public void next(View v) {
        if (currItem != size - 1) { // Can't go to next when at the last  item
            currItem++;             // Item after current
            displayCurrent();       // Show that item
        }
    }

    public long get() {
        List<Product> products = db.getAllProducts();   // Populate the list
        Product currProduct = products.get(currItem);   // Current product
        long currItemID = currProduct.getProductID();
        return currItemID;                              // Get the ID
    }

    public void add(View v) {
        size++;                                                         // Increase the size
        Intent addIntent = new Intent(this, AddProductActivity.class);  // Call the adder
        startActivity(addIntent);
    }

    public void remove(View v) {
        if (size != 1) {                    // Can't remove lats item
            db.deleteProductById(get());    // Delete
            size--;                         // One less item
            previous(v);                    // Display previous
        }
    }

    public void CADtoBTC(float CAD){
        TalkToServer connection = new TalkToServer(this);   // Create the ASyncTask
        connection.delegate = this;
        connection.execute(CAD);                            // Start it, with CAD price
        processFinish(connection.value);                    // Call processFinish with result
    }

    @Override
    public void processFinish(String output) {              // Sent after ASync
        currentBTC = output;
        TextView priceBTCToEdit = (TextView) findViewById(R.id.editpricebtc); // Set the textView
        priceBTCToEdit.setText(currentBTC);
    }

    public class TalkToServer extends AsyncTask<Float, Void, String> {
        Context c;
        String value;
        public AsyncResponse delegate = null;


        public TalkToServer(Context context) {
            c = context;
        }

        @Override
        protected String doInBackground(Float... params) {

            try {
                URL url = new URL("https://blockchain.info/tobtc?currency=CAD&value="+params[0]);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                int result = conn.getResponseCode();

                if (result == HttpURLConnection.HTTP_OK) {
                    InputStream in = conn.getInputStream();
                    InputStreamReader inStream = new InputStreamReader(in);
                    BufferedReader buff = new BufferedReader(inStream);
                    String line = buff.readLine();
                        value = line;                                               // Reading and setting the web[page contents
                    }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                HttpURLConnection conn;
            }

            return value;
        }

        @Override
        protected void onPostExecute(String result) {
            //super.onPostExecute(result);
            delegate.processFinish(result);

            }

       }

}