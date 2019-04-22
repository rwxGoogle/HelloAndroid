package com.example.helloandroid.w6examples.example1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.helloandroid.R;

import static com.example.helloandroid.w6examples.example1.Example1Activity.LABEL;
import static com.example.helloandroid.w6examples.example1.Example1Activity.LABEL_INT;

/**
 * Created by roxanan on 17,April,2019
 */
public class HelloFragment extends Fragment {

    private String label;
    private int labelInt;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            this.label = getArguments().getString(LABEL, "Buuu!");
            this.labelInt = getArguments().getInt(LABEL_INT, 0);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hello, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ((TextView) view.findViewById(R.id.hello_label)).setText(label + labelInt);
    }
}
