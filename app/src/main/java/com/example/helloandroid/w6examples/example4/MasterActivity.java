package com.example.helloandroid.w6examples.example4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.helloandroid.R;
import com.example.helloandroid.w6examples.example1.HelloFragment;

import static com.example.helloandroid.w6examples.example4.Example4Activity.LABEL_WHAT_TO_LOAD;

/**
 * Created by roxanan on 17,April,2019
 */
public class MasterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);

        String whatToLoad = getIntent().getStringExtra(LABEL_WHAT_TO_LOAD);

        if (whatToLoad.equals("hello")) {
            addHelloFragment();
        } else if (whatToLoad.equals("another")) {
            addOtherFragment();
        }
    }

    private void addOtherFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.detail, new Another4Fragment(), Another4Fragment.class.getSimpleName())
                .commit();
    }

    private void addHelloFragment() {
        Hello4Fragment fragment = new Hello4Fragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.detail, fragment, Hello4Fragment.class.getSimpleName())
                .commit();
    }

}
