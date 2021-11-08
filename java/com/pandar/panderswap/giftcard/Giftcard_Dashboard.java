package com.pandar.panderswap.giftcard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.pandar.panderswap.R;
import com.pandar.panderswap.giftcard.amazon.Amazon;
import com.pandar.panderswap.giftcard.amex.Amex;

public class Giftcard_Dashboard extends AppCompatActivity {

   private   ImageView amex,amazon,steam,apple,ebay,foot,
                                    google,itunes,jcpeeney,macy,nike,nordstorm,
                                    sephora,target, vaniila,visa,wallmart,funds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giftcard__dashboard);

        amex =(ImageView) findViewById(R.id.amex);
        amazon =(ImageView) findViewById(R.id.amazon);

        steam =(ImageView) findViewById(R.id.steam);
        apple =(ImageView) findViewById(R.id.apple);
        ebay =(ImageView) findViewById(R.id.ebay);
        foot =(ImageView) findViewById(R.id.foot);
        google =(ImageView) findViewById(R.id.goggle);
        jcpeeney =(ImageView) findViewById(R.id.penny);
        macy =(ImageView) findViewById(R.id.macy);
        nike =(ImageView) findViewById(R.id.nike);
        nordstorm =(ImageView) findViewById(R.id.nord);
        sephora =(ImageView) findViewById(R.id.seph);
        target =(ImageView) findViewById(R.id.target);
        vaniila =(ImageView) findViewById(R.id.vanilaa);
        visa =(ImageView) findViewById(R.id.visa);
        funds =(ImageView) findViewById(R.id.fund);
        wallmart =(ImageView) findViewById(R.id.walmart);
        itunes =(ImageView) findViewById(R.id.itunes);


                amex.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Amex_pop();
                    }
                });
        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Amazon_Pop();

            }
        });

        ////////////////////////////

        itunes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Itunes_Pop();

            }
        });
        steam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Steam_Pop();

            }
        });
        target.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Target_Pop();

            }
        });
        sephora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sephora_Pop();

            }
        });
        nordstorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nordstorm_Pop();

            }
        });
        ebay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ebay_Pop();

            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Google_Pop();

            }
        });
        macy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Macy_Pop();

            }
        });
        nike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nike_Pop();

            }
        });
        foot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Foot_Pop();

            }
        });
        funds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Funds_Pop();

            }
        });
        vaniila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vanilla_Pop();

            }
        });
        visa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Visa_Pop();

            }
        });

        wallmart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Wallmart_Pop();

            }
        });
        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Apple_Pop();

            }
        });
        jcpeeney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Jcpenney_Pop();

            }
        });







    }

    private void Jcpenney_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.jcpeeny_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);

    }

    private void Apple_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.apple);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Wallmart_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.walmart_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Visa_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.visa_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Vanilla_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.vanilla_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Funds_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.funds_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Foot_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.foot);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Nike_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.nike_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Macy_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.macy_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Google_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.google_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Ebay_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.ebay);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Nordstorm_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.nordstorm_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Sephora_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.sephora);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Target_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.target_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Steam_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.steam_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Itunes_Pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.itune_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Amex_pop() {
        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.amex);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }

    private void Amazon_Pop() {

        final Dialog popup_dialog;
        Button btn_continue;
        ImageView iv_close;
        popup_dialog = new Dialog(Giftcard_Dashboard.this);
        popup_dialog.show();
        popup_dialog.setContentView(R.layout.amazon_pop);
        iv_close = (ImageView) popup_dialog.findViewById(R.id.ic_close);
        btn_continue = (Button) popup_dialog.findViewById(R.id.proceed_amazon);


        //set dialog width and height
        popup_dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);

        //set transparent background

        popup_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //set animation
        popup_dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;
        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup_dialog.dismiss();
            }
        });
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Giftcard_Dashboard.this,Amazon.class);
                startActivity(intent);
                finish();
            }
        });
        popup_dialog.setCanceledOnTouchOutside(false);
        popup_dialog.setCancelable(false);
    }



    
    
}