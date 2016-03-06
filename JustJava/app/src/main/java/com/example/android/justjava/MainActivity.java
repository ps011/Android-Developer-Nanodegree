package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {
    int coffeeOrdered=0;
    TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
    TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(1);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void display(int number) {

        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    public void displayPrice(int number) {

        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    public void increment()
    {
        coffeeOrdered=coffeeOrdered++;
        quantityTextView.setText("" + coffeeOrdered);
    }
    public void decrement()
    {
        coffeeOrdered=coffeeOrdered--;
        quantityTextView.setText("" + coffeeOrdered);
    }
}