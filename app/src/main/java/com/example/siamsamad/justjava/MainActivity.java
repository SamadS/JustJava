package com.example.siamsamad.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Variables declared for us to use later */
    int quantity = 0;

    /** Tap on the plus button to increase the number displayed */
    public void increment (View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    /** Tap on the minus button to decrease the number displayed */
    public void decrement (View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    /** This method is called when the order button is clicked */

    public void submitOrder(View view) {
        String priceMessage = "Total Due: $" + (quantity * 5);
        priceMessage = priceMessage + "\nThank you for your order!";
        displayMessage (priceMessage);
    }

    /** This method displays the given quantity value on the screen. */

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /** This method displays the given price on the screen. */

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }


}