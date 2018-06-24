package com.wmtbr.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String TEXT_LOG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TEXT_LOG, "onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.v(TEXT_LOG, "onStop");
        Toast.makeText(this, "ONSTOP", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v(TEXT_LOG, "onDestroy");
        Toast.makeText(this, "ONDESTROY", Toast.LENGTH_LONG).show();
    }
}
