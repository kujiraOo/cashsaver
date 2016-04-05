package com.bananacat.android.cashsaver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("M 4 apr 4.5/5");
        listDataHeader.add("T 5 apr 5.1/5");
        listDataHeader.add("W 6 apr 6.7/5");

        // Adding child data
        List<String> mon = new ArrayList<String>();
        mon.add("cigs 5");
        mon.add("beer 1.3");
        mon.add("food 10");

        List<String> tue = new ArrayList<String>();
        tue.add("cigs 5");
        tue.add("beer 1.3");
        tue.add("food 10");

        List<String> wed = new ArrayList<String>();
        wed.add("cigs 5");
        wed.add("beer 1.3");
        wed.add("food 10");

        listDataChild.put(listDataHeader.get(0), mon); // Header, Child data
        listDataChild.put(listDataHeader.get(1), tue);
        listDataChild.put(listDataHeader.get(2), wed);
    }
}
