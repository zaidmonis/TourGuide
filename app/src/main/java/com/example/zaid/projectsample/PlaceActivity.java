package com.example.zaid.projectsample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.zaid.projectsample.CityActivity.counter;

public class PlaceActivity extends AppCompatActivity {
    private TextView tv1;
    private Button but1, but2;
    public static int counter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        counter2=0;

        tv1 = (TextView) findViewById(R.id.tv_x);

        but1 = (Button) findViewById(R.id.butDir);
        but2 = (Button) findViewById(R.id.butWiki);
        switch(counter){
            case 1:
                tv1.setText(R.string.akshar_desc);
                break;
            case 2:
                tv1.setText(R.string.bangla_desc);
                break;
            case 3:
                tv1.setText(R.string.tomb_desc);
                break;
            case 4:
                tv1.setText(R.string.loyus_desc);
                break;
            case 5:
                tv1.setText(R.string.qutub_desc);
                break;
            default:
                Toast.makeText(getApplicationContext(), "WTFv2", Toast.LENGTH_SHORT).show();
        }
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri="maps.google.com";
                switch (counter) {
                    case 1:
                        uri="https://www.google.co.in/maps/dir//Akshardham+Temple/@28.6126555,77.2072216,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x390ce35b9975b1fb:0x69a09f265ef3b22a!2m2!1d77.2772619!2d28.6126735";
                        break;
                    case 2:
                        uri="https://www.google.co.in/maps/dir//Gurudwara+Bangla+Sahib/@28.6265076,77.1392905,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x390cfd4db51d8a9d:0xdac87bb4502c9e5f!2m2!1d77.2093308!2d28.6265256";
                        break;
                    case 3:
                        uri="https://www.google.co.in/maps/dir//Humayun's+tomb/data=!4m5!4m4!1m0!1m2!1m1!1s0x390ce31abf44a0c5:0x938663ce3e1f68f7?sa=X&ved=0ahUKEwiVtMSK7L7VAhUKp48KHYrpDDYQ9RcImgEwDw";
                        break;
                    case 4:
                        uri="https://www.google.co.in/maps/dir//lotus+Temple/data=!4m5!4m4!1m0!1m2!1m1!1s0x390ce3c16e028cd1:0x653beb1ee85ec67a?sa=X&ved=0ahUKEwjl5IOg7L7VAhXKQI8KHVN4BPMQ9RcIwgEwGA";
                        break;
                    case 5:
                        uri="https://www.google.co.in/maps/dir//qutub+Minar/@28.5244101,77.1154156,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x390d1e0667819b4f:0x834995f160759db8!2m2!1d77.1854559!2d28.5244281";
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "WTF Direction is wrong", Toast.LENGTH_SHORT).show();
                }
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(in);
            }
        });

        but2. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter2 = counter;
                Intent in = new Intent(PlaceActivity.this, Main2Activity.class);
                startActivity(in);
                finish();
            }
        });


    }
}
