package com.auliaberliana201103649.forex;

import com.google.gson.annotations.SerializedName;

public class RootModel
{
    @SerializedName("rates")
    private RatesModel ratesModel;

    public RootModel() {}

    public RatesModel getRatesModel() {
        return ratesModel;
    }

    public void setRatesModel(RatesModel ratesModel) {
        this.ratesModel = ratesModel;
    }
}
