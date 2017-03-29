package com.example.thepo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmptyRadioPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_radio_page);
    }
    public void clickMeRadio(View v)
    {
        Intent i = new Intent(EmptyRadioPage.this, ArtistInfo.class);
        startActivity(i);
    }
}
