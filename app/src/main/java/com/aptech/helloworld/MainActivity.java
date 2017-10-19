package com.aptech.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToNewActivity(View view) {
        Intent intent = new Intent(MainActivity.this, NewActivity.class);

        intent.putExtra("num1", 10);
        intent.putExtra("num2", 20);

        startActivityForResult(intent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1000 && resultCode == 0) {
            int result = data.getIntExtra("key_result", 0);
            System.out.println("Result: " + result);
        }
    }
}
