package com.example.thepo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

public class BrowseStations extends AppCompatActivity {

    private RecyclerView recView;
    private BrowseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_stations);
        recView = (RecyclerView)findViewById(R.id.browseactivity);
        //LayoutManager: Linear Layout or Grid or Staggered grid
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new BrowseAdapter(MockData.getBrowseData(), this);
        recView.setAdapter(adapter);
    }
    public void clickMeCard(View v)
    {
        Intent i = new Intent(BrowseStations.this, Tab2Radio.class);
        startActivity(i);
    }
}
