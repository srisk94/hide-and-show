package com.example.srima.hideandseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView sampleImage;
    Button hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sampleImage=(ImageView)findViewById(R.id.imageView1);
        hide=(Button)findViewById(R.id.button1);
        hide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text=hide.getText().toString();
                if(text == "hide") {

                            sampleImage.setVisibility(View.GONE);
                            hide.setText("show");
                        }


                else{

                            sampleImage.setVisibility(View.VISIBLE);
                            hide.setText("hide");
                        }

            }
        });

    }

}
