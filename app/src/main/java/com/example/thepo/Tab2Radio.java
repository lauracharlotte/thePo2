package com.example.thepo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class Tab2Radio extends AppCompatActivity {

    private TextView selectedSong = null;

    private SeekBar seekbar = null;
    private MediaPlayer mp = null;
    private ImageButton playBtn = null;
    private ImageButton prevBtn = null;
    private ImageButton nextBtn = null;

    private boolean isStarted = true;
    private String curFile = "";
    private boolean isMovingSeekbar = false;

    private final Handler handler = new Handler();

    private final Runnable updatePositionRunnable = new Runnable() {
        @Override
        public void run() {
//            updatePosition();
        }
    };

    MediaPlayer mySound;

    @Override
    protected void onPause()
    {
        super.onPause();
        mySound.release();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //View rootView = inflater.inflate(R.layout.tab2_radio, container, false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab2_radio);

        ImageButton imgbutton = (ImageButton) findViewById(R.id.play);
        imgbutton.setImageResource(android.R.drawable.ic_media_pause);

        mySound = MediaPlayer.create(this, R.raw.bensoundmemories);
        mySound.start();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void clickMeArtist(View v)
    {
        Intent i = new Intent(Tab2Radio.this, ArtistInfo.class);
        startActivity(i);
    }

    public void radioButtonClick(MenuItem v)
    {
        Snackbar.make(findViewById(R.id.radio_layout), "You're currently on the radio page!",
                Snackbar.LENGTH_SHORT).show();
    }

    public void uploadButtonClick(MenuItem v)
    {
        Intent i = new Intent(Tab2Radio.this, Tab3Upload.class);
        startActivity(i);
    }
    public void browseButtonClick(MenuItem v)
    {
        Intent i = new Intent(Tab2Radio.this, MainActivity.class);
        startActivity(i);
    }



    public void playMusic(View view) {
        if(mySound.isPlaying())
        {
            mySound.pause();
            ImageButton imgbutton = (ImageButton) findViewById(R.id.play);
            imgbutton.setImageResource(android.R.drawable.ic_media_play);
        }
        else
        {
            mySound.start();
            ImageButton imgbutton = (ImageButton) findViewById(R.id.play);
            imgbutton.setImageResource(android.R.drawable.ic_media_pause);
        }
    }
}