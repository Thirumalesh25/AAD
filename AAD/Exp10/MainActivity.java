package com.example.exp7;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends Activity {
    ConstraintLayout L;
    TextView T1;

    @Override
    protected void onCreate(Bundle ss) {
        super.onCreate(ss);
        setContentView(R.layout.activity_main);

        L = findViewById(R.id.mainLayout);
        T1 = findViewById(R.id.t1);
        registerForContextMenu(T1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo info) {
        super.onCreateContextMenu(menu, v, info);
        menu.setHeaderTitle("Choose a color");
        menu.add("Yellow");
        menu.add("Gray");
        menu.add("Cyan");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        String color = item.getTitle().toString();
        if (color.equals("Yellow")) L.setBackgroundColor(Color.YELLOW);
        else if (color.equals("Gray")) L.setBackgroundColor(Color.GRAY);
        else if (color.equals("Cyan")) L.setBackgroundColor(Color.CYAN);
        return true;
    }
}
