package com.example.concepcion;
import android.content.Intent;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;
public class MainActivity extends AppCompatActivity {
    //aqui vammos a poner LOS ATRIBUTOS=VARIABLES
    MediaPlayer cancion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cancion = MediaPlayer.create(this, R.raw.turisa);
        cancion.start();
        //temporizar el lanzamiento de la cancion
        TimerTask inicioAPP = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }

        };
        Timer tiempo = new Timer();
        tiempo.schedule(inicioAPP, 10000);
    }
}