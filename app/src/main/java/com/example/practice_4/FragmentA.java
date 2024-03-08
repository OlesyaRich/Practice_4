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

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

import com.example.practice_4.databinding.FragmentABinding;

public class FragmentA extends Fragment {
    public FragmentA() {
        super(R.layout.fragment_a);
    }
    private FragmentABinding binding;
    final String LOG_TAG = "myLogs";
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentABinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button_toB = requireView().findViewById(R.id.b_tofrag_b);
        button_toB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentB nextFrag= new FragmentB();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentA_container_view, nextFrag)
                        .addToBackStack(null)
                        .commit();
            }
        });
        Button button_toC = requireView().findViewById(R.id.b_tofrag_c);
        button_toC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentC nextFrag= new FragmentC();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentA_container_view, nextFrag)
                        .addToBackStack(null)
                        .commit();
            }
        });
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
