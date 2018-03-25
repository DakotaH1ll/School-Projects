package com.example.a100523538.assignmenttwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddProductActivity extends AppCompatActivity {

    ProductDBHelper db = new ProductDBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
    }

    public void cancel(View v){
        Intent cancelIntent = new Intent(this, BrowseProductsActivity.class); // Return to main menu
        startActivity(cancelIntent);
    }

    public void save(View v){
        Intent i = getIntent();

        EditText name =  (EditText) findViewById(R.id.nameedittext);
        EditText desc =  (EditText) findViewById(R.id.descedittext);     // Set the EditTexts
        EditText price =  (EditText) findViewById(R.id.priceedittext);


        String productName = name.getText().toString();
        String productDesc = desc.getText().toString();                     // Read in the values
        Float productPrice = Float.valueOf(price.getText().toString());

        db.addNewProduct(productName, productDesc, productPrice);           // Create a new product based on values

        finish();

    }
}
