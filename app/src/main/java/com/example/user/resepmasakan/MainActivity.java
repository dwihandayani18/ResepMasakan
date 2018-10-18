package com.example.user.resepmasakan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    String[] names={"Nasi Goreng","Rendang","Spaghetti","Takoyaki","Seblak"};
    String[] describe={"Nasi goreng adalah makanan berupa nasi yang digoreng dalam minyak goreng/margarin, biasanya ditambah kecap manis, telur, ayam dan kerupuk.",
            "Rendang adalah masakan daging bercita rasa pedas yang menggunakan campuran dari berbagai bumbu dan rempah-rempah.",
            "Spaghetti adalah salah satu jenis pasta yang berbentuk panjang, tipis, silindris, dan padat dan di sajikan dengan berbagai macam sauce.",
            "Takoyaki adalah makanan asal Jepang, berbentuk bola-bola kecil yang dibuat dari adonan tepung terigu diisi potongan seafood di dalamnya.",
            "Seblak adalah makanan khas Sunda yang bercita rasa gurih dan pedas, terbuat dari kerupuk basah yang dimasak dengan bumbu tertentu."};
    int[] images={R.drawable.nasgor,R.drawable.rendang,R.drawable.spaghetti,R.drawable.takoyaki,R.drawable.seblak};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView rv = (RecyclerView) findViewById(R.id.myRecycler);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());

        ResepAdapter adapter = new ResepAdapter(this,names,describe,images);
        rv.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
