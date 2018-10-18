package com.example.user.resepmasakan;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResepHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

    ImageView img;
    TextView nameTxt;
    TextView posTxt;
    private ItemClickListener itemClickListener;

    public ResepHolder(View itemView) {
        super(itemView);

        nameTxt = (TextView) itemView.findViewById(R.id.nameTxt);
        posTxt = (TextView) itemView.findViewById(R.id.posTxt);
        img = (ImageView) itemView.findViewById(R.id.playerImage);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}
