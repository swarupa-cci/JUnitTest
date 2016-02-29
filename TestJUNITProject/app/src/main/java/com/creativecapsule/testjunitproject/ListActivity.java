package com.creativecapsule.testjunitproject;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView)findViewById(R.id.listView);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {


            arrayList.add(String.valueOf(i));
        }


        ArrayAdapter<String> adapter
                = new ArrayAdapter<String>(this,
                R.layout.list_item_layout,
                arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView
                        .OnItemClickListener() {
                    public void onItemClick(
                            AdapterView<?> parent,
                            View view, int position, long id) {


//                        Toast.makeText(getApplicationContext(),
//                                ((TextView) view).getText(), Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(ListActivity.this,ListDetailActivity.class);
                        startActivity(intent);
                    }
                });


    }


}
