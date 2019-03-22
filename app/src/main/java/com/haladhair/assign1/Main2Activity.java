package com.haladhair.assign1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Date;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       final TextView txtv=findViewById(R.id.txtvi);
       final TextView txtvg=findViewById(R.id.textView7);
       final TextView sel=findViewById(R.id.dateselect);


        Bundle b = getIntent().getExtras();
        String firsst = b.getString("firstnam");
        String lasst = b.getString("lastnam");

       final String datee = b.getString("thedatt");
        txtv.setText(firsst  + lasst);
        txtvg.setText(datee);


//        Intent incoming = getIntent();

//        String date = incoming.getStringExtra("date");
//        sel.setText(date);

//        sel.setText(datee);





    }


}

