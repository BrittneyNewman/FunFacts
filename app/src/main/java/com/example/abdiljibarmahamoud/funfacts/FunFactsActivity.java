package com.example.abdiljibarmahamoud.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ColorWheel;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook mFactBook = new FactBook();

    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;
    private ColorWheel mColorWheel = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

     mFactTextView = (TextView) findViewById(R.id.factTextview);
     mShowFactButton = (Button) findViewById(R.id.showFactButton);
     mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

     mShowFactButton.setOnClickListener(new View.OnClickListener() {

         @Override
         public void onClick(View v) {
       String fact = mFactBook.getFact();
       String color = mColorWheel.getColor();

         mFactTextView.setText(fact);
         mRelativeLayout.setBackgroundColor(Color.RED);

         }
     });


    }
}
