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
        setTitle("Wikipedia");
       if(count==9){
           setTitle("Feedback");
           web.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScpe3LFz4XnyWhtUX_8nVfgm6tBXT7_Zo136hwKKg5vMXQDkg/viewform?usp=sf_link");
           web.getSettings().setJavaScriptEnabled(true);
           web.setWebViewClient(new WebViewClient());
       }
       else if (count==1) {
           if (counter2 == 1) {
               web.loadUrl("https://en.wikipedia.org/wiki/Akshardham_(Delhi)");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 2) {
               web.loadUrl("https://en.wikipedia.org/wiki/Gurudwara_Bangla_Sahib");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 3) {
               web.loadUrl("https://en.wikipedia.org/wiki/Humayun%27s_Tomb");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 4) {
               web.loadUrl("https://en.wikipedia.org/wiki/Lotus_Temple");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 5) {
               web.loadUrl("https://en.wikipedia.org/wiki/Qutb_Minar");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           }
       }
       else if (count==4){
           if (counter2 == 1) {
               web.loadUrl("https://en.wikipedia.org/wiki/Gateway_of_India");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 2) {
               web.loadUrl("https://en.wikipedia.org/wiki/Haji_Ali_Dargah");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 3) {
               web.loadUrl("https://en.wikipedia.org/wiki/Siddhivinayak_Temple,_Mumbai");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 4) {
               web.loadUrl("https://en.wikipedia.org/wiki/Jijamata_Udyaan");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 5) {
               web.loadUrl("https://en.wikipedia.org/wiki/Nehru_Science_Centre");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           }
       }
       else if (count==2){
           if (counter2 == 1) {
               web.loadUrl("https://en.wikipedia.org/wiki/Victoria_Memorial,_Kolkata");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 2) {
               web.loadUrl("https://en.wikipedia.org/wiki/Dakshineswar_Kali_Temple");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 3) {
               web.loadUrl("https://en.wikipedia.org/wiki/Belur_Math");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 4) {
               web.loadUrl("https://en.wikipedia.org/wiki/Birla_Planetarium,_Kolkata");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 5) {
               web.loadUrl("https://en.wikipedia.org/wiki/Tipu_Sultan_Mosque");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           }
       }
       else if (count==3){
           if (counter2 == 1) {
               web.loadUrl("https://en.wikipedia.org/wiki/Fort_St._George,_India");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 2) {
               web.loadUrl("https://en.wikipedia.org/wiki/Birla_Planetarium,_Chennai");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 3) {
               web.loadUrl("https://en.wikipedia.org/wiki/Semmozhi_Poonga");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 4) {
               web.loadUrl("https://en.wikipedia.org/wiki/Vadapalani_Andavar_Temple");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           } else if (counter2 == 5) {
               web.loadUrl("https://en.wikipedia.org/wiki/The_National_Art_Gallery_(Chennai)");
               web.getSettings().setJavaScriptEnabled(true);
               web.setWebViewClient(new WebViewClient());
           }
       }




    }
}
