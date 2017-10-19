package com.aptech.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewActivity extends AppCompatActivity {
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent intent = getIntent();
        num1 = intent.getIntExtra("num1", 0);
        num2 = intent.getIntExtra("num2", 0);
    }

    public void sendBackToMainActivity(View view) {
        Intent data = new Intent();
        data.putExtra("key_result",(num1 + num2));

        setResult(0, data);
        finish();
    }

}
