package com.example.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class W3Challenge1Activity extends AppCompatActivity {
    private EditText email;
    private EditText phone;
    private Button submit;
    private CheckBox tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third3);

        initViews();

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Toast.makeText(W3Challenge1Activity.this, s.toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        tc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(W3Challenge1Activity.this, "Check state = " + isChecked, Toast.LENGTH_LONG).show();
            }
        });


//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (email.getText().toString().equals("")) {
//                    email.setError("Fill the input with a valid input address");
//                } else {
//                    email.setError(null);
//                }
//
//                if (phone.getText().toString().equals("")) {
//                    phone.setError("Fill the input with a valid input phone");
//                }
//            }
//        });
    }

    private void initViews() {
        email = findViewById(R.id.email_input);
        phone = findViewById(R.id.phone_input);
        submit = findViewById(R.id.login);
        tc = findViewById(R.id.checkbox_tc);
    }

    public void onLoginClicked(View v) {
        if (email.getText().toString().equals("")) {
            email.setError("Fill the input with a valid input address");
        } else {
            email.setError(null);
        }

        if (phone.getText().toString().equals("")) {
            phone.setError("Fill the input with a valid input phone");
        }
    }
}
