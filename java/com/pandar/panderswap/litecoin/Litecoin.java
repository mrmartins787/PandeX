package com.pandar.panderswap.litecoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pandar.panderswap.R;
import com.pandar.panderswap.bitcoin.buy.BitCoinCheckPoint;
import com.pandar.panderswap.etheruim.Etherium_check;

public class Litecoin extends AppCompatActivity {

    private Button litecoin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_litecoin);
        litecoin = (Button) findViewById(R.id.proceed_to_amount_litecoin);

        litecoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Litecoin.this, Amount_Litecoin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}