package edu.gatech.rendezvous.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import edu.gatech.rendezvous.R;

public class FriendListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_list);
        getSupportActionBar().hide();
    }


}
