package com.yprabhu;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Rectangle> rectangles;
    private static final int GRID_NUM_OF_COLUMNS = 2;
    private static final int GRID_NUM_OF_ITEMS = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        rectangles = Rectangle.createListOfRectangles(GRID_NUM_OF_ITEMS);
        RectangleAdapter adapter = new RectangleAdapter(this, rectangles);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, GRID_NUM_OF_COLUMNS));
    }
}
