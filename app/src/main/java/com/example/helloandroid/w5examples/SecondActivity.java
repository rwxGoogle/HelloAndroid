package com.example.helloandroid.w5examples;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloandroid.R;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        Button finishSecondActivity = findViewById(R.id.finish_second_activity);

        finishSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finishSecond = new Intent();
                setResult(Activity.RESULT_CANCELED, finishSecond);
                finish();
            }
        });
    }
}
