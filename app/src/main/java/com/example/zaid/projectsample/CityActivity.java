package com.example.zaid.projectsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.zaid.projectsample.MainActivity.count;

public class CityActivity extends AppCompatActivity {
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
            default:
                Toast.makeText(getApplicationContext(), "WTF", Toast.LENGTH_SHORT).show();
        }




    }
}
