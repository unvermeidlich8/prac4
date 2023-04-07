package com.example.prac4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Sign_up extends Fragment {


    public Sign_up() {
        // Required empty public constructor
    }


    public static Sign_up newInstance(String param1, String param2) {
        Sign_up fragment = new Sign_up();
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

        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        List <Item> itemList = new ArrayList<>();
        for (int i = 0;i < 200;i++) {
            itemList.add(new Item(R.drawable.test,"Test"+i));
        }

        RecyclerView recyclerView = view.findViewById(R.id.recycleid);
        CustomRecycleAdapter customRecycleAdapter = new CustomRecycleAdapter(getContext(),itemList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(customRecycleAdapter);
        return  view;
    }

}