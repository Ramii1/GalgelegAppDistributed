package com.example.ramyar.galgelegappdistributed.backend;

import org.json.JSONException;
import org.json.JSONObject;

import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import java.util.concurrent.ExecutionException;

/**
 * Created by haydar on 05/05/2017.
 */

public class DatabaseFunc {

    private static final String REST_ROOT_URL = "http://galgeleg.dk/GalgelegWeb/AndroidServlet";
    private static final String PARAMETER_TYPE = "?type=";
    private static final String PARAMETER_SID = "&sid=";
    private static final String TYPE_HENTBRUGER = "hentBruger";

    public String hentBruger(String user_id) throws ExecutionException, InterruptedException, JSONException, ClassNotFoundException, SQLException {
        JSONObject returnObj = new JSONObject((Map) new DatabaseDAO().getHighscore(REST_ROOT_URL + PARAMETER_TYPE + TYPE_HENTBRUGER + PARAMETER_SID));
        return returnObj.getString("user_id");
    }
}