package com.londonappbrewery.climapm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ChangeCity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.change_city_layout);
        final EditText editText = (EditText) findViewById(R.id.queryET);
        ImageButton backbutton =  findViewById(R.id.backButton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String newCity=editText.getText().toString();
                Intent newCityIntent=new Intent(ChangeCity.this,WeatherController.class);
                newCityIntent.putExtra("City",newCity);
                startActivity(newCityIntent);
                return false;
            }
        });
    }
}
