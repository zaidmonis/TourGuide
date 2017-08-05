package com.example.zaid.projectsample;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {
    private Button but1, but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        but1 = (Button) findViewById(R.id.butFb);
        but2 = (Button) findViewById(R.id.butIn);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100003022836208"));
                    in.setPackage("com.facebook.katana");
                    startActivity(in);
                }
                catch (Exception e ){
                    Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/monis.z.786"));
                    startActivity(in);
                }
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/zaid_monis/"));
                startActivity(in);
            }
        });




    }
}
