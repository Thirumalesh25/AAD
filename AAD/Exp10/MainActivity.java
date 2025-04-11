package com.example.exp7;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

    protected void onCreate(Bundle ss) {
        super.onCreate(ss);
        setContentView(R.layout.activity_main);

        DatabaseHelper D1 = new DatabaseHelper(this);

        EditText E1 = findViewById(R.id.e1);
        EditText E2 = findViewById(R.id.e2);
        EditText E3 = findViewById(R.id.e3);
        Button B1 = findViewById(R.id.b1);
        Button B2 = findViewById(R.id.b2);

        B1.setOnClickListener(v -> {
            String name = E1.getText().toString();
            String email = E2.getText().toString();
            String password = E3.getText().toString();

            boolean check = D1.insertUser(name, email, password);
            if (check)
                Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(MainActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
        });

        B2.setOnClickListener(v -> {
            Cursor res = D1.getAllUsers();

            String s="";
            while (res.moveToNext()) {
                s+="ID : "+res.getString(0)+"\n";
                s+="Name : "+res.getString(1)+"\n";
                s+="Email : "+res.getString(2)+"\n";
                s+="Password : "+res.getString(3)+"\n\n";
            }

            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Registered Users")
                    .setMessage(s)
                    .setPositiveButton("OK", null)
                    .show();
        });
    }
}
