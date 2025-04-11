package com.example.exp2;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.Activity;
import java.util.Arrays;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText E1 = findViewById(R.id.e1);
        EditText E2 = findViewById(R.id.e2);
        EditText E3 = findViewById(R.id.e3);
        EditText E4 = findViewById(R.id.e4);
        RadioGroup R1 = findViewById(R.id.e5);
        Spinner S1 = findViewById(R.id.e6);
        Button btn = findViewById(R.id.b1);
        TextView T1 = findViewById(R.id.output);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,
                Arrays.asList("USA", "India", "UK", "Australia", "Canada", "Germany", "France", "Japan", "China", "Brazil"));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        S1.setAdapter(adapter);

        btn.setOnClickListener(v -> {
            String username = E1.getText().toString();
            String password = E2.getText().toString();
            String dob = E3.getText().toString();
            String age = E4.getText().toString();

            int gid = R1.getCheckedRadioButtonId();
            String gender = ( gid == R.id.radioButton3 )? "Male" : "Female";

            String country = S1.getSelectedItem().toString();

            String result = "Username: " + username + "\n" +
                    "Password: " + password + "\n" +
                    "Date of Birth: " + dob + "\n" +
                    "Age: " + age + "\n" +
                    "Gender: " + gender + "\n" +
                    "Country: " + country;

            T1.setText(result);
            T1.setVisibility(TextView.VISIBLE);
        });
    }
}