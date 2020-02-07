package com.example.makoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class makoactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makoactivity);
        Intent intent=getIntent();
        String massege= intent.getStringExtra("MASSEGWE");
        TextView messageView =
                (TextView)findViewById(R.id.messageTextView);
        messageView.setText(message);
    }
    public void onClose(View view){
        super.finish();
    }
}
