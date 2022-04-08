package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home_Page extends AppCompatActivity {

    ImageView facebook_img,instagram_img,snapchat_img,twitter_img,linkedin_img,
              pharmaeasy_img,tata_img,netmeds_img,apollo_img,mfine_img,
              bookmy_img,redbus_img,mmt_img,irctc_img,ixigo_img,
              ola_img,uber_img,rapido_img,jugnoo_img,cabify_img,
              paytm_img,pe_img,gpay_img,bpay_img,freecharge_img,
              dlocker_img,umang_img,mygov_img,mparivahan_img,setu_img;

    LinearLayout facebook_lnr,instagram_lnr,snapchat_lnr,twitter_lnr,linkedin_lnr,
                 pharmaeasy_lnr,tata_lnr,netmeds_lnr,apollo_lnr,mfine_lnr,
                 bookmy_lnr,redbus_lnr,mmt_lnr,irctc_lnr,ixigo_lnr,
                 ola_lnr,uber_lnr,rapido_lnr,jugnoo_lnr,cabify_lnr,
                 paytm_lnr,pe_lnr,gpay_lnr,bpay_lnr,freecharge_lnr,
                 dlocker_lnr,umang_lnr,mygov_lnr,mparivahan_lnr,setu_lnr;

    String facebook,instagram,snapchat,twitter,linkedin,
            pharmaeasy,tata,netmeds,apollo,mfine,
            bookmy,redbus,mmt,irctc,ixigo,
            ola,uber,rapido,jugnoo,cabify,
            paytm,pe,gpay,bpay,freecharge,
            dlocker,umang,mygov,mparivahan,setu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        binding();

        facebook_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                facebook = "https://m.facebook.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n1",facebook);
                startActivity(intent);

            }
        });

        facebook_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                facebook = "https://m.facebook.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n1",facebook);
                startActivity(intent);

            }
        });

        instagram_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                instagram = "https://www.instagram.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n2",instagram);
                startActivity(intent);

            }
        });

        instagram_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                instagram = "https://www.instagram.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n2",instagram);
                startActivity(intent);

            }
        });

        snapchat_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                snapchat = "https://www.snapchat.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n3",snapchat);
                startActivity(intent);

            }
        });

        snapchat_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                snapchat = "https://www.snapchat.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n3",snapchat);
                startActivity(intent);

            }
        });

        twitter_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                twitter = "https://mobile.twitter.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n4",twitter);
                startActivity(intent);

            }
        });

        twitter_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                twitter = "https://mobile.twitter.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n4",twitter);
                startActivity(intent);

            }
        });

        linkedin_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linkedin = "https://linkedin.com";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n5",linkedin);
                startActivity(intent);

            }
        });

        linkedin_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linkedin = "https://linkedin.com";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n5",linkedin);
                startActivity(intent);

            }
        });

        pharmaeasy_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pharmaeasy = "https://pharmeasy.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n6",pharmaeasy);
                startActivity(intent);

            }
        });

        pharmaeasy_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pharmaeasy = "https://pharmeasy.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n6",pharmaeasy);
                startActivity(intent);

            }
        });

        tata_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tata = "https://www.1mg.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n7",tata);
                startActivity(intent);

            }
        });

        tata_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tata = "https://www.1mg.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n7",tata);
                startActivity(intent);

            }
        });

        netmeds_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                netmeds = "https://m.netmeds.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n8",netmeds);
                startActivity(intent);

            }
        });

        netmeds_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                netmeds = "https://m.netmeds.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n8",netmeds);
                startActivity(intent);

            }
        });

        apollo_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                apollo = "https://www.apollo247.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n9",apollo);
                startActivity(intent);

            }
        });

        apollo_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                apollo = "https://www.apollo247.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n9",apollo);
                startActivity(intent);

            }
        });

        mfine_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mfine = "https://www.mfine.co/amp/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n10",mfine);
                startActivity(intent);

            }
        });

        mfine_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mfine = "https://www.mfine.co/amp/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n10",mfine);
                startActivity(intent);

            }
        });

        bookmy_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bookmy = "https://in.bookmyshow.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n11",bookmy);
                startActivity(intent);

            }
        });

        bookmy_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bookmy = "https://in.bookmyshow.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n11",bookmy);
                startActivity(intent);

            }
        });

        redbus_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mmt = "https://m.redbus.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n12",mmt);
                startActivity(intent);

            }
        });

        redbus_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                redbus = "https://m.redbus.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n12",redbus);
                startActivity(intent);

            }
        });

        mmt_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mmt = "https://www.makemytrip.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n13",mmt);
                startActivity(intent);

            }
        });

        mmt_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mmt = "https://www.makemytrip.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n13",mmt);
                startActivity(intent);

            }
        });

        irctc_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                irctc = "https://www.irctc.co.in/nget/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n14",irctc);
                startActivity(intent);

            }
        });

        irctc_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                irctc = "https://www.irctc.co.in/nget/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n14",irctc);
                startActivity(intent);

            }
        });

        ixigo_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ixigo = "https://www.ixigo.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n15",ixigo);
                startActivity(intent);

            }
        });

        ixigo_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ixigo = "https://www.ixigo.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n15",ixigo);
                startActivity(intent);

            }
        });

        ola_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ola = "https://www.olacabs.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n16",ola);
                startActivity(intent);

            }
        });

        ola_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ola = "https://www.olacabs.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n16",ola);
                startActivity(intent);

            }
        });

        uber_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                uber = "https://www.uber.com/in/en/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n17",uber);
                startActivity(intent);

            }
        });

        uber_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                uber = "https://www.uber.com/in/en/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n17",uber);
                startActivity(intent);

            }
        });

        rapido_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rapido = "https://www.rapido.bike/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n18",rapido);
                startActivity(intent);

            }
        });

        rapido_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rapido = "https://www.rapido.bike/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n18",rapido);
                startActivity(intent);

            }
        });

        jugnoo_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jugnoo = "https://www.jugnoo.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n19",jugnoo);
                startActivity(intent);

            }
        });

        jugnoo_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jugnoo = "https://www.jugnoo.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n19",jugnoo);
                startActivity(intent);

            }
        });

        cabify_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cabify = "https://cabify.com/en";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n20",cabify);
                startActivity(intent);

            }
        });

        cabify_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cabify = "https://cabify.com/en";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n20",cabify);
                startActivity(intent);

            }
        });

        paytm_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                paytm = "https://paytm.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n21",paytm);
                startActivity(intent);

            }
        });

        paytm_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                paytm = "https://paytm.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n21",paytm);
                startActivity(intent);

            }
        });

        pe_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pe = "https://www.phonepe.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n22",pe);
                startActivity(intent);

            }
        });

        pe_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pe = "https://www.phonepe.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n22",pe);
                startActivity(intent);

            }
        });

        gpay_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gpay = "https://pay.google.com/intl/en_in/about/?gclid=Cj0KCQjwl7qSBhD-ARIsACvV1X0gshhPd02uv4EMzgY9bH8IyN_Clpk10GFfqQyoLjMJ6ALUmGUyUEQaAue-EALw_wcB&gclsrc=aw.ds";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n23",gpay);
                startActivity(intent);

            }
        });

        gpay_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gpay = "https://pay.google.com/intl/en_in/about/?gclid=Cj0KCQjwl7qSBhD-ARIsACvV1X0gshhPd02uv4EMzgY9bH8IyN_Clpk10GFfqQyoLjMJ6ALUmGUyUEQaAue-EALw_wcB&gclsrc=aw.ds";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n23",gpay);
                startActivity(intent);

            }
        });

        bpay_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bpay = "https://bharatpe.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n24",bpay);
                startActivity(intent);

            }
        });

        bpay_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bpay = "https://bharatpe.com/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n24",bpay);
                startActivity(intent);

            }
        });

        freecharge_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                freecharge = "https://www.freecharge.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n25",freecharge);
                startActivity(intent);

            }
        });

        freecharge_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                freecharge = "https://www.freecharge.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n25",freecharge);
                startActivity(intent);

            }
        });

        dlocker_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dlocker = "https://www.digilocker.gov.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n26",dlocker);
                startActivity(intent);

            }
        });

        dlocker_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dlocker = "https://www.digilocker.gov.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n26",dlocker);
                startActivity(intent);

            }
        });

        umang_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                umang = "https://web.umang.gov.in/landing/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n27",umang);
                startActivity(intent);

            }
        });

        umang_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                umang = "https://web.umang.gov.in/landing/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n27",umang);
                startActivity(intent);

            }
        });

        mygov_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mygov = "https://www.mygov.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n28",mygov);
                startActivity(intent);

            }
        });

        mygov_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mygov = "https://www.mygov.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n28",mygov);
                startActivity(intent);

            }
        });

        mparivahan_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mparivahan = "https://parivahan.gov.in/parivahan//en/content/mparivahan";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n29",mparivahan);
                startActivity(intent);

            }
        });

        mparivahan_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mparivahan = "https://parivahan.gov.in/parivahan//en/content/mparivahan";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n29",mparivahan);
                startActivity(intent);

            }
        });

        setu_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setu = "https://www.aarogyasetu.gov.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n30",setu);
                startActivity(intent);

            }
        });

        setu_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setu = "https://www.aarogyasetu.gov.in/";
                Intent intent = new Intent(Home_Page.this,Web_View.class);
                intent.putExtra("n30",setu);
                startActivity(intent);

            }
        });




    }

    private void binding() {

        facebook_img = findViewById(R.id.facebook_img);
        facebook_lnr = findViewById(R.id.facebook_lnr);
        instagram_img = findViewById(R.id.instagram_img);
        instagram_lnr = findViewById(R.id.instagram_lnr);
        snapchat_img = findViewById(R.id.snapchat_img);
        snapchat_lnr = findViewById(R.id.snapchat_lnr);
        twitter_img = findViewById(R.id.twitter_img);
        twitter_lnr = findViewById(R.id.twitter_lnr);
        linkedin_img = findViewById(R.id.linkedin_img);
        linkedin_lnr = findViewById(R.id.linkedin_lnr);
        pharmaeasy_img = findViewById(R.id.pharmaeasy_img);
        pharmaeasy_lnr = findViewById(R.id.pharmaeasy_lnr);
        tata_img = findViewById(R.id.tata_img);
        tata_lnr = findViewById(R.id.tata_lnr);
        netmeds_img = findViewById(R.id.netmeds_img);
        netmeds_lnr = findViewById(R.id.netmeds_lnr);
        apollo_img = findViewById(R.id.apollo_img);
        apollo_lnr = findViewById(R.id.apollo_lnr);
        mfine_img = findViewById(R.id.mfine_img);
        mfine_lnr = findViewById(R.id.mfine_lnr);
        bookmy_img = findViewById(R.id.bookmy_img);
        bookmy_lnr = findViewById(R.id.bookmy_lnr);
        redbus_img = findViewById(R.id.redbus_img);
        redbus_lnr = findViewById(R.id.redbus_lnr);
        mmt_img = findViewById(R.id.mmt_img);
        mmt_lnr = findViewById(R.id.mmt_lnr);
        irctc_img = findViewById(R.id.irctc_img);
        irctc_lnr = findViewById(R.id.irctc_lnr);
        ixigo_img = findViewById(R.id.ixigo_img);
        ixigo_lnr = findViewById(R.id.ixigo_lnr);
        ola_img = findViewById(R.id.ola_img);
        ola_lnr = findViewById(R.id.ola_lnr);
        uber_img = findViewById(R.id.uber_img);
        uber_lnr = findViewById(R.id.uber_lnr);
        rapido_img = findViewById(R.id.rapido_img);
        rapido_lnr = findViewById(R.id.rapido_lnr);
        jugnoo_img = findViewById(R.id.jugnoo_img);
        jugnoo_lnr = findViewById(R.id.jugnoo_lnr);
        cabify_img = findViewById(R.id.cabify_img);
        cabify_lnr = findViewById(R.id.cabify_lnr);
        paytm_img = findViewById(R.id.paytm_img);
        paytm_lnr = findViewById(R.id.paytm_lnr);
        pe_img = findViewById(R.id.pe_img);
        pe_lnr = findViewById(R.id.pe_lnr);
        gpay_img = findViewById(R.id.gpay_img);
        gpay_lnr = findViewById(R.id.gpay_lnr);
        bpay_img = findViewById(R.id.bpay_img);
        bpay_lnr = findViewById(R.id.bpay_lnr);
        freecharge_img = findViewById(R.id.freecharge_img);
        freecharge_lnr = findViewById(R.id.freecharge_lnr);
        dlocker_img = findViewById(R.id.dlocker_img);
        dlocker_lnr = findViewById(R.id.dlocker_lnr);
        umang_img = findViewById(R.id.umang_img);
        umang_lnr = findViewById(R.id.umang_lnr);
        mygov_img = findViewById(R.id.mygov_img);
        mygov_lnr = findViewById(R.id.mygov_lnr);
        mparivahan_img = findViewById(R.id.mparivahan_img);
        mparivahan_lnr = findViewById(R.id.mparivahan_lnr);
        setu_img = findViewById(R.id.setu_img);
        setu_lnr = findViewById(R.id.setu_lnr);






    }
}