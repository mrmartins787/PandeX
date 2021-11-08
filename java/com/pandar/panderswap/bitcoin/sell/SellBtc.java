package com.pandar.panderswap.bitcoin.sell;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.pandar.panderswap.R;
import com.pandar.panderswap.giftcard.Giftcard_Dashboard;
import com.pandar.panderswap.giftcard.amazon.Amazon;

public class SellBtc extends AppCompatActivity {

    private EditText amount;
    private Button proceed;
    private ProgressDialog loadingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_btc);

        proceed = (Button) findViewById(R.id.proceed_to_checkpoint);
        amount = (EditText) findViewById(R.id.input_for_sell_bitcoin);

        loadingbar = new ProgressDialog(this);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellBtc. this, SellBtcAdd.class);
                startActivity(intent);
            }
        });
    }




    }


