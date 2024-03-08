package com.example.practice_4;

import android.content.Context;
import android.media.RouteListingPreference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class YourCustomListAdapter extends ArrayAdapter<Item> {
    private Context context;
    private List<Item> dataList;

    public YourCustomListAdapter(Context context, List<Item> dataList) {
        super(context, R.layout.list_item, dataList);
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textView);
        Item item = dataList.get(position);
        imageView.setImageResource(item.getImageResId());
        textView.setText(item.getName());
        return convertView;
    }
}

