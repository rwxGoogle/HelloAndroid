package com.example.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class W3ExamplesActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private WebView webview;
    private Spinner spinner;
    private String[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        initViews();

        setWebViewURL();
        array = getResources().getStringArray(R.array.data);

        spinner.setAdapter(getAdapter());

        spinner.setOnItemSelectedListener(this);
    }

    private void setWebViewURL() {
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.loadUrl("https://www.google.com");
    }

    private void initViews() {
        webview = findViewById(R.id.webView);
        spinner = findViewById(R.id.spinner);
    }

    private List<String> getData() {
        List<String> data = new ArrayList();
        data.add("Data 1");
        data.add("Data 2");
        data.add("Data 3");

        return data;
    }

    private ArrayAdapter<String> getAdapter() {
        return new ArrayAdapter(this, android.R.layout.simple_spinner_item, array);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(W3ExamplesActivity.this, "Position clicked= " + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
