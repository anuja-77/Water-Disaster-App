package com.example.sampleprojectversion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextact;
        nextact=findViewById(R.id.nextact);


        //CARDVIEW

        CardView card;
        card=findViewById(R.id.card);
        card.setRadius(0.5f);
        card.setUseCompatPadding(true);
        card.setCardElevation(11.0f);

     //   Button animate;
       // animate=findViewById(R.id.animate);


        //LISTVIEW

        String items[]=new String[] {"India – 12 Killed in Landslide After Heavy Rain in Maharashtra ",
                "Severe Flooding in 4 States After Rain From Cyclone Gulab ",
                "1 Dead, Several Reported Missing After Floods in Maharashtra ",
                "Madhya Pradesh Floods Death Toll Rises to 24 ",
                " Maharashtra Floods and Landslides Death Toll Climbs to 192 ",
                " Fatalities Rise in Maharashtra Floods and Landslides ",
                "Massive Rescue Efforts Underway After Floods in Mumbai and Maharashtra ",
                "at Least 20 Killed in Mumbai Landslides and Floods ",
                "Rivers Above Danger Mark in Bihar, Uttar Pradesh and Uttarakhand",
                "Monsoon Rains Cause Havoc in Mumbai, 11 Dead After Building Collapses",
                "Tropical Cyclone Tauktae Leaves 23 Dead and Over 200,000 Displaced",
                "Deadly Floods in Telangana, Andhra Pradesh, Karnataka and Maharashtra",
                " Thousands Evacuate Floods in Maharashtra and Gujarat "};
        ListView listView=(ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You clicked on "+items[position],Toast.LENGTH_SHORT).show();
            }
        });
       /*    animate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                listView.startAnimation(alpha);
            }
        }); */

        nextact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i1);
            }
        });

    }


}