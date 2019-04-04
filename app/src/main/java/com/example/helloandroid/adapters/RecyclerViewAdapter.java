package com.example.helloandroid.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.helloandroid.R;

import java.util.List;

/**
 * Created by roxanan on 03,April,2019
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecycleViewHolder> {
    private final List<String> data;

    public RecyclerViewAdapter(List<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View recyclerRow = layoutInflater.inflate(R.layout.item_car, viewGroup, false);
        return new RecycleViewHolder(recyclerRow);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder recycleViewHolder, int position) {
        String name = data.get(position);
        recycleViewHolder.carNameTextView.setText(name);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class RecycleViewHolder extends RecyclerView.ViewHolder {

        final TextView carNameTextView;

        RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            this.carNameTextView = itemView.findViewById(R.id.car_name);
        }
    }
}
