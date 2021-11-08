package com.pandar.panderswap.giftcard.amex;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pandar.panderswap.R;

public class Amex extends AppCompatActivity {

    private EditText card_amount;
    private Button proceed;
    private ProgressDialog loadingbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amex);

        card_amount=(EditText) findViewById(R.id.gift_card_amount);
        proceed=(Button) findViewById(R.id.submit_card);

        loadingbar = new ProgressDialog(this);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upload();
            }
        });
    }

    private void upload() {
        String input = card_amount.getText().toString();

        if (input.isEmpty())
        {
            Toast.makeText(this, "Enter card amount", Toast.LENGTH_SHORT).show();

        }
        else
        {
            loadingbar.setTitle("Uploading.....");
            loadingbar.setMessage("Please wait, while your order is being processed by engine...");
            loadingbar.setCanceledOnTouchOutside(false);
            loadingbar.show();
        }


    }
}