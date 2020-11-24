package com.example.interoperabilitas;

import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class API {
    public String callAPI(String url, String string)
    {
        final String[] stringJSON = new String[1];
        new AsyncHttpClient().get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                stringJSON[0] = new String(responseBody);
                Log.i("response", stringJSON[0]);

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("error", "Error dalam retrieve JSON");
                error.printStackTrace();

            }
        });
        return stringJSON[0];
    }
}
