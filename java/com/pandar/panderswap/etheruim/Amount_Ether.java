package com.pandar.panderswap.etheruim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pandar.panderswap.R;

public class Amount_Ether extends AppCompatActivity {

    private Button scan_either;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount__ether);

        scan_either =(Button) findViewById(R.id.proceed_to_scaneither);

        scan_either.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Amount_Ether.this, Sell_etheruim.class);
                startActivity(intent);
                finish();
            }
        });
    }
}