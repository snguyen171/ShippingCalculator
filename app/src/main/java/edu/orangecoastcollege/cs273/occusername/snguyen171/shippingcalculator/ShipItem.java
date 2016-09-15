package edu.orangecoastcollege.cs273.occusername.snguyen171.shippingcalculator;

/**
 * Created by Nick on 9/15/2016.
 */
public class ShipItem {

    private int mWeight;
    private double mBase;
    private double mAdded;
    private double mTotal;

    public ShipItem(){
        mWeight = 0;
        mBase = 0.0;
        mAdded = 0.0;
        mTotal = 0.0;
    }

    public ShipItem(int mWeight)
    {
        this.mWeight = mWeight;
        recalculateAmounts();
    }

    public int getWeight() {return mWeight; }
    public int getBase() {return mBase; }
    public int getAdded() {return mAdded; }
    public int getTotal() {return mTotal; }

    public void setWeight(int mWeight){
        this.mWeight = mWeight;
        recalculateAmounts();

    }

    private void recalculateAmounts()
    {
        if (mWeight >= 16)
        {
            mBase = 3.00;
        }
        else
        {
            mBase = 0.00;
        }

        if(mWeight > 16)
        {
            double additionWeight = (mWeight - 16)/4;
            mAdded = Math.ceil(additionWeight) * 0.5;
        }

        mTotal = mBase + mAdded;
    }

}
