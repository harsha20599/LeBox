package com.nitwit.idiot.lebox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Written extends AppCompatActivity {
    String[] guide={"How to install TWRP! How to install TWRP!How to install TWRP! "
            ,
            "Hzsawwa dawd asfa sf ds sd fsf fszcscscsacssa a asd as as as asd !",};
    ArrayAdapter<String> adapter;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_written);
        list=(ListView)findViewById(R.id.list1);
        adapter=new ArrayAdapter<String>(this,R.layout.custom_list_view,R.id.list1,guide);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"yo"+i,Toast.LENGTH_LONG).show();
            }
        });
    }
}
