package com.pandar.panderswap.bitcoin.buy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.pandar.panderswap.R;
import com.pandar.panderswap.etheruim.Etherium_check;
import com.pandar.panderswap.litecoin.Litecoin;

public class BitCoinCheckPoint extends AppCompatActivity {

    private Button litecoin,ethr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bit_coin_check_point);

        litecoin = (Button) findViewById(R.id.proceed_to_buybitcoin);
        ethr = (Button) findViewById(R.id.proceed_to_paywitheth);

        litecoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(BitCoinCheckPoint.this, "- Coming Soon -", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(BitCoinCheckPoint.this, Etherium_check.class);
                startActivity(intent);
                finish();

            }
        });

        ethr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BitCoinCheckPoint.this, Litecoin.class);
                startActivity(intent);
                finish();

            }
        });
    }
}