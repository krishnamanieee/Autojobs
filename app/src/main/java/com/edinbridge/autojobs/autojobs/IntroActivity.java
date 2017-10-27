package com.edinbridge.autojobs.autojobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class IntroActivity extends AppCompatActivity {


   Button btn_reg,btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        btn_reg= (Button) findViewById(R.id.btn_register);
        btn_login = (Button) findViewById(R.id.btn_login);

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent reg =new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(reg);
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent reg =new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(reg);
            }
        });


    }
}
