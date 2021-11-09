package com.firstapp.tipmodes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {
//    private Button button1;
//    private Button button2;
//    private Button button3;


    //    SPINNER CODE
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.menu));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position).equals("Distribution Modes")) {

                    Intent intent = new Intent(MainActivity.this, DistributionModes.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

    }


//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//        if (parent.getItemAtPosition(position).equals("Distribution Modes")) {
//
//            Intent intent = new Intent(this, DistributionModes.class);
//            startActivity(intent);
//        }
//
//
//    }

//        button1 = findViewById(R.id.button1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                button1.setSelected(!button1.isSelected());
//            }
//        });
//
//        button2 = findViewById(R.id.button2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                button2.setSelected(!button2.isSelected());
//            }
//        });
//
//        button3 = findViewById(R.id.button3);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                button3.setSelected(!button3.isSelected());
//            }
//        });
    //}


//        button1 = (Button) findViewById(R.id.button1);
//
//        button1.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                DistributionMode1();
//
//            }
//        });
//
//        button2 = (Button) findViewById(R.id.button2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               DistributionMode2();
//            }
//        });
//
//        button3 = (Button) findViewById(R.id.button3);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                DistributionMode3();
//            }
//        });
//    }
//    public void DistributionMode1(){
//        Intent intent = new Intent(this, DistributionMode1.class);
//        startActivity(intent);
//    }
//
//    public void DistributionMode2(){
//        Intent intent = new Intent(this, DistributionMode2.class);
//        startActivity(intent);
//    }
//
//    public void DistributionMode3(){
//        Intent intent = new Intent(this, DistributionMode3.class);
//        startActivity(intent);
//    }
//}


}