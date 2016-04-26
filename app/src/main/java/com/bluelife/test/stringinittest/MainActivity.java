package com.bluelife.test.stringinittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String val = null;
        try {
            val = new String(null, "UTF-8");
            Log.i("Fail", val);
        } catch (UnsupportedEncodingException ex) {

        }

    }
}
