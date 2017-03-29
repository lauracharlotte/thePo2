package com.example.thepo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class ArtistInfo extends AppCompatActivity {

    private RecyclerView recyclerView;
    private artistAdapter curAdapter;

    TextView HyperLink;
    Spanned Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_info);
        recyclerView = (RecyclerView)findViewById(R.id.songListt);
        //LayoutManager Linear, Grid, Staggered
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        curAdapter = new artistAdapter(MockData.getListData(), this);
        recyclerView.setAdapter(curAdapter);


        TextView textView = (TextView)findViewById(R.id.bandBandCamp);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://thehapennies.bandcamp.com/'> Band Camp </a>";
        textView.setText(Html.fromHtml(text));

        TextView textView2 = (TextView)findViewById(R.id.bandSpotify);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='spotify:artist:7MO73D0T5Pkws74gpLsQ0x'> Spotify </a>";
        textView2.setText(Html.fromHtml(text2));

        TextView textView3 = (TextView)findViewById(R.id.bandSoundCloud);
        textView3.setClickable(true);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='http://halfpennies.co.uk/'> Website </a>";
        textView3.setText(Html.fromHtml(text3));

        /*HyperLink = (TextView)findViewById(R.id.bandBandCamp);

        Text = Html.fromHtml("BandCamp: " +
                "<a href='https://thehapennies.bandcamp.com/'>https://thehapennies.bandcamp.com/</a>");

        HyperLink.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink.setText(Text);*/

        /*HyperLink = (TextView)findViewById(R.id.bandSpotify);

        Text = Html.fromHtml("Band Website: " +
                "<a href='http://halfpennies.co.uk/'>http://halfpennies.co.uk/</a>");

        HyperLink.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink.setText(Text);

        HyperLink = (TextView)findViewById(R.id.bandSoundCloud);

        Text = Html.fromHtml("Spotify: " +
                "<a href='spotify:artist:7MO73D0T5Pkws74gpLsQ0x'>spotify</a>");

        HyperLink.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink.setText(Text);*/
    }
}
