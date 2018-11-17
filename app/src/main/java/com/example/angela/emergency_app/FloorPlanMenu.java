/*
package com.example.angela.emergency_app;

import android.view.View;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;


public class FloorPlanMenu extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floorplan_menu);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.building_list);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                Intent intent = new Intent(FloorplanMenu.this, FloorplanViewer.class);
                String building = listDataHeader.get(groupPosition);
                String floor = listDataChild.get(building).get(childPosition);

                String source = building + "_" + floor;
                source = source.replaceAll("\\s+", "");
                source = source.toLowerCase();
                Log.i("Correct floor", source);
                intent.putExtra("ImageSource", source);
                startActivity(intent);

                // TODO Auto-generated method stub
//                Toast.makeText(
//                        getApplicationContext(),
//                        listDataHeader.get(groupPosition)
//                                + " : "
//                                + listDataChild.get(
//                                listDataHeader.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT)
//                        .show();
                return false;
            }
        });
    }

    */
/*
     * Preparing the list data
     *//*

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Building 1");
        listDataHeader.add("Building 2");
        listDataHeader.add("Building 3");

        // Adding child data
        List<String> b1 = new ArrayList<String>();
        b1.add("Roof");
        b1.add("Floor 4");
        b1.add("Floor 3");
        b1.add("Floor 2");
        b1.add("Floor 1");
        b1.add("Basement");

        List<String> b2 = new ArrayList<String>();
        b2.add("Roof");
        b2.add("Floor 3");
        b2.add("Floor 2");
        b2.add("Floor 1");
        b2.add("Basement");

        List<String> b3 = new ArrayList<String>();
        b3.add("Roof");
        b3.add("Floor 1");
        b3.add("Basement");

        listDataChild.put(listDataHeader.get(0), b1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), b2);
        listDataChild.put(listDataHeader.get(2), b3);
    }
}
*/
