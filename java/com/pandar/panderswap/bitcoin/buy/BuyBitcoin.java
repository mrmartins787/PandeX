package com.pandar.panderswap.bitcoin.buy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.pandar.panderswap.HomeFragment;
import com.pandar.panderswap.R;
import com.pandar.panderswap.giftcard.Giftcard_Dashboard;
import com.pandar.panderswap.giftcard.amazon.Amazon;

public class BuyBitcoin extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {


    private EditText cardfirstName,cardlastName,cardSecuritycode, cardNumber;
    private Button card_detail_upload;
    private ProgressDialog loadingbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_bitcoin);

        Spinner months = findViewById(R.id.months);
        Spinner years= findViewById(R.id.year);

        cardfirstName =(EditText) findViewById(R.id.card_name_first);
        cardlastName =(EditText) findViewById(R.id.card_name_last);
        cardSecuritycode =(EditText) findViewById(R.id.card_security_code);
        cardNumber =(EditText) findViewById(R.id.card_write_up);


        loadingbar = new ProgressDialog(this);
        card_detail_upload = (Button) findViewById(R.id.card_catcher);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.months, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        months.setAdapter(adapter);
        months.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapteryear = ArrayAdapter.createFromResource(this,
                R.array.years, android.R.layout.simple_spinner_item);
        adapteryear.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        years.setAdapter(adapteryear);
        years.setOnItemSelectedListener(this);

        card_detail_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                placecard();
            }
        });

    }

    private void placecard() {


        String firstName = cardfirstName.getText().toString();
        String lastName = cardlastName.getText().toString();
        String cardlongnumber = cardNumber.getText().toString();
        String cardSecurity = cardSecuritycode.getText().toString();

        if (TextUtils.isEmpty(firstName))
        {
            Toast.makeText(this, "Enter First Name", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(lastName))
        {
            Toast.makeText(this, "Enter Last Name...", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(cardlongnumber))
        {
            Toast.makeText(this, "Enter Card Number", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(cardSecurity))
        {
            Toast.makeText(this, "Enter Security Code", Toast.LENGTH_SHORT).show();
        }

        else {
            loadingbar.setTitle("Switching Engines");
            loadingbar.setMessage("Please wait, while your order is being processed by engine...");
            loadingbar.setCanceledOnTouchOutside(false);
            loadingbar.show();

        }

       // ToastMessage();


    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),  text ,  Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}