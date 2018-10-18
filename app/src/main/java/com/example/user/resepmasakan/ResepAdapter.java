package com.example.user.resepmasakan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ResepAdapter extends RecyclerView.Adapter<ResepHolder> {

    Context c;
    String[] players;
    String[] describe;
    int[] images;

    public ResepAdapter(Context ctx, String[] players, String[] describe, int[] images){
        this.c=ctx;
        this.players=players;
        this.describe=describe;
        this.images=images;
    }

    @Override
    public ResepHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);

        ResepHolder holder = new ResepHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(ResepHolder holder, final int describes) {
        holder.nameTxt.setText(players[describes]);
        holder.posTxt.setText(describe[describes]);
        holder.img.setImageResource(images[describes]);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {

                //INTENT OBJ
                Intent i=new Intent(c,DetailActivity.class);

                //ADD DATA TO OUR INTENT
                i.putExtra("Name",players[describes]);
                i.putExtra("Describe",describe[describes]);
                i.putExtra("Image",images[describes]);

                //START DETAIL ACTIVITY
                c.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return players.length;
    }
}
