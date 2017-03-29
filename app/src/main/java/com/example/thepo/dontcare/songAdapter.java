package com.example.thepo.dontcare;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.thepo.R;

import java.util.ArrayList;

/**
 * Created by laurahovey on 3/25/17.
 */

public class songAdapter extends RecyclerView.Adapter<songAdapter.ViewHolder> {

    ArrayList<String> curSongList;
    ArtistPage artistPage;

    public songAdapter(ArrayList<String> songList, ArtistPage artistPage)
    {
        curSongList = songList;
        this.artistPage = artistPage;
    }

    public void onBindViewHolder(ViewHolder curView, int spot)
    {
        curView.songName.setText(curSongList.get(spot));
        curView.bind(spot);
    }

    public int getItemCount()
    {
        return curSongList.size();
    }

    public ViewHolder onCreateViewHolder(ViewGroup curGroup, int viewType)
    {
        View v = LayoutInflater.from(artistPage.getBaseContext()).inflate(R.layout.artist_segment, curGroup, false);
        return new ViewHolder(v);
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        public int spotHolder;
        public TextView songName;
        public ViewHolder(View view)
        {
            super(view);
            songName = (TextView) view.findViewById(R.id.songTextView);
        }
        public void bind(int index)
        {
            spotHolder = index;
        }
    }

}
