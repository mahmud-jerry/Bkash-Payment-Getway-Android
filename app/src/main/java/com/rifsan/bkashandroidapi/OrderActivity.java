package com.rifsan.bkashandroidapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rifsan.bkashandroidapi.PaymentGetway.PaymentActivity;
import com.rifsan.bkashandroidapi.PaymentGetway.model.Checkout;

public class OrderActivity extends AppCompatActivity {
    Button confirmBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        setTitle("Product Order ");
        confirmBtn = findViewById(R.id.confirmBtn);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Checkout checkout = new Checkout();
                checkout.setAmount("10");

                checkout.setVersion("two");

                checkout.setIntent("sale");

                Intent intent = new Intent(OrderActivity.this, PaymentActivity.class);
                intent.putExtra("values", checkout);
                startActivity(intent);
            }
        });
    }
}