package com.pandar.panderswap.bitcoin.sell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.pandar.panderswap.R;
import com.pandar.panderswap.wallets.Wallet;

public class SellBtcAdd extends AppCompatActivity {

    private ImageView copy,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_btc_add);

        copy = (ImageView) findViewById(R.id.copy_address);
        back = (ImageView) findViewById(R.id.back_btn);

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SellBtcAdd.this, "-copied-", Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellBtcAdd. this, SellBtc.class);
                startActivity(intent);
                finish();
            }
        });


    }
}