package com.yprabhu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RectangleAdapter extends RecyclerView.Adapter<RectangleAdapter.ViewHolder> {

    private Context context;
    private List<Rectangle> rectangleList;

    public RectangleAdapter(Context context, List<Rectangle> rectangleList) {
        this.context = context;
        this.rectangleList = rectangleList;
    }

    private Context getContext() {
        return context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View rectangleView;

        public ViewHolder(View view) {
            super(view);
            rectangleView = view.findViewById(R.id.rectangle);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View rectangleView = inflater.inflate(R.layout.view_grid_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(rectangleView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        View view = viewHolder.rectangleView;
        int count = 4;
        if (position % count == 1) {
            view.setBackgroundColor(getContext().getResources().getColor(R.color.pink));
        } else if (position % count == 2) {
            view.setBackgroundColor(getContext().getResources().getColor(R.color.green));
        } else if (position % count == 3) {
            view.setBackgroundColor(getContext().getResources().getColor(R.color.yellow));
        } else if (position % count == 4) {
            view.setBackgroundColor(getContext().getResources().getColor(R.color.blue));
        }
    }

    @Override
    public int getItemCount() {
        return rectangleList.size();
    }
}