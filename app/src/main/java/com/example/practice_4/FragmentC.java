package com.example.practice_4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

import com.example.practice_4.databinding.FragmentCBinding;

import java.util.ArrayList;
import java.util.List;

public class FragmentC extends Fragment {
    public FragmentC() {
        super(R.layout.fragment_c);
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<Item> dataList = new ArrayList<>();
        for (int i = 0; i < 201; i++) {
            dataList.add(new Item("Dog " + i, R.drawable.dog));
        }
        YourCustomRecyclerViewAdapter adapter = new YourCustomRecyclerViewAdapter(dataList);
        recyclerView.setAdapter(adapter);
        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }
    public void onStart() {
        super.onStart();
    }
    public void onResume() {
        super.onResume();
    }
    public void onPause() {
        super.onPause();
    }
    public void onStop() {
        super.onStop();
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
    public void onDestroyView() {
        super. onDestroyView();
    }
    public void onDestroy() {
        super.onDestroy();
    }
}
