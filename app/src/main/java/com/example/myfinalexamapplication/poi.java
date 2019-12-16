package com.example.myfinalexamapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class poi extends AppCompatActivity {
    String[] Array1 = {"Niagara falls","CN Tower","The Butchart Gardens","Notre-Dame Basilica"};
    String[] Array2 = {"The Statue of Liberty","The White House","Tims Square"};
    String[] Array3 = {"Big Ben","Westminster Abbey","Hyde Park"};

    Integer idmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poi);

        idmain=0;

        String id = getIntent().getExtras().getString("Name");
        Toast.makeText(getApplicationContext(),id+"",Toast.LENGTH_SHORT).show();

        ArrayAdapter adapter;
        if (id.equals("1")){
            idmain=1;
            adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, Array1);
        }
        else if (id.equals("2")){
            idmain=2;
            adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, Array2);
        }
        else{
            idmain=3;
            adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, Array3);
        }

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                TextView text = (TextView) view.findViewById(R.id.title);
                //String lst_txt = text.getText().toString().trim();

                System.out.println("this is value of string ::: :::: " + id);

                //intent to new class to load the value;

                Intent i = new Intent(poi.this,MainImagepoiActivity.class);
                //ARG_FROM_MAIN=UserName.getText().toString();
                System.out.println(id);
                System.out.println(idmain);
                if (idmain == 1) {
                    idmain = (int)id;
                }
                else if(idmain == 2){
                    idmain = 4+(int)id;
                }
                else {
                    idmain = 7+(int)id;
                }


                i.putExtra("Name",idmain.toString());
                startActivity(i);


                //Bundle bundle = new Bundle();
                //bundle.putLong("Data", id);
                //Intent intent = new Intent();
                //intent.putExtras(bundle);
                //setResult(1000, intent);
                //finish();



            }
        });

    }
}
