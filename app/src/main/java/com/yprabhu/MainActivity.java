package com.yprabhu;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button gridBtn = findViewById(R.id.grid);
        final Button textBtn = findViewById(R.id.text);

        gridBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(GridActivity.newIntent(getApplicationContext()));
            }
        });

        textBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(TextActivity.newIntent(getApplicationContext()));
            }
        });
    }
}
