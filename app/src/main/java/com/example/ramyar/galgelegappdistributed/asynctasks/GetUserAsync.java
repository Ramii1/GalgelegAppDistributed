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
    public static SoapObject getSoapGetBrugteBogstaver(String... params) {
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
    public static SoapObject getSoapGetSynligtOrd(String... params) {
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
    public static SoapObject getSoapGetOrdet(String... params) {
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
    public static SoapObject getSoapGetAntalForkerteBogstaver(String... params) {
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
    public static SoapObject getSoapErSidsteBogstavKorrekt(String... params) {
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
    public static SoapObject getSoapErSpilletVundet(String... params) {
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
    public static SoapObject getSoapErSpilletTabt(String... params) {
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
    public static SoapObject getSoapErSpilletSlut(String... params) {
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
    public static SoapObject getSoapNulstil(String... params) {
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
    public static SoapObject getSoapGætBogstav(String... params) {
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
    public static SoapObject getSoapGetRankList(String... params) {
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
    public static SoapObject getSoapGetScore(String... params) {
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
    public static SoapObject getSoapToString(String... params) {
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




}
