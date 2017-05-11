package com.example.ramyar.galgelegappdistributed;

/**
 * Created by Ramyar on 09-05-2017.
 */

public class Login
{
    private static String _brugernavn;
    private static String _password;

    public static String getBrugernavn()
    {
        return _brugernavn;
    }

    public static String getPassword()
    {
        return _password;
    }

    public static void setBrugernavn(String brugernavn)
    {
        _brugernavn = brugernavn;
    }

    public static void setPassword(String password)
    {
        _password = password;
    }
}
