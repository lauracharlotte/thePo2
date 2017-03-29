package com.example.thepo.dontcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.thepo.R;
import com.example.thepo.dontcare.songAdapter;

import java.util.ArrayList;

public class ArtistPage extends AppCompatActivity {

    private RecyclerView songRecycler;
    private songAdapter adapter;
    private RecyclerView.LayoutManager songLayout;
    private ArrayList<String> songList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_page);
        songRecycler = (RecyclerView) findViewById(R.id.songRecyleText);
        ((LinearLayoutManager)songLayout).setOrientation(LinearLayoutManager.VERTICAL);
        songLayout = new LinearLayoutManager(this);
        songRecycler.setLayoutManager(songLayout);
        songList.add("Some song");
        adapter = new songAdapter(songList, this);
        songRecycler.setAdapter(adapter);
    }

}
