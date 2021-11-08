package com.pandar.panderswap.bitcoin.buy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.pandar.panderswap.AuthArea.LoginPage;
import com.pandar.panderswap.R;
import com.pandar.panderswap.SplashScreen;

public class BitSplash extends AppCompatActivity {

    ImageView imageView;
    Animation animation;
   // TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bit_splash);

        imageView = findViewById(R.id.image_logo);
       // textView = findViewById(R.id.x);

        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        imageView.startAnimation(animation);

        //textView.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BitSplash.this, BuyBitcoin.class);
                startActivity(intent);
                finishAffinity();
            }
        }, 6000);

    }
}