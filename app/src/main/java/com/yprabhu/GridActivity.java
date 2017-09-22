package com.yprabhu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    ArrayList<Rectangle> rectangles;
    private static final int GRID_NUM_OF_COLUMNS = 2;
    private static final int GRID_NUM_OF_ITEMS = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        rectangles = Rectangle.createListOfRectangles(GRID_NUM_OF_ITEMS);
        RectangleAdapter adapter = new RectangleAdapter(this, rectangles);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,
                getResources().getInteger(R.integer.grid_number_of_columns)));
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, GridActivity.class);
    }
}
