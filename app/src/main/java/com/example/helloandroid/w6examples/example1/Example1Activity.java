package com.example.helloandroid.w6examples.example1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.helloandroid.R;

/**
 * Created by roxanan on 17,April,2019
 */
public class Example1Activity extends AppCompatActivity {
    static final String LABEL = "label";
    static final String LABEL_INT = "label_int";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1);

        Bundle bundle = new Bundle();
        bundle.putString(LABEL, "This is an activity label");
        bundle.putInt(LABEL_INT, 12);

        HelloFragment fragment = new HelloFragment();
        fragment.setArguments(bundle);


        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame, fragment, HelloFragment.class.getSimpleName())
                .commit();
    }
}
