package com.sairajesh.spider1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int ironclick=0;
    int capclick=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout Layout=(RelativeLayout)findViewById(R.id.Lay);
        Layout.setBackgroundColor(Color.LTGRAY);
        //Ironman image reference
        ImageButton Iron=(ImageButton)findViewById(R.id.ironman);
        //Captain image reference
        ImageButton Cap=(ImageButton)findViewById(R.id.cap);
        //Ironman tv
        final TextView Irontv=(TextView)findViewById(R.id.Iron);
        //Cap tv
        final TextView Captv=(TextView)findViewById(R.id.Cap);

        //click listeners
        Iron.setOnClickListener(
                new ImageButton.OnClickListener(){
                    public void onClick(View v){
                        ironclick++;
                        Irontv.setText("Team Ironman="+ironclick);
                    }

                }
        );
        Iron.setOnLongClickListener(
                new ImageButton.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        capclick++;
                        Captv.setText("Ironman was hit! Team Cap="+capclick);
                        return true;
                    }
                }

        );

        Cap.setOnClickListener(
                new ImageButton.OnClickListener(){
                    public void onClick(View v){
                        capclick++;
                        Captv.setText("Team Cap="+capclick);
                    }
                }


        );
        Cap.setOnLongClickListener(
                new ImageButton.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        ironclick++;
                        Irontv.setText("Captain america was hit! Team Ironman="+ironclick);
                        return true;
                    }
                }

        );

    }
}
