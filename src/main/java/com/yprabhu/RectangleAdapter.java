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
        Rectangle rectangle = rectangleList.get(position);
        View view = viewHolder.rectangleView;
        if (position % 3 == 0) {
            view.setBackgroundColor(context.getResources().getColor(R.color.colorPrimaryDark));
        } else {
            view.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
        }
    }

    @Override
    public int getItemCount() {
        return rectangleList.size();
    }
}