package com.example.helloandroid.w6examples.example2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.helloandroid.R;

/**
 * Created by roxanan on 17,April,2019
 */
public class Hello2Fragment extends Fragment {

    private TextView helloLabel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hello2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.helloLabel = ((TextView) view.findViewById(R.id.hello_label));
    }

    public void setLabel(String label) {
        helloLabel.setText(label);
    }
}
