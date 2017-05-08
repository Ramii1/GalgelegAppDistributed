package com.example.ramyar.galgelegappdistributed.frondend;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.ramyar.galgelegappdistributed.asynctasks.GetUserAsync;


public class HighScoreLogic
{
    Integer[] rank;
    String[]  userId;
    Integer[] score;
    String[] time;
    SharedPreferences sharedPreferences;
    GetUserAsync getUser = new GetUserAsync();

    public HighScoreLogic(Context context)
    {
        sharedPreferences  = context.getSharedPreferences("highScore", Context.MODE_PRIVATE );
        rank = new Integer[][20];
        userId = new String[15];
        score = new Integer[20]
        time = new String[20];

        for (int i = 0; i < 20; i++)
        {

            rank[i] = sharedPreferences.getInt("rank"+i, Integer.parseInt(""));
            userId[i] = sharedPreferences.getString("userID"+i, "");
        }
    }

    public boolean setHighScore(int rank , String userId, int score, String time)
    {
        int index;
        for (index = 0; index < 20 && this.score[index] > score; index++);
        if (index == 20)
        {
            return false;
        }

        for (int i = 19; i > index; i-- )
        {
            this.rank[i] = this.rank[i-1];
            this.userId[i] = this.userId[i-1];
        }

        this.rank[index] = new String(rank);
        this.userId[index] = userId;

        SharedPreferences.Editor editor = sharedPreferences.edit();
        for (int j = 0; j < 20; j++)
        {
            editor.putInt("rank" + j , Integer.parseInt(this.rank.toString()));
            editor.putString("userId" + j , String.valueOf(Integer.parseInt(this.userId[j])));
        }
        editor.commit();
        return true;
    }
}
