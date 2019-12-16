package com.example.myfinalexamapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainLoginActivity extends AppCompatActivity {

    EditText UserName,PassWord;
    Button LogIn,SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);



        UserName = findViewById(R.id.username);
        PassWord = findViewById(R.id.password);
        LogIn = findViewById(R.id.Login);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("---------------------");
                System.out.println(UserName.getText().toString().length());
                System.out.println(PassWord.getText());
                System.out.println("---------------------");
                //Check for the username and Password
                if(UserName.getText().toString().trim().equals("user1") && PassWord.getText().toString().trim().equals("password1")){
                    Intent i = new Intent(MainLoginActivity.this,Home_page.class);
                    //ARG_FROM_MAIN=UserName.getText().toString();
                    System.out.println("Logged in");
                    i.putExtra("Name",UserName.getText().toString());
                    startActivity(i);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Incorrect Username or Password",Toast.LENGTH_SHORT).show();
                    UserName.setText("");
                    PassWord.setText("");
                }


            }
        });

    }
}
