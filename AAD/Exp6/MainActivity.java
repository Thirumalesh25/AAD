package com.example.exp2;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle ss) {
        super.onCreate(ss);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(v -> {
            String phone="123456789";
            String message="Hello..!, How are you ?";
            Intent it = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+phone));
            it.putExtra("sms_body", message);
            startActivity(it);
        });
    }
}