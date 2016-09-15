package edu.orangecoastcollege.cs273.occusername.snguyen171.shippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextWatcher;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    private EditText weightEditText;
    private TextView baseCostNum;
    private TextView addedCostNum;
    private TextView totalCostNum;

    ShipItem currentItem = new ShipItem();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText = (EditText) findViewById(R.id.weightEditText);
        baseCostNum = (TextView) findViewById(R.id.baseCostNum);
        addedCostNum = (TextView) findViewById(R.id.addedCostNum);
        totalCostNum = (TextView) findViewById(R.id.totalCostNum);

        currentItem.setWeight(0);
    }

    private TextWatcher weightEditTextListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
            // Do nothing;
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
            try{
                if(charSequence.toString().isEmpty())
                {
                    currentItem.setWeight(0);
                }
                else
                {
                    int weight = Integer.parseInt(charSequence.toString());
                    currentItem.setWeight(weight);
                }
            }
            catch (NumberFormatException e)
            {

            }

            baseCostNum.setText(currency.format)
        }

        @Override
        public void afterTextChanged(Editable editable) {
            // Do nothing;
        }
    };
}
