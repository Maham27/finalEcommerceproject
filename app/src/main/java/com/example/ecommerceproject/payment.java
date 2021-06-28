package com.example.ecommerceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class payment extends AppCompatActivity  {
    double amount = 0.0;
    TextView totals, tvd, tvshiping, totalamount;
    Button pbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        totals = findViewById(R.id.totals);
        tvd = findViewById(R.id.tvd);
        tvshiping = findViewById(R.id.tvshiping);
        totalamount = findViewById(R.id.totalamount);
        pbtn=findViewById(R.id.pbtn);

        amount = getIntent().getDoubleExtra("amount", 0.0);

        totals.setText(amount + "RS");
        pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(payment.this, "cash on delivery", Toast.LENGTH_SHORT).show();
            }
        });


    }


}