package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by roxanan on 10,April,2019
 */

public class W5SecondActivity extends AppCompatActivity {
    private TextView androidTextView;
    static final String RESULT_KEY = "result_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w5_second);

        Button closeSecondActivity = findViewById(R.id.close_activity_button);
        androidTextView = findViewById(R.id.android_text_view);

        getBundle();

        closeSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setResultCancel();
                setResultOk();

                //Close the Activity
                //finish();
            }
        });
    }

    private void getBundle() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int extra = bundle.getInt(W5FirstActivity.EXTRA_KEY);
            androidTextView.setText(String.valueOf(extra));
        }
    }

    private void setResultCancel() {
        Intent intent = new Intent();
        setResult(Activity.RESULT_CANCELED, intent);
        finish();
    }

    private void setResultOk() {
        String resultValue = "Android";
        Intent intent = new Intent();
        intent.putExtra(RESULT_KEY, resultValue);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
