package com.example.ramyar.galgelegappdistributed;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

/**
 * Created by Ramyar on 04-05-2017.
 */

public class GetSoap extends AppCompatActivity
{
    @Nullable
    public static SoapObject getSoapOpdaterSynligtOrd(String... params)
    {
        SoapObject getSoapOpdaterSynligtOrd = new SoapObject(SOAP_Address.NAMESPACE, SOAP_Address.METHOD_NAME_getSynligtOrd);

        getSoapOpdaterSynligtOrd.addProperty("arg0", params[0]);
        getSoapOpdaterSynligtOrd.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapOpdaterSynligtOrd);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(SOAP_Address.URL);
        try
        {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(SOAP_Address.SOAP_ACTION_opdaterSynligtOrd, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapGetBrugteBogstaver(String... params)
    {
        SoapObject soapGetSoapGetBrugteBogstaver = new SoapObject(SOAP_Address.NAMESPACE, SOAP_Address.METHOD_NAME_GetBrugteBogstaver);

        soapGetSoapGetBrugteBogstaver.addProperty("arg0", params[0]);
        soapGetSoapGetBrugteBogstaver.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soapGetSoapGetBrugteBogstaver);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(SOAP_Address.URL);
        try
        {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(SOAP_Address.SOAP_ACTION_GetBrugteBogstaver, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapGetSynligtOrd(String... params)
    {
        SoapObject getSoapGetSynligtOrd = new SoapObject(SOAP_Address.NAMESPACE, SOAP_Address.METHOD_NAME_getSynligtOrd);

        getSoapGetSynligtOrd.addProperty("arg0", params[0]);
        getSoapGetSynligtOrd.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGetSynligtOrd);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(SOAP_Address.URL);
        try
        {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(SOAP_Address.SOAP_ACTION_getSynligtOrd, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapGetOrdet(String... params)
    {
        SoapObject getSoapGetOrdet = new SoapObject(SOAP_Address.NAMESPACE, SOAP_Address.METHOD_NAME_getOrdet);

        getSoapGetOrdet.addProperty("arg0", params[0]);
        getSoapGetOrdet.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGetOrdet);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(SOAP_Address.URL);
        try
        {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(SOAP_Address.SOAP_ACTION_getOrdet, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapGetAntalForkerteBogstaver(String... params)
    {
        SoapObject antalForkerteBogstaver = new SoapObject(SOAP_Address.NAMESPACE, SOAP_Address.METHOD_NAME_getAntalForkerteBogstaver);

        antalForkerteBogstaver.addProperty("arg0", params[0]);
        antalForkerteBogstaver.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(antalForkerteBogstaver);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(SOAP_Address.URL);
        try
        {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(SOAP_Address.SOAP_ACTION_getAntalForkerteBogstaver, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapErSpilletVundet(String... params)
    {
        SoapObject getSoapErSpilletVundet = new SoapObject(SOAP_Address.NAMESPACE, SOAP_Address.METHOD_NAME_erSpilletVundet);

        getSoapErSpilletVundet.addProperty("arg0", params[0]);
        getSoapErSpilletVundet.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapErSpilletVundet);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(SOAP_Address.URL);
        try
        {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(SOAP_Address.SOAP_ACTION_erSpilletVundet, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapErSpilletTabt(String... params)
    {
        SoapObject getSoapErSpilletTabt = new SoapObject(SOAP_Address.NAMESPACE, SOAP_Address.METHOD_NAME_erSpilletTabt);

        getSoapErSpilletTabt.addProperty("arg0", params[0]);
        getSoapErSpilletTabt.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapErSpilletTabt);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(SOAP_Address.URL);
        try
        {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(SOAP_Address.SOAP_ACTION_erSpilletTabt, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapNulstil(String... params)
    {
        SoapObject getSoapNulstil = new SoapObject(SOAP_Address.NAMESPACE, SOAP_Address.METHOD_NAME_nulstil);

        getSoapNulstil.addProperty("arg0", params[0]);
        getSoapNulstil.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapNulstil);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(SOAP_Address.URL);
        try
        {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(SOAP_Address.SOAP_ACTION_nulstil, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapGaetBogstav(String... params)
    {
        SoapObject getSoapGaetBogstav = new SoapObject(SOAP_Address.NAMESPACE, SOAP_Address.METHOD_NAME_gætBogstav);

        getSoapGaetBogstav.addProperty("arg0", params[0]);
        getSoapGaetBogstav.addProperty("arg1", params[1]);
        getSoapGaetBogstav.addProperty("arg2", params[2]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGaetBogstav);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(SOAP_Address.URL);
        try
        {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(SOAP_Address.SOAP_ACTION_gætBogstav, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapHentBruger(String... params)
    {
        SoapObject getSoapHentBruger = new SoapObject(SOAP_Address.NAMESPACE, SOAP_Address.METHOD_NAME_hentBruger);

        getSoapHentBruger.addProperty("arg0", params[0]);
        getSoapHentBruger.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapHentBruger);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(SOAP_Address.URL);
        try
        {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(SOAP_Address.SOAP_ACTION_hentBruger, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }
}
