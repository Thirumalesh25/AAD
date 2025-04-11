package com.example.exp2;


import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.l3);
        EditText E1 = findViewById(R.id.l2);
        TextView T1 = findViewById(R.id.l4);

        btn1.setOnClickListener(view -> {
            T1.setVisibility(TextView.VISIBLE);
            T1.setText("Hello " + E1.getText().toString() + "!");
        });
    }
}