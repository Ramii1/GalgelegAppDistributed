package com.example.ramyar.galgelegappdistributed.frondend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ramyar.galgelegappdistributed.R;
import com.example.ramyar.galgelegappdistributed.asynctasks.GetUserAsync;

/**
 * Created by Ramyar on 02-05-2017.
 */

public class LoginActivity extends AppCompatActivity {
GetUserAsync getUserAsync = new GetUserAsync(this);

    /* Log */
    private static final String TAG = "";

    protected TextView test;
    protected EditText username_input, password_input;
    protected Button login_button;

    private String username;
    private String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);

        /* Views */
        username_input = (EditText) findViewById(R.id.brugernavn_edit);
        password_input = (EditText) findViewById(R.id.password_edit);
        login_button = (Button) findViewById(R.id.logind_btn);


        /* Normal LoginActivity */
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = username_input.getText().toString().trim();
                password = password_input.getText().toString().trim();

             new GetUserAsync(LoginActivity.this).execute(username, password);




            }
        });
    }
}