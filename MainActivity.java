package com.example.jjk;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.botan);
        Jujutu jujutu = new Jujutu();
        button.setOnClickListener(jujutu);


    }

    private class Jujutu implements View.OnClickListener {
        @Override
        public void onClick(View view) {


            int random = (int)(Math.random() * 10) + 1;
            ImageView input = findViewById(R.id.character);

            if(random == 1){
                //ImageView input = findViewById(R.id.character);

                input.setImageResource(R.drawable.itadori);

            }else if(random == 2){
                //ImageView input = findViewById(R.id.character);
                input.setImageResource(R.drawable.kugisaki);

            }else if(random == 3){
                //ImageView input = findViewById(R.id.character);
                input.setImageResource(R.drawable.fusiguro);

            }else if(random == 4){
               // ImageView input = findViewById(R.id.character);
                input.setImageResource(R.drawable.maki);

            }else if(random == 5){
                //ImageView input = findViewById(R.id.character);
                input.setImageResource(R.drawable.gojou);

            }else if(random == 6){
                //ImageView input = findViewById(R.id.character);
                input.setImageResource(R.drawable.inumaki);

            }else if(random == 7) {
                //ImageView input = findViewById(R.id.character);
                input.setImageResource(R.drawable.panda);

            }else if(random == 8){
               // ImageView input = findViewById(R.id.character);
                input.setImageResource(R.drawable.meimei);

            }else if(random == 9){
               // ImageView input = findViewById(R.id.character);
                input.setImageResource(R.drawable.nanami);

            }else if(random == 10){
               // ImageView input = findViewById(R.id.character);
                input.setImageResource(R.drawable.toudou);
            }


        }
    }
}