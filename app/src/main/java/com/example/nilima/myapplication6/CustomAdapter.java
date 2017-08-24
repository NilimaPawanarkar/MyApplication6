package com.example.nilima.myapplication6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nilima on 23/8/17.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    String bookName[];
    int bookimage[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] bookName, int[] bookimage) {
        this.context = context;
        this.bookName = bookName;
        this.bookimage = bookimage;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return bookName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.listview_activity, null);
        TextView name = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        name.setText(bookName[i]);
        icon.setImageResource(bookimage[i]);
        return view;
    }

}
