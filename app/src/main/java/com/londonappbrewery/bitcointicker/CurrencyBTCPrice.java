package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class CurrencyBTCPrice {

    private String mCurrencyBTCPrice;


    public static CurrencyBTCPrice fromJSON(JSONObject jsonResponse){
        try{
            CurrencyBTCPrice btcConversion = new CurrencyBTCPrice();
            btcConversion.mCurrencyBTCPrice= jsonResponse.getString("ask");
            return btcConversion;
        }catch(JSONException e){
            e.printStackTrace();
            return null;
        }

    }
    public String getCurrencyBTCPrice() {
        return mCurrencyBTCPrice;
    }
}
