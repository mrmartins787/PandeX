package com.pandar.panderswap.etheruim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.pandar.panderswap.R;
import com.pandar.panderswap.bitcoin.buy.BitCoinCheckPoint;
import com.pandar.panderswap.bitcoin.sell.SellBtc;

public class Etherium_check extends AppCompatActivity {

    private ImageView cancel;
    private Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etherium_check);
        cancel = (ImageView) findViewById(R.id.cancel_button);
        proceed = (Button) findViewById(R.id.proceed_to_paywitheth);

                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Etherium_check.this, BitCoinCheckPoint.class);
                        startActivity(intent);
                        finish();
                    }
                });

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Etherium_check.this, Amount_Ether.class);
                startActivity(intent);
                finish();
            }
        });

    }
}