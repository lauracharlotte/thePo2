package com.example.thepo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class artist_kpop extends AppCompatActivity {

    TextView HyperLink;
    Spanned Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_kpop);

        TextView textView = (TextView)findViewById(R.id.kpop_Cloud);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "Website: <br /><br /><a href='https://en.wikipedia.org/wiki/Wax_(singer)'>https://en.wikipedia.org/wiki/Wax_(singer)</a>";
        textView.setText(Html.fromHtml(text));

        TextView textView2 = (TextView)findViewById(R.id.kpop_spotify);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "Spotify: Wax cannot be found on Spotify</a>";
        textView2.setText(Html.fromHtml(text2));

        TextView textView4 = (TextView)findViewById(R.id.kpop_info);
        String text4 = "Cho Hye-Ri, (born May 31, 1976), better known as Wax, is a South Korean pop singer and musical actress.";
        textView4.setText(text4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void radioButtonClick(MenuItem v)
    {
        Intent i = new Intent(artist_kpop.this, radio_kpop.class);
        startActivity(i);
    }

    public void uploadButtonClick(MenuItem v)
    {
        Intent i = new Intent(artist_kpop.this, Tab3Upload.class);
        startActivity(i);
    }
    public void browseButtonClick(MenuItem v)
    {
        Intent i = new Intent(artist_kpop.this, MainActivity.class);
        startActivity(i);
    }
}

