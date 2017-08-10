package com.example.zaid.projectsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import static com.example.zaid.projectsample.MainActivity.count;

public class CityActivity extends AppCompatActivity {
    public static int counter;
    private ImageView iv1, iv2, iv3, iv4, iv5;
    private TextView tv1, tv2, tv3, tv4, tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);





        iv1 = (ImageView) findViewById(R.id.iv_a);
        iv2 = (ImageView) findViewById(R.id.iv_b);
        iv3 = (ImageView) findViewById(R.id.iv_c);
        iv4 = (ImageView) findViewById(R.id.iv_d);
        iv5 = (ImageView) findViewById(R.id.iv_e);

        tv1 = (TextView) findViewById(R.id.tv_a);
        tv2 = (TextView) findViewById(R.id.tv_b);
        tv3 = (TextView) findViewById(R.id.tv_c);
        tv4 = (TextView) findViewById(R.id.tv_d);
        tv5 = (TextView) findViewById(R.id.tv_e);

        switch (count){
            case 1:

                setTitle("Delhi");
                iv1.setImageResource(R.drawable.akshar);
                tv1.setText(R.string.akshar);
                iv2.setImageResource(R.drawable.bangla);
                tv2.setText(R.string.bangla);
                iv3.setImageResource(R.drawable.tomb);
                tv3.setText(R.string.tomb);
                iv4.setImageResource(R.drawable.lotus);
                tv4.setText(R.string.lotus);
                iv5.setImageResource(R.drawable.qutub);
                tv5.setText(R.string.qutub);
                break;
            case 4:
                setTitle("Mumbai");
                iv1.setImageResource(R.drawable.india);
                iv1.setBackgroundColor(getResources().getColor(R.color.mumbai));
                tv1.setBackgroundColor(getResources().getColor(R.color.mumbai));
                tv1.setText(R.string.india);

                iv2.setImageResource(R.drawable.haji);
                tv2.setText(R.string.haji);
                iv2.setBackgroundColor(getResources().getColor(R.color.mumbai));
                tv2.setBackgroundColor(getResources().getColor(R.color.mumbai));

                iv3.setImageResource(R.drawable.vinayak);
                tv3.setText(R.string.vinayak);
                iv3.setBackgroundColor(getResources().getColor(R.color.mumbai));
                tv3.setBackgroundColor(getResources().getColor(R.color.mumbai));

                iv4.setImageResource(R.drawable.udyan);
                tv4.setText(R.string.udyaan);
                iv4.setBackgroundColor(getResources().getColor(R.color.mumbai));
                tv4.setBackgroundColor(getResources().getColor(R.color.mumbai));

                iv5.setImageResource(R.drawable.nehru);
                tv5.setText(R.string.nehru);
                iv5.setBackgroundColor(getResources().getColor(R.color.mumbai));
                tv5.setBackgroundColor(getResources().getColor(R.color.mumbai));
                break;
            case 2:
                setTitle("Kolkata");
                iv1.setImageResource(R.drawable.vict);
                iv1.setBackgroundColor(getResources().getColor(R.color.kolkata));
                tv1.setBackgroundColor(getResources().getColor(R.color.kolkata));
                tv1.setText(R.string.vict);

                iv2.setImageResource(R.drawable.daksh);
                tv2.setText(R.string.daksh);
                iv2.setBackgroundColor(getResources().getColor(R.color.kolkata));
                tv2.setBackgroundColor(getResources().getColor(R.color.kolkata));

                iv3.setImageResource(R.drawable.belur);
                tv3.setText(R.string.belur);
                iv3.setBackgroundColor(getResources().getColor(R.color.kolkata));
                tv3.setBackgroundColor(getResources().getColor(R.color.kolkata));

                iv4.setImageResource(R.drawable.birla);
                tv4.setText(R.string.birla);
                iv4.setBackgroundColor(getResources().getColor(R.color.kolkata));
                tv4.setBackgroundColor(getResources().getColor(R.color.kolkata));

                iv5.setImageResource(R.drawable.tipu);
                tv5.setText(R.string.tipu);
                iv5.setBackgroundColor(getResources().getColor(R.color.kolkata));
                tv5.setBackgroundColor(getResources().getColor(R.color.kolkata));
                break;
            case 3:
                setTitle("Chennai");
                iv1.setImageResource(R.drawable.george);
                iv1.setBackgroundColor(getResources().getColor(R.color.chennai));
                tv1.setBackgroundColor(getResources().getColor(R.color.chennai));
                tv1.setText(R.string.george);

                iv2.setImageResource(R.drawable.birlach);
                tv2.setText(R.string.birlach);
                iv2.setBackgroundColor(getResources().getColor(R.color.chennai));
                tv2.setBackgroundColor(getResources().getColor(R.color.chennai));

                iv3.setImageResource(R.drawable.poonga);
                tv3.setText(R.string.poong);
                iv3.setBackgroundColor(getResources().getColor(R.color.chennai));
                tv3.setBackgroundColor(getResources().getColor(R.color.chennai));

                iv4.setImageResource(R.drawable.vada);
                tv4.setText(R.string.vada);
                iv4.setBackgroundColor(getResources().getColor(R.color.chennai));
                tv4.setBackgroundColor(getResources().getColor(R.color.chennai));

                iv5.setImageResource(R.drawable.art);
                tv5.setText(R.string.art);
                iv5.setBackgroundColor(getResources().getColor(R.color.chennai));
                tv5.setBackgroundColor(getResources().getColor(R.color.chennai));
                break;

        }

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=1;
                Intent in = new Intent(CityActivity.this, PlaceActivity.class);
                startActivity(in);
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=1;
                Intent in = new Intent(CityActivity.this, PlaceActivity.class);
                startActivity(in);
            }
        });


        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=2;
                Intent in = new Intent(CityActivity.this, PlaceActivity.class);
                startActivity(in);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=2;
                Intent in = new Intent(CityActivity.this, PlaceActivity.class);
                startActivity(in);
            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=3;
                Intent in = new Intent(CityActivity.this, PlaceActivity.class);
                startActivity(in);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=3;
                Intent in = new Intent(CityActivity.this, PlaceActivity.class);
                startActivity(in);
            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=4;
                Intent in = new Intent(CityActivity.this, PlaceActivity.class);
                startActivity(in);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=4;
                Intent in = new Intent(CityActivity.this, PlaceActivity.class);
                startActivity(in);
            }
        });

        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=5;
                Intent in = new Intent(CityActivity.this, PlaceActivity.class);
                startActivity(in);
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=5;
                Intent in = new Intent(CityActivity.this, PlaceActivity.class);
                startActivity(in);
            }
        });

    }
}
