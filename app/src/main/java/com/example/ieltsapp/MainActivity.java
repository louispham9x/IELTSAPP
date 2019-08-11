package com.example.ieltsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ListView listView;
   public FragmentManager fragmentManager = getFragmentManager();
   ArrayList<String> listBai;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KhoiTao();
        AnhXa();
        XuLy();
    }

    private void KhoiTao() {
        listBai = new ArrayList<>();
        listBai.add("Practice Test 1");
        listBai.add("Practice Test 2");
        listBai.add("Practice Test 3");
        listBai.add("Practice Test 4");
        listBai.add("Practice Test 5");
        listBai.add("Practice Test 6");
        listBai.add("Practice Test 7");
        listBai.add("Practice Test 8");
        listBai.add("Practice Test 9");
        listBai.add("Practice Test 10");
        listBai.add("Practice Test 11");
        listBai.add("Practice Test 12");
        listBai.add("Practice Test 13");
        listBai.add("Practice Test 14");
        listBai.add("Practice Test 15");
        listBai.add("Practice Test 16");
        listBai.add("Practice Test 17");
        listBai.add("Practice Test 18");
        listBai.add("Practice Test 19");
        listBai.add("Practice Test 20");

    }

    private void XuLy() {

    }

    private void AnhXa() {
        listView = (ListView) findViewById(R.id.listmain);
        ListAdapter adapter = new ListAdapter(MainActivity.this, R.layout.layout_item, listBai);
        listView.setAdapter(adapter);
    }
}
