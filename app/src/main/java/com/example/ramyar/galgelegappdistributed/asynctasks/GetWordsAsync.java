/*
package com.example.ramyar.galgelegappdistributed.asynctasks;

import android.os.AsyncTask;

import com.example.ramyar.galgelegappdistributed.frondend.Constants;
import com.example.ramyar.galgelegappdistributed.frondend.Logic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class GetWordsAsync extends AsyncTask<Void, Void, ArrayList<String>>
{

    private Logic logic;

    @Override
    protected ArrayList<String> doInBackground(Void... params)
    {
        ArrayList<String> downloadedWordList = new ArrayList<String>();

        try
        {
            String data = logic.hentUrl("http://dr.dk");
            data = data.replaceAll("<.+?>", " ").toLowerCase().replaceAll("[^a-zæøå]", " ");
            downloadedWordList.clear();
            downloadedWordList.addAll(new HashSet<String>(Arrays.asList(data.split(" "))));

            System.out.println("doInBackground: Mulige ord efter de er tilføjet til listen = " + downloadedWordList);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return downloadedWordList;
    }

    @Override
    protected void onPostExecute(ArrayList<String> downloadedWordList)
    {
        Constants.wordList = downloadedWordList;
    }
}
*/
