package com.example.ramyar.galgelegappdistributed;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import org.ksoap2.serialization.SoapObject;



public class SinglePlayerActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button button;
    private TextView textView;
    private EditText editText;
    private ImageView imageView;
    private static String _ordetHentetFraServeren;
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singel_player);

        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.gætBtn);
        textView = (TextView) findViewById(R.id.textView2);
        editText = (EditText) findViewById(R.id.editText);
        editText.setHint("Indsæt Bogstav");
        button = (Button) findViewById(R.id.gætBtn);
        button.setText("Gæt");
        button.setOnClickListener(this);
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        Nulstil();
        GetSynligtOrd();
        GetOrdet();
    }

    @Override
    public void onClick(View v)
    {
        if (v == button && ((Button)v).getText() == "Gæt" )
        {
            StartTheGame();
        }
        else if (v == button && ((Button)v).getText() == "Spil igen")
        {
            Nulstil();
            StartTheGame();
        }
    }

    private void StartTheGame()
    {
        String bogstav = editText.getText().toString();

        if (bogstav.length() > 1)
        {
            editText.setError("Skriv ét bogstav");
            return;
        }

        GaetBogstav(bogstav);
        GetAntalForkerteBogstaver();
        OpdaterSynligOrd();
        GetSynligtOrd();
        GetOrdet();
        ErSpilletVundet();
        ErSpilletTabt();
        ErSpilletSlut();

        editText.setText("");
        editText.setError(null);
        editText.setVisibility(editText.VISIBLE);
    }

    public void GetSynligtOrd()
    {
        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask()
        {
            @Override
            protected SoapObject doInBackground(Object[] params)
            {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetSoap.getSoapGetSynligtOrd(username, password);
            }

            @Override
            protected void onPostExecute(Object o)
            {
                dialog.dismiss();
                SoapObject so = (SoapObject) o;
                String returnFromServer = so.getProperty(0).toString();
                textView.setText("Du skal gætte dette ord: " + returnFromServer +
                        "\nSkriv et bogstav og tryk 'Gæt'.\n");
            }
        }.execute();
    }

    public void GetOrdet()
    {
        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask()
        {
            @Override
            protected SoapObject doInBackground(Object[] params)
            {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetSoap.getSoapGetOrdet(username, password);
            }

            @Override
            protected void onPostExecute(Object o)
            {
                dialog.dismiss();
                SoapObject so = (SoapObject) o;
                _ordetHentetFraServeren = so.getProperty(0).toString();
                System.out.println("GetOrdet 4 " + _ordetHentetFraServeren);
            }
        }.execute();
    }

    public void GaetBogstav(final String bogstav)
    {
        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask()
        {
            @Override
            protected SoapObject doInBackground(Object[] params)
            {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetSoap.getSoapGaetBogstav(username, password, bogstav);
            }

            @Override
            protected void onPostExecute(Object o)
            {
                dialog.dismiss();
            }
        }.execute();
    }

    public void GetAntalForkerteBogstaver()
    {
        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask()
        {
            @Override
            protected SoapObject doInBackground(Object[] params)
            {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetSoap.getSoapGetAntalForkerteBogstaver(username, password);
            }

            @Override
            protected void onPostExecute(Object o)
            {
                dialog.dismiss();
                SoapObject so = (SoapObject) o;
                int antalForkerteBogstaver = Integer.parseInt(so.getProperty(0).toString());

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

    public void OpdaterSynligOrd()
    {
        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask()
        {
            @Override
            protected SoapObject doInBackground(Object[] params)
            {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetSoap.getSoapOpdaterSynligtOrd(username, password);
            }

            @Override
            protected void onPostExecute(Object o)
            {
                dialog.dismiss();
            }
        }.execute();
    }

    public void ErSpilletTabt()
    {
        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask()
        {
            @Override
            protected SoapObject doInBackground(Object[] params)
            {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetSoap.getSoapErSpilletTabt(username, password);
            }

            @Override
            protected void onPostExecute(Object o)
            {
                dialog.dismiss();
                SoapObject so = (SoapObject) o;
                boolean erSpilletTabt = Boolean.parseBoolean(so.getProperty(0).toString());

                if(erSpilletTabt)
                {
                    textView.setText("Du har desværre tabt spillet!\nPrøv igen forfra :-)");
                    button = (Button) findViewById(R.id.gætBtn);
                    button.setText("Spil igen");
                    editText.setVisibility(editText.GONE);
                }
            }
        }.execute();
    }

    public void ErSpilletVundet()
    {
        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask()
        {
            @Override
            protected SoapObject doInBackground(Object[] params)
            {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetSoap.getSoapErSpilletVundet(username, password);
            }

            @Override
            protected void onPostExecute(Object o)
            {
                dialog.dismiss();
                SoapObject so = (SoapObject) o;
                boolean erSpilletVundet = Boolean.parseBoolean(so.getProperty(0).toString());

                if(erSpilletVundet)
                {
                    textView.setText("Du har vundet spillet!\nGodt gået, spil snart igen... :-)");
                    button = (Button) findViewById(R.id.gætBtn);
                    button.setText("Spil igen");
                    editText.setVisibility(editText.GONE);
                }
            }
        }.execute();
    }

    public void Nulstil()
    {
        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask()
        {
            @Override
            protected SoapObject doInBackground(Object[] params)
            {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetSoap.getSoapNulstil(username, password);
            }

            @Override
            protected void onPostExecute(Object o)
            {
                dialog.dismiss();
                button.setText("Gæt");
                imageView.setImageResource(R.drawable.galge);
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
                return GetSoap.getSoapGetBrugteBogstaver(username, password);
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

    public void ErSpilletSlut()
    {
        final ProgressDialog dialog = ProgressDialog.show(this, "please Wait", "Trying to signin");

        new AsyncTask()
        {
            @Override
            protected SoapObject doInBackground(Object[] params)
            {
                String username = Login.getBrugernavn();
                String password = Login.getPassword();
                return GetSoap.getSoapErSpilletSlut(username, password);
            }

            @Override
            protected void onPostExecute(Object o)
            {
                dialog.dismiss();
                SoapObject so = (SoapObject) o;
                boolean erSpilletSlut = Boolean.parseBoolean(so.getProperty(0).toString());

                if(erSpilletSlut)
                {
                    System.out.println("done");
                }
            }
        }.execute();
    }

}
