package com.example.ramyar.galgelegappdistributed.frondend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ramyar.galgelegappdistributed.R;
import com.example.ramyar.galgelegappdistributed.asynctasks.GetUserAsync;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Ramyar on 09-05-2017.
 */

public class SinglePlayerActiv extends AppCompatActivity implements View.OnClickListener {


    private Button gætBtn;
    private TextView textView;
    private EditText editText;
    private ImageView imageView;
    private GoogleApiClient client;

    GetUserAsync getUserAsync = new GetUserAsync();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singel_player);

        gætBtn = (Button) findViewById(R.id.gætBtn);
        gætBtn.setOnClickListener(this);

        imageView = (ImageView) findViewById(R.id.imageView);
        gætBtn = (Button) findViewById(R.id.gætBtn);
        textView = (TextView) findViewById(R.id.textView2);
        editText = (EditText) findViewById(R.id.editText);
        textView.setText("Du skal gætte dette ord: " + getUserAsync.getSoapGetSynligtOrd() +
                "\nSkriv et bogstav og tryk 'Gæt'.\n");


        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public void onClick(View v) {

    }
}
