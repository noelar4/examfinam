package com.example.myfinalexamapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Home_page extends AppCompatActivity {

    Spinner homeCountry;
    Integer Selected_id;
    ImageView img;
    Button press;
    Boolean sel = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        press=findViewById(R.id.clicked);
        homeCountry=findViewById(R.id.Sp_Course);
        img=findViewById(R.id.countryimg);

        List<String> CourseList = new ArrayList<String>();
        CourseList.add("Select Country");
        CourseList.add("CANADA");
        CourseList.add("USA");
        CourseList.add("ENGLAND");

        //Adapter for spinner
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,CourseList);
        stringArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        homeCountry.setAdapter(stringArrayAdapter);

        homeCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {




                Selected_id = (int)id;
                System.out.println(Selected_id);
                //if (position = 1)

                if (Selected_id != 0) {

                    sel=true;
                    if (Selected_id == 1) {
                    img.setImageResource(R.drawable.can);
                    }
                    else if(Selected_id == 2){
                        img.setImageResource(R.drawable.usa);
                    }
                    else{
                        img.setImageResource(R.drawable.england);
                    }
                    //Toast.makeText(getApplicationContext(),"Automatic redirection to next page please wait...", Toast.LENGTH_SHORT).show();
                       // try {
                       //     Thread.sleep(3000);
                      //  } catch (InterruptedException e) {
                            // Process exception
                       // }

                        //i.putExtra("Name", Selected_id.toString());
                        //startActivity(i);
                    }

                }
                @Override
                public void onNothingSelected (AdapterView < ? > parent){

                }
        });

        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!sel){
                    Toast.makeText(getApplicationContext(),"Select Country", Toast.LENGTH_SHORT).show();
                }else {
                    Intent i = new Intent(Home_page.this, poi.class);
                    i.putExtra("Name", Selected_id.toString());
                    startActivity(i);
                }
            }
        });
    }
}
