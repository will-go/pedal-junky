package com.wgcorp.pedaljunky;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "extra_message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void scanBtleDevices(View view) {
        Intent intent = new Intent(this, DeviceScanActivity.class);
        startActivity(intent);
    }

    /**
     * Called when the user taps the Send button
     */
    public void scanAntDevices(View view) {
        Intent intent = new Intent(this, AntDeviceScanActivity.class);
        startActivity(intent);
    }
}
