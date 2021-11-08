package com.pandar.panderswap;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.pandar.panderswap.bitcoin.buy.BitCoinCheckPoint;
import com.pandar.panderswap.bitcoin.sell.SellBtc;
import com.pandar.panderswap.giftcard.GiftCard_SplashScreen;
import com.pandar.panderswap.giftcard.Giftcard_Dashboard;
import com.pandar.panderswap.giftcard.amazon.Amazon;
import com.pandar.panderswap.wallets.Wallet;

public class HomeFragment extends Fragment {

    private CardView sell,buy,withdraw,gc;
    private LinearLayout virtual;
    private ImageView note,user;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);


        sell = view.findViewById(R.id.sellbitcoin);
        buy = view.findViewById(R.id.buybitcoin);
        withdraw = view.findViewById(R.id.withdraw);
        gc = view.findViewById(R.id.gift_cards);

        user = view.findViewById(R.id.user_profile);
        note = view.findViewById(R.id.notification);
        virtual = view.findViewById(R.id.virtual_cards);

        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), SellBtc.class);
                startActivity(intent);
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), BitCoinCheckPoint.class);
                startActivity(intent);
            }
        });
        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                withdraw_pop();

            }
        });
        gc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), GiftCard_SplashScreen.class);
                startActivity(intent);


            }
        });

        virtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "-Trade to Unlock-", Toast.LENGTH_SHORT).show();
            }
        });

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "-Notifications-", Toast.LENGTH_SHORT).show();
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "-User profile-", Toast.LENGTH_SHORT).show();
            }
        });


        return view;


    }

    private void withdraw_pop() {

        final Dialog popup_dialog;
        Button proceed_to_sell;
        ImageView cancel;
        Button proceed_to_giftcard;
        popup_dialog = new Dialog(getActivity());
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.withdraw_layout);
        proceed_to_giftcard = (Button) popup_dialog.findViewById(R.id.proceed_to_giftcard);
        proceed_to_sell = (Button) popup_dialog.findViewById(R.id.proceed_to_sell);
        cancel = (ImageView) popup_dialog.findViewById(R.id.cancel_with) ;


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        proceed_to_giftcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), GiftCard_SplashScreen.class);
                startActivity(intent);
            }
        });
        proceed_to_sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), SellBtc.class);
                startActivity(intent);

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup_dialog.dismiss();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }
}
