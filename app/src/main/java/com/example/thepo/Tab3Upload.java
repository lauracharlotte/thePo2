package com.example.thepo;

/**
 * Created by laurahovey on 3/28/17.
 */

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Environment;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;

public class Tab3Upload extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private MediaRecorder mediaRecorder;
    String outputFile;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //View rootView = inflater.inflate(R.layout.tab3_upload, container, false);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab3_upload);

        outputFile = Environment.getExternalStorageDirectory() + "/audiorecorder.3gpp";

        Spinner genres_options = (Spinner)findViewById(R.id.spinner_genres);
        genres_options.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //this is where I choose how to handle what's been selected.
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


       // return rootView;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void radioButtonClick(MenuItem v)
    {
        Intent i = new Intent(Tab3Upload.this, Tab2Radio.class);
        startActivity(i);
    }

    public void uploadButtonClick(MenuItem v)
    {
        Snackbar.make(findViewById(R.id.upload_layout), "You're currently on the upload page!",
                Snackbar.LENGTH_SHORT).show();
    }

    public void browseButtonClick(MenuItem v)
    {
        Intent i = new Intent(Tab3Upload.this, MainActivity.class);
        startActivity(i);
    }

    public void finishClicked(View v){
        Snackbar.make(findViewById(R.id.upload_layout), "Sorry, this feature doesn't exist yet.",
                Snackbar.LENGTH_SHORT).show();
    }

    public void browseFile(View v){
        Snackbar.make(findViewById(R.id.upload_layout), "Sorry, this feature doesn't exist yet.",
                Snackbar.LENGTH_SHORT).show();
    }


    public void actuallyRecord (View view ) throws Exception
    {
        if(mediaRecorder != null)
        {
            mediaRecorder.release();
        }
        File outFile = new File(outputFile);
        if(outFile.exists())
        {
            outFile.delete();
        }
        mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
        mediaRecorder.setOutputFile(outputFile);

        mediaRecorder.prepare();
        mediaRecorder.start();
        //Toast.makeText(this, "Recording started", Toast.LENGTH_SHORT).show();
    }
    public void stopRecord(View view)
    {
        if(mediaRecorder != null)
        {
            mediaRecorder.stop();
        }
        Toast.makeText(this, "Recording stopped", Toast.LENGTH_SHORT).show();
    }
    public void playBack(View view) throws Exception
    {
        if(mediaPlayer != null)
        {
            mediaPlayer.release();
        }
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setDataSource(outputFile);
        mediaPlayer.prepare();
        mediaPlayer.start();
    }
    public void stopPlaying(View view)
    {
        if(mediaPlayer != null)
        {
            mediaPlayer.stop();
        }
    }

}