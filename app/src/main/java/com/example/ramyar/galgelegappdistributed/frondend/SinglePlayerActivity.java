package com.example.ramyar.galgelegappdistributed.frondend;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ramyar.galgelegappdistributed.Login;
import com.example.ramyar.galgelegappdistributed.R;
import com.example.ramyar.galgelegappdistributed.asynctasks.GetUserAsync;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import org.ksoap2.serialization.SoapObject;

/**
 * Created by Ramyar on 09-05-2017.
 */

public class SinglePlayerActivity extends AppCompatActivity implements View.OnClickListener {


    private Button button;
    private TextView textView;
    private EditText editText;
    private ImageView imageView;
    private GoogleApiClient client;
    private static String _prikkerneHentetFraServeren;
    private static String _ordetHentetFraServeren;
    private int _antalForkerteBogstaver;

/*    GetUserAsync getUserAsync = new GetUserAsync();*/

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singel_player);

        button = (Button) findViewById(R.id.gætBtn);
        button.setOnClickListener(this);

        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.gætBtn);
        textView = (TextView) findViewById(R.id.textView2);
        editText = (EditText) findViewById(R.id.editText);


        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        GetSynligtOrd();
        GetOrdet();
    }


    @Override
    public void onClick(View v) {
        if (v == button)
        {
            String bogstav = editText.getText().toString();

            if (bogstav.length() > 1)
            {
                editText.setError("Skriv ét bogstav");
                return;
            }

            SendBogstav(bogstav);
            GetAntalForkerteBogstaver();
            OpdaterSynligOrd();
            GetSynligtOrd();
            ErSpilletTabt();
            ErSpilletVundet();

            editText.setText("");
            editText.setError(null);
        }
    }

    //Kalde til serveren:

    public void GetSynligtOrd() {

        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask() {
            @Override
            protected SoapObject doInBackground(Object[] params) {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetUserAsync.getSoapGetSynligtOrd(username, password);
            }

            @Override
            protected void onPostExecute(Object o) {
                dialog.dismiss();
                System.out.println("DD1 " + o.toString());
                System.out.println("DD2 " + o.getClass().getName());
                SoapObject so = (SoapObject) o;
                System.out.println("DD3 " + so.getProperty(0).toString());
                System.out.println(" hej " + so.getName());
                String returnFromServer = so.getProperty(0).toString();
                _prikkerneHentetFraServeren = returnFromServer;
                textView.setText("Du skal gætte dette ord: " + returnFromServer +
                        "\nSkriv et bogstav og tryk 'Gæt'.\n");
            }
        }.execute();
    }

    public void GetOrdet() {

        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask() {
            @Override
            protected SoapObject doInBackground(Object[] params) {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetUserAsync.getSoapGetOrdet(username, password);
            }

            @Override
            protected void onPostExecute(Object o) {
                dialog.dismiss();
                System.out.println("GetOrdet 1 " + o.toString());
                System.out.println("GetOrdet 2 " + o.getClass().getName());
                SoapObject so = (SoapObject) o;
                System.out.println("GetOrdet 3 " + so.getProperty(0).toString());
                _ordetHentetFraServeren = so.getProperty(0).toString();
                System.out.println("GetOrdet 4 " + _ordetHentetFraServeren);
                System.out.println("GetOrdet 5 " + so.getName());
            }
        }.execute();
    }
    //GetBogstav
    public void SendBogstav(final String bogstav) {

        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask() {
            @Override
            protected SoapObject doInBackground(Object[] params) {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetUserAsync.getSoapGaetBogstav(username, password, bogstav);
            }

            @Override
            protected void onPostExecute(Object o) {
                dialog.dismiss();
                System.out.println("SendBogstav DONE!");
            }
        }.execute();
    }

    public void GetAntalForkerteBogstaver() {

        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask() {
            @Override
            protected SoapObject doInBackground(Object[] params) {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetUserAsync.getSoapGetAntalForkerteBogstaver(username, password);
            }

            @Override
            protected void onPostExecute(Object o) {
                dialog.dismiss();
                System.out.println("GetAntalForkerteBogstaver 1 " + o.toString());
                System.out.println("GetAntalForkerteBogstaver 2 " + o.getClass().getName());
                SoapObject so = (SoapObject) o;
                System.out.println("GetAntalForkerteBogstaver 3 " + so.getProperty(0).toString());
                System.out.println("GetAntalForkerteBogstaver 4 " + so.getName());
                int antalForkerteBogstaver = Integer.parseInt(so.getProperty(0).toString());
                int antalKarakterInOrdet = _prikkerneHentetFraServeren.length();
                System.out.println("GetAntalForkerteBogstaver 5 " + so.getProperty(0).toString());

                switch (antalForkerteBogstaver)
                {
                    case 1:
                        imageView.setImageResource(R.drawable.forkert1);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.forkert2);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.forkert3);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.forkert4);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.forkert5);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.forkert6);
                        break;
                    default:
                        break;
                }
            }
        }.execute();
    }

    public void OpdaterSynligOrd() {

        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask() {
            @Override
            protected SoapObject doInBackground(Object[] params) {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetUserAsync.getSoapOpdaterSynligtOrd(username, password);
            }

            @Override
            protected void onPostExecute(Object o) {
                dialog.dismiss();
                System.out.println("OpdaterSynligOrd DONE!");
            }
        }.execute();
    }

    public void GetBrugteBogstaver() {

        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask() {
            @Override
            protected SoapObject doInBackground(Object[] params) {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetUserAsync.getSoapGetBrugteBogstaver(username, password);
            }

            @Override
            protected void onPostExecute(Object o) {
                dialog.dismiss();
                System.out.println("GetBrugteBogstaver 1 " + o.toString());
                System.out.println("GetBrugteBogstaver 2 " + o.getClass().getName());
                SoapObject so = (SoapObject) o;
                System.out.println("GetBrugteBogstaver 3 " + so.getProperty(0).toString());
                System.out.println("GetBrugteBogstaver 4 " + so.getName());
            }
        }.execute();
    }

    public void ErSpilletTabt() {

        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask() {
            @Override
            protected SoapObject doInBackground(Object[] params) {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetUserAsync.getSoapErSpilletTabt(username, password);
            }

            @Override
            protected void onPostExecute(Object o) {
                dialog.dismiss();
                System.out.println("ErSpilletTabt Done!");
                SoapObject so = (SoapObject) o;
                boolean erSpilletTabt = Boolean.parseBoolean(so.getProperty(0).toString());
                if(erSpilletTabt) {
                    textView.setText("Du har desværre tabt spillet!\nPrøv igen forfra :-)");
                }
            }
        }.execute();
    }

    public void ErSpilletVundet() {

        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask() {
            @Override
            protected SoapObject doInBackground(Object[] params) {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetUserAsync.getSoapErSpilletVundet(username, password);
            }

            @Override
            protected void onPostExecute(Object o) {
                dialog.dismiss();
                System.out.println("ErSpilletVundet Done!");
                SoapObject so = (SoapObject) o;
                boolean erSpilletVundet = Boolean.parseBoolean(so.getProperty(0).toString());
                if(erSpilletVundet) {
                    textView.setText("Du har vundet spillet!\nGodt gået, spil snart igen... :-)");
                }
            }
        }.execute();
    }
}
