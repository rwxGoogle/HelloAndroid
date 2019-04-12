package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloandroid.R;

/**
 * Created by roxanan on 10,April,2019
 */

public class W5FirstActivity extends AppCompatActivity {
    private static final String TAG = W5FirstActivity.class.getSimpleName();
    private static final int SECOND_RESULT_KEY = 13;
    static final String SAVE_INSTANCE_STATE_MESSAGE_KEY = "message";
    static final String EXTRA_KEY = "extra_key";
    private Button startSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w5_first);

        Log.d(TAG, "savedInstanceState " + savedInstanceState);

        getSaveInstanceStateMessage(savedInstanceState);

        startSecondActivity = findViewById(R.id.start_activity_button);

        startSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startSecondActivity();
                startSecondActivityForResult();
            }
        });
    }

    private void getSaveInstanceStateMessage(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            String message = savedInstanceState.getString(SAVE_INSTANCE_STATE_MESSAGE_KEY);
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }

    private void startSecondActivity() {
        Intent intent = new Intent(this, W5SecondActivity.class);
        intent.putExtra(EXTRA_KEY, 134);
        startActivity(intent);
    }

    private void startSecondActivityForResult() {
        Intent intent = new Intent(this, W5SecondActivity.class);
        startActivityForResult(intent, SECOND_RESULT_KEY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == SECOND_RESULT_KEY) {
            if (resultCode == Activity.RESULT_OK) {
                assert data != null;
                String result = data.getStringExtra(W5SecondActivity.RESULT_KEY);
                startSecondActivity.setText(result);
            }

            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Write your code if there's no result", Toast.LENGTH_LONG).show();
            }
        }
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        String message = "Android Message";
        outState.putString(SAVE_INSTANCE_STATE_MESSAGE_KEY, message);
        super.onSaveInstanceState(outState);
    }
}
