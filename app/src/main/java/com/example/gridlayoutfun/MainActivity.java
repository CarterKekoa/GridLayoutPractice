package com.example.gridlayoutfun;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid3);   //we have a second activity main that we use instead "grid1"
    }

    public void onButtonClick(View view){
        ImageButton button = (ImageButton) view;
        String text = button.getTag().toString(); //use the text in the button to know which one
        //tag, used for storing extra info about the view
        Toast.makeText(this, "Hello from button " + text, Toast.LENGTH_SHORT).show();
    }
}
