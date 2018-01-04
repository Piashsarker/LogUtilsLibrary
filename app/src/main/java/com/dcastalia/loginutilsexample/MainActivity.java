package com.dcastalia.loginutilsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dcastalia.errorlogutil.LogError;
import com.dcastalia.logutil.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogDebug logDebug = new LogDebug();
        logDebug.d("MainActivity","Log From Main Activity");
        LogError.e("MainActivity","Error Log From Main Activity");

    }
}
