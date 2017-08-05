package com.example.zaid.projectsample;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static com.example.zaid.projectsample.CityActivity.counter;
import static com.example.zaid.projectsample.MainActivity.count;
import static com.example.zaid.projectsample.PlaceActivity.counter2;

public class Main2Activity extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        web = (WebView) findViewById(R.id.web1);
       if(count==9){
           web.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfIG0gjvXcXJ_tL67FwqkG46bBWeyjRk-HXjGX3a3VeWOOXbQ/viewform");
           web.getSettings().setJavaScriptEnabled(true);
           web.setWebViewClient(new WebViewClient());
       }
       else if(counter2==1){
           web.loadUrl("https://en.wikipedia.org/wiki/Akshardham_(Delhi)");
           web.getSettings().setJavaScriptEnabled(true);
           web.setWebViewClient(new WebViewClient());
       }
       else  if(counter2==2){
           web.loadUrl("https://en.wikipedia.org/wiki/Gurudwara_Bangla_Sahib");
           web.getSettings().setJavaScriptEnabled(true);
           web.setWebViewClient(new WebViewClient());
       }
       else if(counter2==3){
           web.loadUrl("https://en.wikipedia.org/wiki/Humayun%27s_Tomb");
           web.getSettings().setJavaScriptEnabled(true);
           web.setWebViewClient(new WebViewClient());
       }
       else if(counter2==4){
           web.loadUrl("https://en.wikipedia.org/wiki/Lotus_Temple");
           web.getSettings().setJavaScriptEnabled(true);
           web.setWebViewClient(new WebViewClient());
       }
       else if(counter2==5){
           web.loadUrl("https://en.wikipedia.org/wiki/Qutb_Minar");
           web.getSettings().setJavaScriptEnabled(true);
           web.setWebViewClient(new WebViewClient());
       }
    }
}
