package com.example.a100523538.assignmenttwo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 100523538 on 11/11/2016.
 */

public class ProductDBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_FILENAME = "products.db";

    private static final String CREATE_STATEMENT = "" +
            "create table products(" +
            "  _id integer primary key autoincrement," +
            "  name text not null," +
            "  description text not null," +
            "  price real not null)";

    private static final String DROP_STATEMENT = "" +
            "drop table products";

    public ProductDBHelper(Context context) {
        super(context, DATABASE_FILENAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_STATEMENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_STATEMENT);
        db.execSQL(CREATE_STATEMENT);
    }

    public Product addNewProduct(String name,                   // Create a new product
                                 String desc,
                                 float price) {
        // insert the contact data into the database
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("description", desc);
        values.put("price", price);
        long id = db.insert("products", null, values);

        // create a new contact object
        Product product = new Product(id, name, desc, price);
        return product;
    }

    public void deleteProductById(long id) {                    // Delete a product
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("products", "_id = ?", new String[] { ""+id });
    }
    public void deleteAllProducts() {                           // Delete all products
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("products", "", new String[]{});
    }

    public List<Product> getAllProducts() {                     // List all products
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Product> results = new ArrayList<>();

        String[] columns = new String[] {"_id",
                "Name",
                "Description",
                "Price"};
        String where = "";  // all contacts
        String[] whereArgs = new String[] {};
        String groupBy = "";  // no grouping
        String groupArgs = "";
        String orderBy = "_id";

        Cursor cursor = db.query("products", columns, where, whereArgs,
                groupBy, groupArgs, orderBy);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()) {
            long id = cursor.getLong(0);
            String productName = cursor.getString(1);
            String productDescription = cursor.getString(2);
            Float productPrice = cursor.getFloat(3);

            results.add(new Product(id, productName, productDescription, productPrice));

            cursor.moveToNext();
        }

        return results;
    }
}
