package com.edinbridge.autojobs.autojobs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ayothi selvam on 23-10-2017.
 */

public class  RegisterActivity extends Activity {

    CheckBox checkBox_frsher;
    TextView titletxt,upldbtntxt,agreetext,registertext;
    EditText employeredit,departmentedit,segmentedit,experienceedit,locationedit,nameedit,mobileedit,emailedit,passwordedit;
    Button  uploadbtn,registerbtn,loginbtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        checkBox_frsher = (CheckBox) findViewById(R.id.checkBox);
        titletxt = (TextView) findViewById(R.id.titletxt);
        upldbtntxt = (TextView) findViewById(R.id.upldbtntxt);
        agreetext = (TextView) findViewById(R.id.agreetext);
        registertext = (TextView) findViewById(R.id.registertext);

        nameedit = (EditText) findViewById(R.id.nameedit);
        mobileedit = (EditText) findViewById(R.id.mobileedit);
        emailedit = (EditText) findViewById(R.id.emailedit);
        passwordedit = (EditText) findViewById(R.id.passwordedit);
        employeredit = (EditText) findViewById(R.id.employeredit);
        departmentedit = (EditText) findViewById(R.id.departmentedit);
        segmentedit = (EditText) findViewById(R.id.segmentedit);
        experienceedit = (EditText) findViewById(R.id.experienceedit);
        locationedit = (EditText) findViewById(R.id.locationedit);


        uploadbtn = (Button) findViewById(R.id.uploadbtn);
        registerbtn = (Button) findViewById(R.id.registerbtn);
        loginbtn = (Button) findViewById(R.id.loginbtn);

        checkBox_frsher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    employeredit.setText("Fresher");
                    departmentedit.setText("Fresher");
                    segmentedit.setText("Freshfer");
                    experienceedit.setText("Fresher");
                    locationedit.setText("Fresher");
                } else {
                    employeredit.setText("");
                    departmentedit.setText("");
                    segmentedit.setText("");
                    experienceedit.setText("");
                    locationedit.setText("");
                }
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        });
    }
}
