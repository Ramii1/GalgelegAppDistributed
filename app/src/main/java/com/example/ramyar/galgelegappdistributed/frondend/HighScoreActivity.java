package com.example.ramyar.galgelegappdistributed.frondend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ramyar.galgelegappdistributed.R;


public class HighScoreActivity extends AppCompatActivity
{

    private ListView rank_label, user_id_label, score_label, time_label;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);

        rank_label = (ListView) findViewById(R.id.listview2);
        user_id_label = (ListView) findViewById(R.id.listview3);
        score_label = (ListView) findViewById(R.id.listview4);
        time_label= (ListView) findViewById(R.id.listview5);

        HighScoreLogic highScoreLogic = new HighScoreLogic(this);

        ArrayAdapter rankAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, highScoreLogic.rank );
        ArrayAdapter userIdAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, highScoreLogic.userId);
        ArrayAdapter scoreAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, highScoreLogic.score);
        ArrayAdapter timeAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, highScoreLogic.time);

        rank_label.setAdapter(rankAdapter);
        user_id_label.setAdapter(userIdAdapter);
        user_id_label.setAdapter(scoreAdapter);
        user_id_label.setAdapter(timeAdapter);

    }
}
