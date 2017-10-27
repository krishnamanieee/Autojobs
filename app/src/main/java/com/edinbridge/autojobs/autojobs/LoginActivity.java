package com.edinbridge.autojobs.autojobs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Ayothi selvam on 19-10-2017.
 */

public class LoginActivity extends Activity {

    EditText editText_username,editText_password;
    Button button_login;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText_username= (EditText) findViewById(R.id.edt_login_email);
        editText_password= (EditText) findViewById(R.id.edt_login_password);
        button_login= (Button) findViewById(R.id.button_login);

        login();



    }

    private void login() {
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username=editText_username.getText().toString();
                String password=editText_password.getText().toString();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });
    }



}
