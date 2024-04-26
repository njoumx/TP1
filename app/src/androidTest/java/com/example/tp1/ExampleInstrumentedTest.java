package com.example.tp1;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;


        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int nCount = 0;
    private TextView nshowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nshowCount = findViewById(R.id.textView);
    }

    public void showtoast(View view) {
        Toast.makeText(this, "button toast clicked", Toast.LENGTH_SHORT).show();
    }

    public void countup(View view) {
        ++nCount;
        if (nshowCount != null)
            nshowCount.setText(Integer.toString(nCount));
