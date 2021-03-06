package com.archaea.restclient.shops;

import android.app.Activity;

import com.archaea.models.Shop;

import org.json.JSONException;

import java.util.List;

/**
 * Created by vizsatiz on 13-10-2016.
 */
public interface IShopRestClient {

    public List<Shop> getAllShopsNearBy(String cityName, String locality, Activity currentActivity) throws JSONException;

}
