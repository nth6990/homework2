package com.example.homework2;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fragment1 extends Fragment {
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private ArrayList<Item> list=null;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        recyclerView = view.findViewById(R.id.recycle);
        myAdapter = new MyAdapter(list);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        addItem(ContextCompat.getDrawable(getContext(),R.drawable.images), "a");
        return view;
    }
    public void addItem(Drawable profile, String name){
        Item item = new Item();
        item.setProfile(profile);
        item.setName(name);
        list.add(item);
    }


}
