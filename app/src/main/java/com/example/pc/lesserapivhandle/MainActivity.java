package com.example.pc.lesserapivhandle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Build;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myText = (TextView) findViewById(R.id.myText);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M)
        {
           myText.setText("SORRY YOU CANNOT EAT MARSHMALLOWS AND NOUGATS ");
        }
        else
        {
            myText.setText("HAVE SOME MARSHMALLOWS AND NOUGATS");
        }

    }
}
