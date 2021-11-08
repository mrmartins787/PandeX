package com.pandar.panderswap.wallets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.pandar.panderswap.R;
import com.pandar.panderswap.bitcoin.buy.BitCoinCheckPoint;
import com.pandar.panderswap.bitcoin.buy.BitSplash;
import com.pandar.panderswap.bitcoin.receive.ReceiveBtc;
import com.pandar.panderswap.bitcoin.sell.SellBtc;

public class Wallet extends AppCompatActivity {

    ImageView sell, buy, receive, send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        sell = (ImageView) findViewById(R.id.iconsell);
        buy = (ImageView) findViewById(R.id.iconbuy);
        receive = (ImageView) findViewById(R.id.iconreceive);
        send = (ImageView) findViewById(R.id.iconsend);


        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Wallet. this, SellBtc.class);
                startActivity(intent);
                finish();
            }
        });
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Wallet. this, BitCoinCheckPoint.class);
                startActivity(intent);
                finish();
            }
        });
        receive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Toast.makeText(Wallet.this, "Send", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Wallet. this, ReceiveBtc.class);
                startActivity(intent);
                finish();
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Wallet.this, "- Insufficient Fun -", Toast.LENGTH_SHORT).show();

            }
        });
    }
}