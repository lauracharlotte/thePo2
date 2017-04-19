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


public class artist_piano extends AppCompatActivity {

    TextView HyperLink;
    Spanned Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_piano);

        TextView textView = (TextView)findViewById(R.id.piano_Cloud);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "Website: <br /><br /><a href='http://yiruma.manifo.com/yiruma'>http://yiruma.manifo.com/yiruma</a>";
        textView.setText(Html.fromHtml(text));

        TextView textView2 = (TextView)findViewById(R.id.piano_spotify);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "Spotify: <br /><br /><a href='spotify:artist:0fauHpmSHwodVYIjTqOGHz'>Yiruma on Spotify</a>";
        textView2.setText(Html.fromHtml(text2));

        TextView textView4 = (TextView)findViewById(R.id.piano_info);
        String text4 = "Lee Ru-ma (Korean: 이루마; born February 15, 1978), better known by his stage name Yiruma (Korean: 이루마), is a South Korean pianist and composer. " +
                "Yiruma frequently performs at sold-out concerts in Asia, Europe and North America. His alma mater, King's College London, helped him gain European popularity and recognition. " +
                "Among his most popular pieces are \"River Flows in You\", \"Love Hurts\", \"Kiss the Rain\", and \"May Be\". Yiruma's most popular album, First Love, was released in 2001.";
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
        Intent i = new Intent(artist_piano.this, radio_piano.class);
        startActivity(i);
    }

    public void uploadButtonClick(MenuItem v)
    {
        Intent i = new Intent(artist_piano.this, Tab3Upload.class);
        startActivity(i);
    }
    public void browseButtonClick(MenuItem v)
    {
        Intent i = new Intent(artist_piano.this, MainActivity.class);
        startActivity(i);
    }
}
