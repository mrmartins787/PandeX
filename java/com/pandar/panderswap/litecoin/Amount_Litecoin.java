package com.pandar.panderswap.litecoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pandar.panderswap.R;

public class Amount_Litecoin extends AppCompatActivity {

    private Button scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount__litecoin);

        scan = (Button) findViewById(R.id.proceed_to_paylite);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Amount_Litecoin.this, Scan_Litcoin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}