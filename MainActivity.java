package com.example.jjk;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class MainActivity extends AppCompatActivity {
    private int random;
    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;
    private SoundPool soundPool;
    private int mp3;
    private Uri mediaUri1;
    private String media1;
    private Button button;

    //public void play_mp3a(){soundPool.play(mp3,1f , 1f, 0, 0, 1f);};



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.botan);
        Jujutu jujutu = new Jujutu();

        soundPool = new SoundPool(2,AudioManager.STREAM_MUSIC,0);
        mp3 = soundPool.load(this,R.raw.se7,1);

        //media1 = "C:\\Users\\Administrator\\AndroidStudioProjects\\JJK\\app\\src\\main\\res\\raw\\itadoriikizama.wav";
        mediaPlayer1 = MediaPlayer.create(this,R.raw.itadoriikizama);
        mediaPlayer2 = MediaPlayer.create(this,R.raw.kugisakijutu);


        button.setOnClickListener(jujutu);









    }
    private class Jujutu  implements View.OnClickListener {
        @Override
        public void onClick(View view) {


            random = (int) (Math.random() * 10) + 1;
            ImageView input = findViewById(R.id.character);

            soundPool.play(mp3, 1f, 1f, 0, 0, 1f);


                switch (random) {
                    case 1:
                        input.setImageResource(R.drawable.itadori);
                        mediaPlayer1.start();
                        break;

                    case 2:
                        input.setImageResource(R.drawable.kugisaki);
                        mediaPlayer1.stop();
                        break;
                    case 3:
                        input.setImageResource(R.drawable.fusiguro);
                        mediaPlayer1.stop();

                        break;
                    case 4:

                        input.setImageResource(R.drawable.maki);
                        mediaPlayer1.stop();

                        break;
                    case 5:

                        input.setImageResource(R.drawable.panda);
                        mediaPlayer1.stop();
                        break;
                    case 6:

                        input.setImageResource(R.drawable.inumaki);
                        mediaPlayer1.stop();

                        break;
                    case 7:

                        input.setImageResource(R.drawable.gojou);
                        mediaPlayer1.stop();

                        break;
                    case 8:

                        input.setImageResource(R.drawable.nanami);
                        mediaPlayer1.stop();

                        break;
                    case 9:

                        input.setImageResource(R.drawable.meimei);
                        mediaPlayer1.stop();

                        break;
                    case 10:
                        input.setImageResource(R.drawable.toudou);
                        mediaPlayer1.stop();
                        break;


                }
        }
    }
}