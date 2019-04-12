package com.example.helloandroid.w5examples;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.helloandroid.R;

public class FirstActivity extends AppCompatActivity {
    private static final String TAG = FirstActivity.class.getSimpleName();
    private static final String NAME_KEY = "name_key";
    private static final String NUMBER_KEY = "number_key";
    private static final int SECOND_REQUEST_CODE = 2;
    private static final int THIRD_REQUEST_CODE = 3;
    EditText inputName;
    EditText inputNumber;
    String name;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button startSecondActivity = findViewById(R.id.start_second_activity);
        Button startThirdActivity = findViewById(R.id.start_third_activity);

        inputName = findViewById(R.id.name_input);
        inputNumber = findViewById(R.id.number_input);

        if (savedInstanceState != null) {
            String storedName = savedInstanceState.getString(NAME_KEY);
            String storedNumber = savedInstanceState.getString(NUMBER_KEY);

            Log.d(TAG, "Stored Name= " + storedName);
            Log.d(TAG, "Stored Number= " + storedNumber);
        }

        inputName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                name = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        inputNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                number = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        startSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivityForResult(secondIntent, SECOND_REQUEST_CODE);
            }
        });

        startThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdIntent = new Intent(FirstActivity.this, ThirdActivity.class);
                startActivityForResult(thirdIntent, THIRD_REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(NAME_KEY, name);
        outState.putString(NUMBER_KEY, number);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == SECOND_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                Log.d(TAG, "result code= " + resultCode + " requestCode= " + requestCode);
            } else if (resultCode == Activity.RESULT_CANCELED) {
                Log.d(TAG, "result code= " + resultCode + " requestCode= " + requestCode);
            }
        } else if (requestCode == THIRD_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                Log.d(TAG, "result code= " + resultCode + " requestCode= " + requestCode);
                if (data != null) {
                    inputName.setText(data.getStringExtra(ThirdActivity.EXTRA_DATA));
                }
            } else if (resultCode == Activity.RESULT_CANCELED) {
                Log.d(TAG, "result code= " + resultCode + " requestCode= " + requestCode);
            }
        }
    }
}
