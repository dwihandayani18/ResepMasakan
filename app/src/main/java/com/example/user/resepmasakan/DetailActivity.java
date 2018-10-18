package com.example.user.resepmasakan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView nameTxt, posTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent i = getIntent();

        final String name = i.getExtras().getString("Name");
        final String pos = i.getExtras().getString("Describe");
        final int image = i.getExtras().getInt("Image");

        img = (ImageView) findViewById(R.id.playerImage);
        nameTxt = (TextView) findViewById(R.id.nameTxt);
        posTxt = (TextView) findViewById(R.id.posTxt);

        img.setImageResource(image);
        nameTxt.setText("NAMA : "+name);
        posTxt.setText("DESCRIBE : "+pos);
    }
}
