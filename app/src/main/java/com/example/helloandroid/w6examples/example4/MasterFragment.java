package com.example.helloandroid.w6examples.example4;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.helloandroid.R;

/**
 * Created by roxanan on 17,April,2019
 */
public class MasterFragment extends Fragment {
    private Listener listener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_master, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.item1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.showHello4Fragment();
            }
        });

        view.findViewById(R.id.item2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.showAnother4Fragment();
            }
        });
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }
}
