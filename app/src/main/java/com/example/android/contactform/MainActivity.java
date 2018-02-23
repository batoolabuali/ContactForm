package com.example.android.contactform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollview);
//        int totalHeight = scrollView.getChildAt(0).getHeight();
//        scrollView.setLayoutParams(new RelativeLayout.LayoutParams(
//                LinearLayout.LayoutParams.FILL_PARENT, totalHeight));
    }
}
