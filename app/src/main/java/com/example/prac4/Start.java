package com.example.prac4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Start#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Start extends Fragment {




    public Start() {
        // Required empty public constructor
    }


    public static Start newInstance(String param1, String param2) {
        Start fragment = new Start();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_start, container, false);

        Button Log_button = v.findViewById(R.id.to_Log_button);
        Button Sign_up_button = v.findViewById(R.id.to_Sign_up_button);

        Log_button.setOnClickListener(new View.OnClickListener() {
            Log_in fragment2 = new Log_in();
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragments(fragment2);
            }
        });
        Sign_up_button.setOnClickListener(new View.OnClickListener() {
            Sign_up fragment3 = new Sign_up();
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragments(fragment3);
            }
        });
        return v;
    }
}