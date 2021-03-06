package com.example.thepo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recView;
    private BrowseAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recView = (RecyclerView)findViewById(R.id.browseactivity);
        //LayoutManager: Linear Layout or Grid or Staggered grid
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new BrowseAdapter(MockData.getBrowseData(), this);
        recView.setAdapter(adapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

//    recView.addOnItemTouchListener(
//        new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
//            @Override public void onItemClick(View view, int position) {
//            // TODO Handle item click
//            }
//        })
//    );

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

//    public void clickMeCard(View v)
//    {
//        Intent i = new Intent(MainActivity.this, Tab2Radio.class);
//        startActivity(i);
//    }
    public void radioButtonClick(MenuItem v)
    {
        Intent i = new Intent(MainActivity.this, Tab2Radio.class);
        startActivity(i);
    }
    public void uploadButtonClick(MenuItem v)
    {
        Intent i = new Intent(MainActivity.this, Tab3Upload.class);
        startActivity(i);
    }
    public void browseButtonClick(MenuItem v)
    {
        Snackbar.make(findViewById(R.id.browseitem), "You're currently on the browse(Genres) page!",
                Snackbar.LENGTH_SHORT).show();
    }

//    public void clickMe(View v)
//    {
//        Intent i = new Intent(MainActivity.this, ArtistInfo.class);
//        startActivity(i);
//    }
//    public void clickMeBrowse(View v)
//    {
//        Intent i = new Intent(MainActivity.this, BrowseStations.class);
//        startActivity(i);
//    }
//    public void clickMeUpload(View v)
//    {
//        Intent i = new Intent(MainActivity.this, Tab3Upload.class);
//        startActivity(i);
//    }
//    public void clickMeRadio(View v)
//    {
//        Intent i = new Intent(MainActivity.this, Tab2Radio.class);
//        startActivity(i);
//    }
}
