package com.wonkydan.kitinventoryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addItem;
    Button viewStock;
    Button amendStock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent(MainActivity.this, AddStockActivity.class);

                startActivity(intent);
            }
        });

        //an on click listener for the view stock button
        viewStock = (Button) findViewById(R.id.view_stock_main);
        viewStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ViewStockActivity.class);

                startActivity(intent);
            }
        });

        //an on clicklistener for add stock button
        addItem = (Button) findViewById(R.id.add_stock_main);
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddStockActivity.class);

                startActivity(intent);
            }
        });

        //an on click listener for the amend stock button
        amendStock = (Button) findViewById(R.id.amend_stock_main);
        amendStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AmendStockActivity.class);

                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_main_page) {
            return true;
        }else if(id == R.id.action_add_stock){
            Intent intent = new Intent(MainActivity.this, AddStockActivity.class);

            startActivity(intent);
            return true;
        }else if(id == R.id.action_view_stock){
            Intent intent = new Intent(MainActivity.this, ViewStockActivity.class);

            startActivity(intent);
            return true;
        }else if(id == R.id.action_amend_stock){Intent intent = new Intent(MainActivity.this, AmendStockActivity.class);

            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}