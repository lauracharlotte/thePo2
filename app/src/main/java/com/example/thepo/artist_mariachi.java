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

public class artist_mariachi extends AppCompatActivity {

    TextView HyperLink;
    Spanned Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_mariachi);

        TextView textView = (TextView)findViewById(R.id.mariachi_Cloud);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "Website: <br /><br /><a href='http://www.georgestrait.com/'>http://www.georgestrait.com/</a>";
        textView.setText(Html.fromHtml(text));

        TextView textView2 = (TextView)findViewById(R.id.mariachi_spotify);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "Spotify: <br /><br /><a href='spotify:artist:5vngPClqofybhPERIqQMYd'>George Strait on Spotify</a>";
        textView2.setText(Html.fromHtml(text2));

        TextView textView4 = (TextView)findViewById(R.id.mariachi_info);
        String text4 = "George Harvey Strait (born May 18, 1952) is an American country music singer, songwriter, actor, and music producer. " +
                "He is known as the \"King of Country\" and is considered one of the most influential and popular recording artists of all time." +
                " He is known for his neotraditionalist country style, cowboy look, and being one of the first and main country artists to bring country music back to its roots and away from the pop country era in the 1980s.";
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
        Intent i = new Intent(artist_mariachi.this, radio_mariachi.class);
        startActivity(i);
    }

    public void uploadButtonClick(MenuItem v)
    {
        Intent i = new Intent(artist_mariachi.this, Tab3Upload.class);
        startActivity(i);
    }
    public void browseButtonClick(MenuItem v)
    {
        Intent i = new Intent(artist_mariachi.this, MainActivity.class);
        startActivity(i);
    }
}
