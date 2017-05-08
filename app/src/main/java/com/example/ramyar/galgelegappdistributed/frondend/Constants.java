package com.example.ramyar.galgelegappdistributed.frondend;

import android.app.Application;

import java.util.ArrayList;


public class Constants extends Application
{


    /* SOAP */
    public static String NAMESPACE = "http://galgeleg/";
    public static String URL = "http://130.226.195.227:9591/galgelegtjeneste?wsdl";
    public static String SOAP_ACTION1 = "http://galgeleg/hentBrugerRequest";
    public static String SOAP_ACTION2 = "http://galgeleg/getScore";
    public static String METHOD_NAME1 = "hentBruger";
    public static String METHOD_NAME2 = "hentBruger";

    public static ArrayList<String> wordList = new ArrayList<String>();
    static String gameType;
    static String ordet;
    static String name;

}
