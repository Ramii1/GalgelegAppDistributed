package com.example.ramyar.galgelegappdistributed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

/**
 * Created by Ramyar on 02-05-2017.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    /* SOAP */
    private static final String NAMESPACE = "http://galgeleg/" + "GalgelogikService";
    private static final String URL = "http://130.226.195.227:9591/galgelegtjeneste?wsdl";
    private static final String SOAP_ACTION = "https://api.authorize.net/soap/v1/AuthenticateTest";
    private static final String METHOD_NAME = "hentBruger";

    /* Log */
    private static final String TAG = "";

    protected TextView test;
    protected EditText username_input, password_input;
    protected Button login_button;

    private String username;
    private String password;
    final SoapObject soap = new SoapObject(NAMESPACE, METHOD_NAME);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_login);

        /* Views */
        username_input = (EditText) findViewById(R.id.brugernavn_edit);
        password_input = (EditText) findViewById(R.id.password_edit);
        login_button = (Button) findViewById(R.id.logind_btn);
        login_button.setOnClickListener(this);

        /* Normal LoginActivity */
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = username_input.getText().toString().trim();
                password = password_input.getText().toString().trim();

                soap.addProperty("arg0", username);
                soap.addProperty("arg1", password);

                SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
                envelope.setOutputSoapObject(soap);
                HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
                try {
                    androidHttpTransport.call(SOAP_ACTION, envelope);

                    SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;


                    test.setText(resultsRequestSOAP.toString());
                    System.out.println("Response::" + resultsRequestSOAP.toString());


                } catch (Exception e) {
                    System.out.println("Error" + e);
                }

            }
        });
    }


    @Override
    public void onClick(View v) {

        if (v == login_button) {


            Intent intent = new Intent(this, HighScoreActivity.class);
            startActivity(intent);
        }
    }
}