package com.example.user.activity_life_cycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("lifecycle","onCreate invoked");
    }

    protected void onStart()
    {
        super.onStart();
        Log.i("lifecycle","onStart invoked");

    }

    protected void onResume()
    {
        super.onResume();
        Log.i("lifecycle","onResume invoked");

    }
    protected void onPause()
    {
        super.onPause();
        Log.i("lifecycle","onPause invoked");
    }
    protected void onStop()
    {
        super.onStop();
        Log.i("lifecycle","onStop invoked");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.i("lifecycle","onRestart invoked");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i("lifecycle","onDestroy invoked");

    }
}
