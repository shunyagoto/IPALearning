package com.example.agoto.ipalearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IPAtableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipatable);
    }

    public void onHaikiryuButtonTapped(View view){
        Intent intent = new Intent(this, haikiryuActivity.class);
        startActivity(intent);
    }
}
