package com.example.lab_3_3;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.animal, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.birds:
                this.setContentView(R.layout.bird_layout);
                return true;
            case R.id.mammals:
                this.setContentView(R.layout.mammal_layout);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void huuhkajaTalk(View view)
    {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.huuhkaja_norther_eagle_owl);
        mediaPlayer.start();
    }
    public void peippoTalk(View view)
    {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.peippo_chaffinch);
        mediaPlayer.start();
    }
    public void peukaloinenTalk(View view)
    {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.peukaloinen_wren);
        mediaPlayer.start();
    }
    public void punatulkkuTalk(View view)
    {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.punatulkku_northern_bullfinch);
        mediaPlayer.start();
    }
    public void bearTalk(View view)
    {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.bear);
        mediaPlayer.start();
    }
    public void lambTalk(View view)
    {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.lamb);
        mediaPlayer.start();
    }
    public void elephantTalk(View view)
    {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
        mediaPlayer.start();
    }
    public void wolfTalk(View view)
    {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.wolf);
        mediaPlayer.start();
    }
}