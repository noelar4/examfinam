package com.example.myfinalexamapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainImagepoiActivity extends AppCompatActivity {
    ImageView load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_imagepoi);
        load=findViewById(R.id.image);

        String Number = getIntent().getExtras().getString("Name");
        Toast.makeText(getApplicationContext(),Number,Toast.LENGTH_SHORT).show();

        switch (Number){
            case "0":{
                load.setImageResource(R.drawable.niagara);
                break;
            }
            case "1":{
                load.setImageResource(R.drawable.cn);
                break;

            }
            case "2":{
                load.setImageResource(R.drawable.butchart);
                break;
            }
            case "3":{
                load.setImageResource(R.drawable.notre);
                break;
            }
            case "4":{
                load.setImageResource(R.drawable.liberty);
                break;
            }
            case "5":{
                load.setImageResource(R.drawable.house);
                break;
            }
            case "6":{
                load.setImageResource(R.drawable.square);
                break;
            }
            case "7":{
                load.setImageResource(R.drawable.ben);
                break;
            }
            case "8":{
                load.setImageResource(R.drawable.abbey);
                break;
            }
            case "9":{
                load.setImageResource(R.drawable.hyde);
                break;
            }
        }


    }
}
