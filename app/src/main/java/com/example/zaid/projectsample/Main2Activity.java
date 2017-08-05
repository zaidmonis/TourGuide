package com.example.zaid.projectsample;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        web = (WebView) findViewById(R.id.web1);
        web.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfIG0gjvXcXJ_tL67FwqkG46bBWeyjRk-HXjGX3a3VeWOOXbQ/viewform");
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
    }
}
