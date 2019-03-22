package com.haladhair.assign1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  EditText m_first = findViewById(R.id.mfirst);
       // EditText m_last = findViewById(R.id.mlast);
        final Button btn =findViewById(R.id.register);
        final TextView thedate = (TextView) findViewById(R.id.dateselect);
        final Button btnpic=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText m_first = findViewById(R.id.mfirst);
                EditText m_last = findViewById(R.id.mlast);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                final String ffirst = m_first.getText().toString();
                final String llast = m_last.getText().toString();
                intent.putExtra("firstnam", ffirst);
                intent.putExtra("lastnam", llast);
                Intent incoming = getIntent();
              final String date = incoming.getStringExtra("date");
               intent.putExtra("thedatt", date);
               startActivity(intent);
            }
        });

//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                intent.putExtra("firstnam", ffirst);
//                intent.putExtra("lastnam", llast);
//
//                Intent incoming = getIntent();
//                final String date = incoming.getStringExtra("date");
//                intent.putExtra("thedatt",date);
//
//
//                startActivity(intent);
//
//            }
//        });
       btnpic.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent1 = new Intent(MainActivity.this, calendar.class);
               //date
                Intent incoming = getIntent();
                 final String date = incoming.getStringExtra("date");
                intent1.putExtra("thedatt",date);
                thedate.setText(date);
                startActivity(intent1);
           }
       });

    }


}
