package com.pandar.panderswap;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.pandar.panderswap.wallets.Wallet;

public class CameraFragment extends Fragment {

    private CardView btc,eth,doge,usd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_camera, container, false);

        btc = view.findViewById(R.id.bitcoin_wallet);
        eth = view.findViewById(R.id.eth_wallet);
        doge = view.findViewById(R.id.doge_wallet);

        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "-Notifications-", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getActivity(), Wallet.class);
                startActivity(intent);

            }
        });
        eth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "-Coming Soon-", Toast.LENGTH_SHORT).show();
            }
        });
        doge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "-Coming Soon-", Toast.LENGTH_SHORT).show();
            }
        });

        return view;



    }
}
