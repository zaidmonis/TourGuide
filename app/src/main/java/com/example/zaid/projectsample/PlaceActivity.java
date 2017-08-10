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
import static com.example.zaid.projectsample.MainActivity.count;

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
        if(count ==1) {
            switch (counter) {
                case 1:
                    setTitle(R.string.akshar);
                    tv1.setText(R.string.akshar_desc);
                    break;
                case 2:
                    setTitle(R.string.bangla);
                    tv1.setText(R.string.bangla_desc);
                    break;
                case 3:
                    setTitle(R.string.tomb);
                    tv1.setText(R.string.tomb_desc);
                    break;
                case 4:
                    setTitle(R.string.lotus);
                    tv1.setText(R.string.loyus_desc);
                    break;
                case 5:
                    setTitle(R.string.qutub);
                    tv1.setText(R.string.qutub_desc);
                    break;
                default:
                    Toast.makeText(getApplicationContext(), "WTFv2", Toast.LENGTH_SHORT).show();
            }
        }


        else if(count ==2) {
            switch (counter) {
                case 1:
                    setTitle(R.string.vict);
                    tv1.setText(R.string.victor);
                    break;
                case 2:
                    setTitle(R.string.daksh);
                    tv1.setText(R.string.dakshin);
                    break;
                case 3:
                    setTitle(R.string.belur);
                    tv1.setText(R.string.belurMath);
                    break;
                case 4:
                    setTitle(R.string.birla);
                    tv1.setText(R.string.birlaPlanet);
                    break;
                case 5:
                    setTitle(R.string.tipu);
                    tv1.setText(R.string.tipumos);
                    break;
                default:
                    Toast.makeText(getApplicationContext(), "WTFv2", Toast.LENGTH_SHORT).show();
            }
        }

        else if(count ==3) {
            switch (counter) {
                case 1:
                    setTitle(R.string.george);
                    tv1.setText(R.string.stgeorge);
                    break;
                case 2:
                    setTitle(R.string.birlach);
                    tv1.setText(R.string.birlachennai);
                    break;
                case 3:
                    setTitle(R.string.poong);
                    tv1.setText(R.string.poonga);
                    break;
                case 4:
                    setTitle(R.string.vada);
                    tv1.setText(R.string.vadapalani);
                    break;
                case 5:
                    setTitle(R.string.art);
                    tv1.setText(R.string.artgal);
                    break;
                default:
                    Toast.makeText(getApplicationContext(), "No such Place!", Toast.LENGTH_SHORT).show();
            }
        }


        else if(count ==4) {
            switch (counter) {
                case 1:
                    setTitle(R.string.india);
                    tv1.setText(R.string.gateway);
                    break;
                case 2:
                    setTitle(R.string.haji);
                    tv1.setText(R.string.dargah);
                    break;
                case 3:
                    setTitle(R.string.vinayak);
                    tv1.setText(R.string.siddhi);
                    break;
                case 4:
                    setTitle(R.string.udyaan);
                    tv1.setText(R.string.jija);
                    break;
                case 5:
                    setTitle(R.string.nehru);
                    tv1.setText(R.string.center);
                    break;
                default:
                    Toast.makeText(getApplicationContext(), "WTFv2", Toast.LENGTH_SHORT).show();
            }
        }



        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri="maps.google.com";
                if(count==1) {
                    switch (counter) {
                        case 1:
                            uri = "https://www.google.co.in/maps/dir//Akshardham+Temple/@28.6126555,77.2072216,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x390ce35b9975b1fb:0x69a09f265ef3b22a!2m2!1d77.2772619!2d28.6126735";
                            break;
                        case 2:
                            uri = "https://www.google.co.in/maps/dir//Gurudwara+Bangla+Sahib/@28.6265076,77.1392905,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x390cfd4db51d8a9d:0xdac87bb4502c9e5f!2m2!1d77.2093308!2d28.6265256";
                            break;
                        case 3:
                            uri = "https://www.google.co.in/maps/dir//Humayun's+tomb/data=!4m5!4m4!1m0!1m2!1m1!1s0x390ce31abf44a0c5:0x938663ce3e1f68f7?sa=X&ved=0ahUKEwiVtMSK7L7VAhUKp48KHYrpDDYQ9RcImgEwDw";
                            break;
                        case 4:
                            uri = "https://www.google.co.in/maps/dir//lotus+Temple/data=!4m5!4m4!1m0!1m2!1m1!1s0x390ce3c16e028cd1:0x653beb1ee85ec67a?sa=X&ved=0ahUKEwjl5IOg7L7VAhXKQI8KHVN4BPMQ9RcIwgEwGA";
                            break;
                        case 5:
                            uri = "https://www.google.co.in/maps/dir//qutub+Minar/@28.5244101,77.1154156,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x390d1e0667819b4f:0x834995f160759db8!2m2!1d77.1854559!2d28.5244281";
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "Direction Missing", Toast.LENGTH_SHORT).show();
                    }
                }
                    else if(count==4) {
                    switch (counter) {
                        case 1:
                            uri = "https://www.google.co.in/maps/dir//GAteway+of+India/data=!4m5!4m4!1m0!1m2!1m1!1s0x3be7d1c73a0d5cad:0xc70a25a7209c733c?sa=X&ved=0ahUKEwjW66j44snVAhWIO48KHVKgBEMQ9RcIxAEwGQ";
                            break;
                        case 2:
                            uri = "https://www.google.co.in/maps/dir//Haji+Ali+Dargah/@18.9827338,72.7389243,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3be7ce7e930d42e3:0xd5e05dc7ab078d05!2m2!1d72.8089648!2d18.982747";
                            break;
                        case 3:
                            uri = "https://www.google.co.in/maps/dir//Siddhivinayak+Temple,+Mumbai/@19.0168854,72.7603034,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3be7c7e6d0e0401f:0xfd2638c878ec1c7a!2m2!1d72.8303439!2d19.0168986";
                            break;
                        case 4:
                            uri = "https://www.google.co.in/maps/dir//jijamata+udyan/data=!4m5!4m4!1m0!1m2!1m1!1s0x3be7ce5b2ed87c2b:0x9ebaf164eabbfe41?sa=X&ved=0ahUKEwjOrpjN48nVAhUHRY8KHdrYBTcQ9RcIjwEwEA";
                            break;
                        case 5:
                            uri = "https://www.google.co.in/maps/dir//nehru+science+center+mumbai/@18.9906255,72.7485487,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3be7b626f2261433:0xf8b02d339247653b!2m2!1d72.8185892!2d18.9906387";
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "Direction Missing", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (count==2){
                    switch (counter) {
                        case 1:
                            uri = "https://www.google.co.in/maps/dir//Victoria+memorial/data=!4m5!4m4!1m0!1m2!1m1!1s0x3a02771346ae015d:0xb540e4bce39763?sa=X&ved=0ahUKEwjnmb7958nVAhWHpI8KHdZaC7gQ9RcIkAEwDw";
                            break;
                        case 2:
                            uri = "https://www.google.co.in/maps/dir//dakshineshwar+kali+mandir/@22.6548935,88.2874903,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x39f89d03ddd97829:0xffa380efed305d4c!2m2!1d88.3575307!2d22.6549087";
                            break;
                        case 3:
                            uri = "https://www.google.co.in/maps/dir//Belur+math/@22.6321701,88.2858508,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x39f89d73bcbb31eb:0x9e346e968d3e4219!2m2!1d88.3558912!2d22.6321853";
                            break;
                        case 4:
                            uri = "https://www.google.co.in/maps/dir//Birla+Planetarium,+Kolkata/@22.5455169,88.2773071,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3a02771466bc8ae3:0xdfa2377553ae8f0c!2m2!1d88.3473475!2d22.5455321";
                            break;
                        case 5:
                            uri = "https://www.google.co.in/maps/dir//tipu+sultan+mosque+kolkata/@22.5655126,88.2820093,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3a0277a7c161e97f:0xb98c0c81435de34b!2m2!1d88.3520497!2d22.5655278";
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "Direction Missing", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (count==3){
                    switch (counter) {
                        case 1:
                            uri = "https://www.google.co.in/maps/dir//fort+st+george/@13.0795796,80.2174113,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3a5268ad0fe75195:0x4cff4a37449c92fd!2m2!1d80.2874518!2d13.079589";
                            break;
                        case 2:
                            uri = "https://www.google.co.in/maps/dir//B.M.+Birla+Planetarium,+Gandhi+Mandapam+Road,+Kotturpuram,+Chennai,+Tamil+Nadu+600025/@13.011924,80.1739962,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3a526797fbb0104f:0xc8aab9b4085be311!2m2!1d80.2440367!2d13.0119334";
                            break;
                        case 3:
                            uri = "https://www.google.co.in/maps/dir//semmozhi+poonga/@13.0505053,80.1814477,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3a526646fd0e5771:0x8953747b4da657db!2m2!1d80.2514882!2d13.0505147";
                            break;
                        case 4:
                            uri = "https://www.google.co.in/maps/dir//vadapalani+andavar+temple/@13.0528618,80.1435504,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3a5266ebc7651ab1:0x7e3b59b0d91ede1e!2m2!1d80.2135909!2d13.0528712";
                            break;
                        case 5:
                            uri = "https://www.google.co.in/maps/dir//the+national+art+gallery+chennai/@13.0696975,80.1860306,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3a52660d789a188f:0x9655ff50f366a03d!2m2!1d80.2560711!2d13.0697069";
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "Direction Missing", Toast.LENGTH_SHORT).show();
                    }
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
