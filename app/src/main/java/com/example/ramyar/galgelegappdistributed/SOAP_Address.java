package com.example.ramyar.galgelegappdistributed;

import android.app.Application;

/**
 * Created by Ramyar on 04-05-2017.
 */

public class SOAP_Address extends Application
{
    public static String NAMESPACE = "http://galgelegport/wsdl";
    public static String URL = "http://ubuntu4.javabog.dk:9591/Gruppe11/GalgeService?wsdl";

    public static String SOAP_ACTION_hentBruger = "http://galgelegport/wsdl/hentBrugerRequest";
    public static String METHOD_NAME_hentBruger = "hentBruger";
    public static String SOAP_ACTION_GetBrugteBogstaver = "http://galgelegport/wsdl/getBrugteBogstaverRequest";
    public static String METHOD_NAME_GetBrugteBogstaver = "getBrugteBogstaver";
    public static String SOAP_ACTION_getSynligtOrd = "http://galgelegport/wsdl/getSynligtOrdRequest";
    public static String METHOD_NAME_getSynligtOrd = "getSynligtOrd";
    public static String SOAP_ACTION_getOrdet = "http://galgelegport/wsdl/getOrdetRequest";
    public static String METHOD_NAME_getOrdet = "getOrdet";
    public static String SOAP_ACTION_getAntalForkerteBogstaver = "http://galgelegport/wsdl/getAntalForkerteBogstaverRequest";
    public static String METHOD_NAME_getAntalForkerteBogstaver = "getAntalForkerteBogstaver";
    public static String SOAP_ACTION_erSidsteBogstavKorrekt = "http://galgelegport/wsdl/erSidsteBogstavKorrektRequest";
    public static String METHOD_NAME_erSidsteBogstavKorrekt = "erSidsteBogstavKorrekt";
    public static String SOAP_ACTION_erSpilletVundet = "http://galgelegport/wsdl/erSpilletVundetRequest";
    public static String METHOD_NAME_erSpilletVundet = "erSpilletVundet";
    public static String SOAP_ACTION_erSpilletTabt = "http://galgelegport/wsdl/erSpilletTabtRequest";
    public static String METHOD_NAME_erSpilletTabt = "erSpilletTabt";
    public static String SOAP_ACTION_erSpilletSlut = "http://galgelegport/wsdl/erSpilletSlutRequest";
    public static String METHOD_NAME_erSpilletSlut = "erSpilletSlut";
    public static String SOAP_ACTION_nulstil = "http://galgelegport/wsdl/nulstilRequest";
    public static String METHOD_NAME_nulstil = "nulstil";
    public static String SOAP_ACTION_opdaterSynligtOrd = "http://galgelegport/wsdl/opdaterSynligtOrdRequest";
    public static String METHOD_NAME_opdaterSynligtOrd = "opdaterSynligtOrd";
    public static String SOAP_ACTION_gætBogstav = "http://galgelegport/wsdl/gætBogstavRequest";
    public static String METHOD_NAME_gætBogstav = "gætBogstav";

    public static String SOAP_ACTION_getFornavn = "http://galgelegport/wsdl/getFornavnRequest";
    public static String METHOD_NAME_getFornavn = "getFornavn";
    public static String SOAP_ACTION_getRankList = "http://galgelegport/wsdl/getRankListRequest";
    public static String METHOD_NAME_getRankLis = "getRankList";
    public static String SOAP_ACTION_getScore = "http://galgelegport/wsdl/getScoreRequest";
    public static String METHOD_NAME_getScore = "getScore";
    public static String SOAP_ACTION_toString = "http://galgelegport/wsdl/toStringRequest";
    public static String METHOD_NAME_toString = "toString";
}
