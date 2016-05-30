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
    String IC="count1";
    String CC="count2";
    private int restore1;
    private int restore2;
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
    @Override
    protected void onSaveInstanceState(Bundle outState){
        outState.putInt(IC,ironclick);
        outState.putInt(CC,capclick);
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        restore1=savedInstanceState.getInt(IC);
        ironclick=restore1;
        restore2=savedInstanceState.getInt(CC);
        capclick=restore2;
        TextView rtv1= (TextView)findViewById(R.id.Iron);
        rtv1.setText("Team Ironman="+ironclick);
        TextView rtv2=(TextView)findViewById(R.id.Cap);
        rtv2.setText("Team Cap="+capclick);
    }
}
