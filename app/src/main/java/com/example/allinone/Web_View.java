package com.example.allinone;

import static com.example.allinone.R.id.paytm_img;
import static com.example.allinone.R.id.web_view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Web_View extends AppCompatActivity {

    WebView web_view;
    ProgressBar progressBar;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        binding();



        String facebook = getIntent().getStringExtra("n1");
        web_view.loadUrl(facebook);


        String instagram = getIntent().getStringExtra("n2");
        web_view.loadUrl(instagram);


        String snapchat = getIntent().getStringExtra("n3");
        web_view.loadUrl(snapchat);

        String twitter = getIntent().getStringExtra("n4");
        web_view.loadUrl(twitter);

        String linkedin = getIntent().getStringExtra("n5");
        web_view.loadUrl(linkedin);

        String pharmaeasy = getIntent().getStringExtra("n6");
        web_view.loadUrl(pharmaeasy);

        String tata = getIntent().getStringExtra("n7");
        web_view.loadUrl(tata);

        String netmeds = getIntent().getStringExtra("n8");
        web_view.loadUrl(netmeds);

        String apollo = getIntent().getStringExtra("n9");
        web_view.loadUrl(apollo);

        String mfine = getIntent().getStringExtra("n10");
        web_view.loadUrl(mfine);

        String bookmy = getIntent().getStringExtra("n11");
        web_view.loadUrl(bookmy);

        String redbus = getIntent().getStringExtra("n12");
        web_view.loadUrl(redbus);

        String mmt = getIntent().getStringExtra("n13");
        web_view.loadUrl(mmt);

        String irctc = getIntent().getStringExtra("n14");
        web_view.loadUrl(irctc);

        String ixigo = getIntent().getStringExtra("n15");
        web_view.loadUrl(ixigo);

        String ola = getIntent().getStringExtra("n16");
        web_view.loadUrl(ola);

        String uber = getIntent().getStringExtra("n17");
        web_view.loadUrl(uber);

        String rapido = getIntent().getStringExtra("n18");
        web_view.loadUrl(rapido);

        String jugnoo = getIntent().getStringExtra("n19");
        web_view.loadUrl(jugnoo);

        String cabify = getIntent().getStringExtra("n20");
        web_view.loadUrl(cabify);

        String paytm = getIntent().getStringExtra("n21");
        web_view.loadUrl(paytm);

        String pe = getIntent().getStringExtra("n22");
        web_view.loadUrl(pe);

        String gpay = getIntent().getStringExtra("n23");
        web_view.loadUrl(gpay);

        String bpay = getIntent().getStringExtra("n24");
        web_view.loadUrl(bpay);

        String freecharge = getIntent().getStringExtra("n25");
        web_view.loadUrl(freecharge);

        String dlocker = getIntent().getStringExtra("n26");
        web_view.loadUrl(dlocker);

        String umang = getIntent().getStringExtra("n27");
        web_view.loadUrl(umang);

        String mygov = getIntent().getStringExtra("n28");
        web_view.loadUrl(mygov);

        String mparivahan = getIntent().getStringExtra("n29");
        web_view.loadUrl(mparivahan);

        String setu = getIntent().getStringExtra("n30");
        web_view.loadUrl(setu);








        web_view.getSettings().setJavaScriptEnabled(true);

//        web_view.setWebViewClient(new WebViewClient());

        web_view.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if(newProgress==100)
                {
                    progressBar.setVisibility(View.GONE);
                }
            }
        });

    }

    private void binding() {

        web_view = findViewById(R.id.web_view);
        progressBar=findViewById(R.id.progressBar);

        web_view.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {

        if(web_view.canGoBack()){

            web_view.goBack();

        }

        else {

            super.onBackPressed();
        }
    }
}