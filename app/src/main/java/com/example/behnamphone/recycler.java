package com.example.behnamphone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recycler extends RecyclerView.Adapter <recycler.recyclerviewholder> {

    @NonNull
    @Override
    public recyclerviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);
      recyclerviewholder holder = new recyclerviewholder(v);
      return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    class recyclerviewholder extends RecyclerView.ViewHolder {

        public recyclerviewholder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
