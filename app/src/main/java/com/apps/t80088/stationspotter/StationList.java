package com.apps.t80088.stationspotter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StationList extends Fragment {
    TextView[] textViews = new TextView[10];
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.radio_list, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
    }
    private void getStations(String song){
        //API Call
        ScrollView scroll = getView().findViewById(R.id.scroll_view);
        //scroll.addView();
    }
    private void addToList(String[] names, ScrollView scroll){
        for(int i=0;i<10;i++){
            //textViews[i] = new TextView(this);
            //scroll.addView();
        }
    }
}
