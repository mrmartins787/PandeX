package com.pandar.panderswap.bitcoin.receive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.pandar.panderswap.R;
import com.pandar.panderswap.bitcoin.buy.BitCoinCheckPoint;
import com.pandar.panderswap.wallets.Wallet;

public class ReceiveBtc extends AppCompatActivity {

    private Button copybtn;
    private ImageView qrcode,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_btc);

        copybtn = (Button) findViewById(R.id.copy_address);
        qrcode = (ImageView) findViewById(R.id.qr_code);
        back = (ImageView) findViewById(R.id.back_btn);

        copybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ReceiveBtc.this, "Address Copied", Toast.LENGTH_SHORT).show();
            }
        });

        qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ReceiveBtc.this, "Address Copied", Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReceiveBtc. this, Wallet.class);
                startActivity(intent);
                finish();
            }
        });


    }
}