package com.example.recyclerviewdemoagain;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MountainAdapter extends RecyclerView.Adapter<MountainAdapter.ViewHolder> {


    private List<String> mountains;

    public MountainAdapter(List<String> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item_template,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mountainNameTextView.setText(mountains.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
    private TextView mountainNameTextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mountainNameTextView = itemView.findViewById(R.id.mountain_name);
        }
    }
}
