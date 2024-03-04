package com.example.sampleprojectversion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MoreFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MoreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_more, container, false);
        View view= inflater.inflate(R.layout.fragment_more, container, false);
            Button b1=view.findViewById(R.id.call_btn);
        Button b2=view.findViewById(R.id.msg_btn);
        Button b3=view.findViewById(R.id.mail_btn);
        Button b4=view.findViewById(R.id.share_btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+91 9767573349"));
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imsg=new Intent();
                imsg.setAction(Intent.ACTION_SENDTO);
                imsg.setData(Uri.parse("smsto:"+Uri.encode("+91 9767573349")));
                imsg.putExtra("sms_body","Urgent - [Disaster Name]! ");
                startActivity(imsg);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imail=new Intent(Intent.ACTION_SEND);
                imail.setType("message/refc822");        //must do for opening email app
                imail.putExtra(Intent.EXTRA_EMAIL,new String[]{"anujasanjayahire@gmail.com","prajwalsakunde1234@gmail.com"});
                imail.putExtra(Intent.EXTRA_SUBJECT,"Urgent Mail - [Disaster Name] ");
                imail.putExtra(Intent.EXTRA_TEXT,"Please Resolve this issue as soon as Possible ");
                startActivity(Intent.createChooser(imail,"Email via "));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ishare=new Intent(Intent.ACTION_SEND);
                ishare.setType("text/plain");        //must do for opening email app
                ishare.putExtra(Intent.EXTRA_TEXT,"Download this app : ,https://play.google.com/store/apps/details?id=org.telegram.messenger&pcampaignid=web_share ");
                startActivity(Intent.createChooser(ishare,"Share via "));
            }
        });
        return view;
    }


}