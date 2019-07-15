package com.rayndevelopement.andelaproject;

import android.annotation.SuppressLint;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URL;

public class AboutActivity extends AppCompatActivity {

    WebView aboutview;

    //String URL = "https://andela.com/alc/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        aboutview = findViewById(R.id.aboutweb);
        aboutview.setWebViewClient( new SSLTolerenWebView());
        aboutview.loadUrl("https://andela.com/alc/");

        /* aboutview.getSettings().setBlockNetworkLoads (false);
        aboutview.getSettings().setJavaScriptEnabled(true);
        aboutview.getSettings().setLoadsImagesAutomatically(true);
        aboutview.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);

        ;*/


    }
    class SSLTolerenWebView extends WebViewClient {


        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();

        }
    }


}
