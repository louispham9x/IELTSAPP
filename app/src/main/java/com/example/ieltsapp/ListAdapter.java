package com.example.ieltsapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ListAdapter extends BaseAdapter {
    MainActivity context;
    int layout;
    List<String> list;
    public ListAdapter(MainActivity context, int layout, List<String> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class Holder
    {
        TextView textView;
        FrameLayout frameLayout;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder = null;
        if (view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new Holder();
            holder.textView = (TextView) view.findViewById(R.id.txtTenBai);
            holder.frameLayout = (FrameLayout) view.findViewById(R.id.frameitem);
            view.setTag(holder);
        }
        else
        {
            holder = (Holder) view.getTag();
        }
        holder.textView.setText(list.get(i));
        final FrameLayout frameLayout = holder.frameLayout;
        final int ii = i;
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = context.fragmentManager;
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentA fragmentA = (FragmentA) fragmentManager.findFragmentByTag("FragA"+ii);
                if (fragmentA == null)
                fragmentTransaction.add(frameLayout.getId(), new FragmentA(), "FragA"+ii);
                else
                    fragmentTransaction.remove(fragmentA);
               fragmentTransaction.commit();

            }
        });
        return view;
    }
}
