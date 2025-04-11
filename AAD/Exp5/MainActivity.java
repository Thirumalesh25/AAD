package com.example.exp2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle ss) {
        super.onCreate(ss);
        setContentView(R.layout.activity_main);

        EditText E1 = findViewById(R.id.e1);
        EditText E2 = findViewById(R.id.e2);
        Button btn = findViewById(R.id.b1);

        btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("uname", E1.getText().toString());
            intent.putExtra("pwd", E2.getText().toString());
            startActivity(intent);
        });
    }
}