package com.example.thepo;

/**
 * Created by laurahovey on 3/28/17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

public class Tab3Upload extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //View rootView = inflater.inflate(R.layout.tab3_upload, container, false);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab3_upload);

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


}