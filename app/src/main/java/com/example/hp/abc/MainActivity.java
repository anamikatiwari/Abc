package com.example.hp.abc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] dictionary = {"id", "name"};

        if (i == 5) {
            int id = getResources().getIdentifier("textView" + i, "id", getPackageName());
            TextView textView = (TextView) findViewById(id);
            textView.setText("id found");
        }

        else {
            int id = getResources().getIdentifier("textView" + i, "id", getPackageName());
            TextView textView = (TextView) findViewById(id);
            textView.setText("id not found");
        }

    }
}
