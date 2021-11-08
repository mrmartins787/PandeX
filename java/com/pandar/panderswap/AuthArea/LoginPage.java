package com.pandar.panderswap.AuthArea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pandar.panderswap.MainActivity;
import com.pandar.panderswap.R;

public class LoginPage extends AppCompatActivity {

    ImageView imageLogin;
    TextView register_text;
    Button Sign_Btn;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        imageLogin = findViewById(R.id.image_login);
        register_text = findViewById(R.id.signup_text);
        Sign_Btn = findViewById(R.id.signin_btn);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);

        imageLogin.setAnimation(animation);
        register_text.setAnimation(animation);
        Sign_Btn.setAnimation(animation);

        imageLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(LoginPage.this, "Welcome", Toast.LENGTH_SHORT).show();
            }
        });

        Sign_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(LoginPage.this, "Welcome Home", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        register_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(LoginPage.this, "Register", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginPage.this, RegisterPage.class);
                startActivity(intent);
            }
        });
    }
}