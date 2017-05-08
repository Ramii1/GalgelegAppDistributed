package com.example.ramyar.galgelegappdistributed.frondend;

import android.app.Application;

import java.util.ArrayList;


public class Constants extends Application
{


    /* SOAP */
    public static String NAMESPACE = "http://galgelegport/wsdl/";
    public static String URL = "http://ubuntu4.javabog.dk:9591/Gruppe11/GalgeService?wsdl";

    public static String SOAP_ACTION_GetBrugteBogstaver = "http://galgeleg/getBrugteBogstaverRequest";
    public static String METHOD_NAME_GetBrugteBogstaver = "getBrugteBogstaver";
    public static String SOAP_ACTION_getSynligtOrd = "http://galgeleg/getSynligtOrdRequest";
    public static String METHOD_NAME_getSynligtOrd = "tns:getSynligtOrd";
    public static String SOAP_ACTION_getOrde = "http://galgeleg/getOrdetRequest";
    public static String METHOD_NAME_getOrdet = "getOrdet";
    public static String SOAP_ACTION_getAntalForkerteBogstaver = "http://galgeleg/getAntalForkerteBogstaverRequest";
    public static String METHOD_NAME_getAntalForkerteBogstaver = "getAntalForkerteBogstaver";
    public static String SOAP_ACTION_erSidsteBogstavKorrekt = "http://galgeleg/erSidsteBogstavKorrektRequest";
    public static String METHOD_NAME_erSidsteBogstavKorrekt = "erSidsteBogstavKorrekt";
    public static String SOAP_ACTION_erSpilletVundet = "http://galgeleg/erSpilletVundetRequest";
    public static String METHOD_NAME_erSpilletVundet = "erSpilletVundet";
    public static String SOAP_ACTION_erSpilletTabt = "http://galgeleg/erSpilletTabtRequest";
    public static String METHOD_NAME_erSpilletTabt = "erSpilletTabt";
    public static String SOAP_ACTION_erSpilletSlut = "http://galgeleg/erSpilletSlutRequest";
    public static String METHOD_NAME_erSpilletSlut = "erSpilletSlut";
    public static String SOAP_ACTION_nulstil = "http://galgeleg/nulstilRequest";
    public static String METHOD_NAME_nulstil = "nulstil";
    public static String SOAP_ACTION_opdaterSynligtOrd = "http://galgeleg/opdaterSynligtOrdRequest";
    public static String METHOD_NAME_opdaterSynligtOrd = "opdaterSynligtOrd";
    public static String SOAP_ACTION_gætBogstav = "http://galgeleg/gætBogstavRequest";
    public static String METHOD_NAME_gætBogstav = "gætBogstav";
    public static String SOAP_ACTION_hentBruger = "http://galgeleg/hentBrugerRequest";
    public static String METHOD_NAME_hentBruger = "hentBruger";

    public static ArrayList<String> wordList = new ArrayList<String>();
    static String gameType;
    static String ordet;
    static String name;

}
