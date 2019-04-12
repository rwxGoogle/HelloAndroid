package com.example.helloandroid.w5examples;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloandroid.R;

public class ThirdActivity extends AppCompatActivity {
    static final String EXTRA_DATA = "extra_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);

        Button finishThirdActivity = findViewById(R.id.finish_third_activity);

        finishThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finishThird = new Intent();
                finishThird.putExtra(EXTRA_DATA, "Yey we Got it");
                setResult(Activity.RESULT_OK, finishThird);
                finish();
            }
        });
    }
}
