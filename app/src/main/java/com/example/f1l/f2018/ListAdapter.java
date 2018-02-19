package com.example.f1l.f2018;

/**
 * Created by F1L on 05.02.2017.
 */

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter{
    Context ctx;
    LayoutInflater lInflater;
    ArrayList<Item> objects;
    ArrayList<Item> sub_objects;

    ListAdapter(Context context, ArrayList<Item> products, ArrayList<Item> sub_products) {
        ctx = context;
        objects = products;
        sub_objects = sub_products;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public int getCount() {
        return objects.size();
    }

    public Object getItem(int position) {
        return objects.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {

            view = lInflater.inflate(R.layout.one_position, parent, false);
        }

        Item p = getProduct(position);

        ((TextView) view.findViewById(R.id.tvDescr)).setText(p.name);
        ((TextView) view.findViewById(R.id.tvDescribe)).setText(p.subname);
        ((ImageView) view.findViewById(R.id.ivImage)).setImageResource(p.ic_l);
        return view;
    }

    Item getProduct(int position) {
        return ((Item) getItem(position));
    }

    public String getfelement () {return getProduct(0).name;}

}
