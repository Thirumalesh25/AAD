package com.example.exp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle ss) {
        super.onCreate(ss);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.b1);
        Button btn2 = findViewById(R.id.b2);
        btn1.setOnClickListener(v -> loadFragment(new Fragment1()));
        btn2.setOnClickListener(v -> loadFragment(new Fragment2()));
    }
    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();
    }
}