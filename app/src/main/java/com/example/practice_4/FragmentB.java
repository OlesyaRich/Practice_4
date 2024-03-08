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
import android.widget.AdapterView;
import android.widget.EditText;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.practice_4.databinding.FragmentBBinding;

import java.util.ArrayList;
import java.util.List;

public class FragmentB extends Fragment {
    public FragmentB() {
        super(R.layout.fragment_b);
    }
    private ListView listView;
    private YourCustomListAdapter adapter;
    private List<Item> dataList;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        listView = view.findViewById(R.id.listView);
        dataList = generateDataList();
        adapter = new YourCustomListAdapter(getActivity(), dataList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item = dataList.get(position);
                Toast.makeText(getActivity(), "Clicked on: " + (item.getName()), Toast.LENGTH_LONG).show();
                Log.d("MyFragment", "Clicked on: " + item.getName());
            }
        });
        return view;
    }
    private List<Item> generateDataList() {
        List<Item> data = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            data.add(new Item("Cat " + i, R.drawable.cat));
        }
        return data;
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
