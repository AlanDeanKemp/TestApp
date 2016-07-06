package com.simprints.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.simprints.testlib.TestLib;

public class MainActivity extends AppCompatActivity {

    private TextView libraryName;
    private TextView versionCode;
    private TextView versionName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        libraryName = (TextView) findViewById(R.id.libraryName);
        libraryName.setText("Library name: " + TestLib.getLibraryName());

        versionCode = (TextView) findViewById(R.id.versionCode);
        versionCode.setText("Library version code: " + TestLib.getVersionCode());

        versionName = (TextView) findViewById(R.id.versionName);
        versionName.setText("Library version name: " + TestLib.getVersionName());
    }
}
