package com.example.ramyar.galgelegappdistributed;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.ksoap2.serialization.SoapObject;

/**
 * Created by Ramyar on 02-05-2017.
 */

public class LoginActivity extends AppCompatActivity
{
    protected TextView test;
    protected EditText username_input, password_input;
    protected Button login_button;

    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username_input = (EditText) findViewById(R.id.brugernavn_edit);
        password_input = (EditText) findViewById(R.id.password_edit);

        login_button = (Button) findViewById(R.id.logind_btn);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogin();
            }
        });
    }

    private void doLogin()
    {
        username = username_input.getText().toString().trim();
        password = password_input.getText().toString().trim();

        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask()
        {
            @Override
            protected SoapObject doInBackground(Object[] params)
            {
                return GetSoap.getSoapHentBruger(username, password);
            }

            @Override
            protected void onPostExecute(Object o)
            {
                dialog.dismiss();

                SoapObject so = (SoapObject) o;

                if(so.getProperty(0).toString().equals("true"))
                {
                    LoginActivity.this.startActivity(new Intent(LoginActivity.this, MainActivity.class));

                    Login.setBrugernavn(username);
                    Login.setPassword(password);
                }
                else
                {
                    System.out.println("ERROR IN ONPOST");
                }
            }
        }.execute();
    }
}