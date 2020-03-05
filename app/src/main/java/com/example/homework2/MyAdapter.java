package com.example.homework2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    List<Item> friendlists;

    public MyAdapter(ArrayList<Item> flist){
        friendlists = flist;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;
        public ViewHolder(View itemview){
            super(itemview);
            imageView = itemview.findViewById(R.id.profile);
            textView = itemview.findViewById(R.id.friendname);
        }
    }
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.friendview, parent, false);
        MyAdapter.ViewHolder viewHolder = new MyAdapter.ViewHolder(v);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = friendlists.get(position);
        holder.imageView.setImageDrawable(item.getProfile());
        holder.textView.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return friendlists.size();
    }

}
