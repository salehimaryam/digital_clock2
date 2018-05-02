package com.examp555le.maryam.dclocks;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Main2Activity extends AppCompatActivity {

    private RadioButton rd1,rd2;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.DCS);

        rd1= (RadioButton) findViewById(R.id.button1);
        rd2= (RadioButton) findViewById(R.id.butten2);
        btn= (RadioButton) findViewById(R.id.butten2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,DCS.class);
                if (rd1.isChecked()){
                    intent.putExtra("guyande","من");
                }else if (rd2.isChecked()){
                    intent.putExtra("guyande","رادیویی");
                }
                startActivity(intent);
            }
        });
    }
}
