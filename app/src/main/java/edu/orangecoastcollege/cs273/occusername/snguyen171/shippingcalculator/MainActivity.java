package edu.orangecoastcollege.cs273.occusername.snguyen171.shippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText weightEditText
    private TextView baseCostNum;
    private TextView addedCostNum;
    private TextView totalCostNum;

    ShipItem currentItem = new ShipItem();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    weightEditText = (EditText) findViewById(R.id.weightEditText);

}
