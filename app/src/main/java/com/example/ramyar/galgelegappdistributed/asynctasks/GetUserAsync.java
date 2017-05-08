package com.example.ramyar.galgelegappdistributed.asynctasks;

import android.support.annotation.Nullable;

import com.example.ramyar.galgelegappdistributed.frondend.Constants;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

/**
 * Created by Ramyar on 04-05-2017.
 */

public class GetUserAsync {


    @Nullable
    public static SoapObject getSoapOpdaterSynligtOrd(String... params) {
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_opdaterSynligtOrd);

         SoapObject getSoapOpdaterSynligtOrd = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getSynligtOrd);


        getSoapOpdaterSynligtOrd.addProperty("opdaterSynligtOrd ", params[0]);

        System.out.println(params[0]);


        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapOpdaterSynligtOrd);

        System.out.println("soap getSoapOpdaterSynligtOrd " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_opdaterSynligtOrd, envelope);

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
    public static SoapObject getSoapGetBrugteBogstaver(String... params) {
        SoapObject soapGetSoapGetBrugteBogstaver = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_GetBrugteBogstaver);

        soapGetSoapGetBrugteBogstaver.addProperty("brugte bogstaver", params[0]);
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_GetBrugteBogstaver);

        System.out.println(params[0]);


        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soapGetSoapGetBrugteBogstaver);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_GetBrugteBogstaver, envelope);

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
    public static SoapObject getSoapGetSynligtOrd(String... params) {
        SoapObject getSoapGetSynligtOrd = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getSynligtOrd);
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getSynligtOrd);

        getSoapGetSynligtOrd.addProperty("synligtOrd", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGetSynligtOrd);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_getSynligtOrd, envelope);

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
    public static SoapObject getSoapGetOrdet(String... params) {
        SoapObject getSoapGetOrdet = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getOrdet);
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getOrdet);

        getSoapGetOrdet.addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGetOrdet);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_getOrdet, envelope);
            androidHttpTransport.call(Constants.SOAP_ACTION_getOrdet, envelope);

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
    public static SoapObject getSoapGetAntalForkerteBogstaver(String... params) {
        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_getAntalForkerteBogstaver);

        getSoapGetAntalForkerteBogstaver().addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGetAntalForkerteBogstaver());

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_getAntalForkerteBogstaver, envelope);

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

        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_erSpilletVundet);


        getSoapErSpilletVundet.addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapErSpilletVundet);

        System.out.println("soap output " + envelope.toString());

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

        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_erSpilletTabt);


        getSoapErSpilletTabt.addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapErSpilletTabt);

        System.out.println("soap output " + envelope.toString());

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Constants.URL);
        try {
            androidHttpTransport.debug = true;
            androidHttpTransport.call(Constants.SOAP_ACTION_erSpilletTabt, envelope);

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
    public static SoapObject getSoapGætBogstav(String... params) {

        SoapObject getSoapGætBogstav = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_gætBogstav);

        SoapObject soap = new SoapObject(Constants.NAMESPACE, Constants.METHOD_NAME_gætBogstav);


        getSoapGætBogstav.addProperty("arg0", params[0]);
        System.out.println(params[0]);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(getSoapGætBogstav);

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
