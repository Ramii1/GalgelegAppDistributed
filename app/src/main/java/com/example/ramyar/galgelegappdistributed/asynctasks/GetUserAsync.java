package com.example.ramyar.galgelegappdistributed.asynctasks;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.example.ramyar.galgelegappdistributed.frondend.Constants;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

/**
 * Created by Ramyar on 04-05-2017.
 */

public class GetUserAsync extends AsyncTask<String, String, SoapObject> {


    ProgressDialog dialog;
    Context context;


    public GetUserAsync(Context context) {
        this.context = context;
    }


    @Override
    protected SoapObject doInBackground(String... params) {

        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME);

        soap.addProperty("arg0", params[0] );
        soap.addProperty("arg1", params[1]);
        System.out.println(params[0]);
        System.out.println(params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION, envelope);
            System.out.println(androidHttpTransport.requestDump);
            System.out.println(androidHttpTransport.responseDump);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error" + e);
        }

        return null;

    }

    @Override
    protected void onPreExecute() {

        dialog = ProgressDialog.show(context, "please Wait", "Trying to signin");
    }

    @Override
    protected void onPostExecute(SoapObject result) {

        dialog.dismiss();

        if(result == null) {
            System.out.println("ERROR IN ONPOST");
        }else {
            System.out.println("RESULT: " + result);
        }

    }
}
