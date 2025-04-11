package com.example.exp2;


import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle ss) {
        super.onCreate(ss);
        setContentView(R.layout.activity_main);

        RadioGroup R1 = findViewById(R.id.r1);
        TextView T1 = findViewById(R.id.res);
        Button btn = findViewById(R.id.b1);

        btn.setOnClickListener(v -> {
            int sid = R1.getCheckedRadioButtonId();
            if (sid != -1) {
                RadioButton Rb = findViewById(sid);
                T1.setText("Choice: " + Rb.getText().toString());
            } else {
                T1.setText("Choice: No option selected");
            }
        });
    }
}