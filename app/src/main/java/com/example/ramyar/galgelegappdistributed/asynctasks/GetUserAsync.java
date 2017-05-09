package com.example.ramyar.galgelegappdistributed.asynctasks;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.ramyar.galgelegappdistributed.frondend.Constants;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

/**
 * Created by Ramyar on 04-05-2017.
 */

public class GetUserAsync extends AppCompatActivity{


    @Nullable
    public static SoapObject getSoapOpdaterSynligtOrd(String... params) {

        SoapObject getSoapOpdaterSynligtOrd = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getSynligtOrd);

        getSoapOpdaterSynligtOrd.addProperty("arg0", params[0]);
        getSoapOpdaterSynligtOrd.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapOpdaterSynligtOrd);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_opdaterSynligtOrd, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapGetBrugteBogstaver(String... params) {
        SoapObject soapGetSoapGetBrugteBogstaver = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_GetBrugteBogstaver);

        soapGetSoapGetBrugteBogstaver.addProperty("arg0", params[0]);
        soapGetSoapGetBrugteBogstaver.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soapGetSoapGetBrugteBogstaver);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_GetBrugteBogstaver, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapGetSynligtOrd(String... params) {

        SoapObject getSoapGetSynligtOrd = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getSynligtOrd);

        getSoapGetSynligtOrd.addProperty("arg0", params[0]);
        getSoapGetSynligtOrd.addProperty("arg1", params[1]);

        System.out.println(params[0]);
        System.out.println(params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGetSynligtOrd);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            System.out.println("R1");
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_getSynligtOrd, envelope);
            System.out.println("R2");
            System.out.println(androidHttpTransport.requestDump);
            System.out.println("R3");
            System.out.println(androidHttpTransport.responseDump);
            System.out.println("R4");
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            System.out.println("R5");
            return resultsRequestSOAP;

        } catch (Exception e) {
            System.out.println("R6");
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapGetOrdet(String... params) {
        SoapObject getSoapGetOrdet = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getOrdet);
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getOrdet);

        getSoapGetOrdet.addProperty("arg0", params[0]);
        getSoapGetOrdet.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGetOrdet);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_getOrdet, envelope);
            androidHttpTransport.call(Constants.SOAP_ACTION_getOrdet, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapGetAntalForkerteBogstaver(String... params) {
        SoapObject antalForkerteBogstaver = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getAntalForkerteBogstaver);

        antalForkerteBogstaver.addProperty("arg0", params[0]);
        antalForkerteBogstaver.addProperty("arg1", params[1]);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(antalForkerteBogstaver);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_getAntalForkerteBogstaver, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapErSidsteBogstavKorrekt(String... params) {
        SoapObject getSoapErSidsteBogstavKorrekt = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_erSidsteBogstavKorrekt);
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_erSidsteBogstavKorrekt);

        getSoapErSidsteBogstavKorrekt.addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapErSidsteBogstavKorrekt);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_erSidsteBogstavKorrekt, envelope);

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


    @Nullable
    public static SoapObject getSoapErSpilletVundet(String... params) {

        SoapObject getSoapErSpilletVundet = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_erSpilletVundet);
        getSoapErSpilletVundet.addProperty("arg0", params[0]);
        getSoapErSpilletVundet.addProperty("arg1", params[1]);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapErSpilletVundet);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_erSpilletVundet, envelope);

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


    @Nullable
    public static SoapObject getSoapErSpilletTabt(String... params) {

        SoapObject getSoapErSpilletTabt = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_hentBruger);

        getSoapErSpilletTabt.addProperty("arg0", params[0]);
        getSoapErSpilletTabt.addProperty("arg1", params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapErSpilletTabt);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_erSpilletTabt, envelope);
            SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
            return resultsRequestSOAP;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return null;
    }


    @Nullable
    public static SoapObject getSoapErSpilletSlut(String... params) {

        SoapObject getSoapErSpilletSlut = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_erSpilletSlut);

        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_erSpilletSlut);


        getSoapErSpilletSlut.addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapErSpilletSlut);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_erSpilletSlut, envelope);

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


    @Nullable
    public static SoapObject getSoapNulstil(String... params) {

        SoapObject getSoapNulstil = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_hentBruger);

        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_nulstil);

        getSoapNulstil.addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapNulstil);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_nulstil, envelope);

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


    @Nullable
    public static SoapObject getSoapGaetBogstav(String... params) {

        SoapObject getSoapGaetBogstav = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_gætBogstav);

        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_gætBogstav);


        getSoapGaetBogstav.addProperty("arg0", params[0]);
        getSoapGaetBogstav.addProperty("arg1", params[1]);
        getSoapGaetBogstav.addProperty("arg2", params[2]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGaetBogstav);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_gætBogstav, envelope);

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


    @Nullable
    public static SoapObject getSoapHentBruger(String... params) {
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_hentBruger);

        soap.addProperty("arg0", params[0]);
        soap.addProperty("arg1", params[1]);

        System.out.println(params[0]);
        System.out.println(params[1]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_hentBruger, envelope);

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


    @Nullable
    public static SoapObject getSoapGetFornavn(String... params) {
        SoapObject getSoapGetFornavn = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getFornavn);
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getFornavn);

        getSoapGetFornavn.addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGetFornavn);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_getFornavn, envelope);

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


    @Nullable
    public static SoapObject getSoapGetRankList(String... params) {
        SoapObject getSoapGetRankList = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getRankLis);
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getRankLis);

        getSoapGetRankList.addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGetRankList);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_getRankList, envelope);

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


    @Nullable
    public static SoapObject getSoapGetScore(String... params) {
        SoapObject getSoapGetScore = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getScore);
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getScore);

        getSoapGetScore.addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGetScore);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_getScore, envelope);

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


    @Nullable
    public static SoapObject getSoapToString(String... params) {
        SoapObject getSoapToString = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_toString);
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_toString);

        getSoapToString.addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapToString);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_toString, envelope);

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




}
