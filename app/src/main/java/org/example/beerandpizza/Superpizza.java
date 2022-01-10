package org.example.beerandpizza;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Superpizza extends AppCompatActivity {

    private MediaPlayer mp;
    private int posicion=0;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superpizza);
        MediaPlayer mp = MediaPlayer.create(this,R.raw.faustograbacion2);
    }

    public void iniciar(View v){
        destruir();
        mp = MediaPlayer.create(this, R.raw.faustograbacion2);
        mp.start();
    }
    public void destruir(){
        if(mp != null)
            mp.release();

    }

    public void pausar(View v){
        if(mp != null && mp.isPlaying()){
            posicion = mp.getCurrentPosition();
            mp.pause();
        }
    }

}