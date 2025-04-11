package com.example.exp2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle ss) {
        super.onCreate(ss);
        setContentView(R.layout.activity_second);

        TextView T1 = findViewById(R.id.t1);
        TextView T2 = findViewById(R.id.t2);

        String username = getIntent().getStringExtra("uname");
        String password = getIntent().getStringExtra("pwd");

        T1.setText("Username: " + username);
        T2.setText("Password: " + password);
    }
}