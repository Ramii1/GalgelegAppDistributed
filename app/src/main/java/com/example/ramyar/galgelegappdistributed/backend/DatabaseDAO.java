package com.example.ramyar.galgelegappdistributed.backend;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by haydar on 05/05/2017.
 */

public class DatabaseDAO {
    DatabaseFunc databaseFunc = new DatabaseFunc();

    private final String HOST     = "galgeproject.cxyxxbzjqour.us-west-2.rds.amazonaws.com";
    private final int    PORT     = 3306;
    private final String DATABASE = "GalgeLegDB";
    private final String USERNAME = "gruppe11";
    private final String PASSWORD = "gruppe11";

    private Connector connector = new Connector("HOST","DATABASE","USERNAME","PASSWORD");
    Statement statement = null;

    public DatabaseDAO() throws ClassNotFoundException {
    }

    public void sendHighscore() throws SQLException{

        connector.doUpdate("SELECT  @curRank := @curRank + 1  AS rank, user_id, score, time  FROM ( SELECT @curRank := 0) r,  Highscore h  ORDER BY  score DESC");


    }
        public ArrayList<String> getHighscore(String s) throws SQLException {
        ArrayList<ArrayList<String>> hs = new ArrayList(){};
        hs.add(new ArrayList<String>());
        hs.add(new ArrayList<String>());
        hs.add(new ArrayList<String>());
        hs.add(new ArrayList<String>());


        String sql ="SELECT  @curRank := @curRank + 1  AS rank, user_id, score, time  FROM ( SELECT @curRank := 0) r,  Highscore h  ORDER BY  score DESC";

        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()){
            hs.get(0).add(rs.getString("rank"));
            hs.get(1).add(rs.getString("user_id"));
            hs.get(2).add(rs.getString("score"));
            hs.get(3).add(rs.getString("time"));

        }
        return getHighscore("Highscore");
    }


}
