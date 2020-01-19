package com.example.deakinm_csci370_s2020_hw1;

import java.util.Random;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void changeColor(View view)
    {
        EditText morphText = super.findViewById(R.id.morphText);
        morphText.setTextColor(getRandomColor());
        System.out.println("color changed!");
        return;
    }

    public void changeSize(View view)
    {
        EditText morphText = super.findViewById(R.id.morphText);
        morphText.setTextSize(getRandomTextSize());
        System.out.println("size changed!");
        return;
    }

    public void quit(View view)
    {
        System.out.println("bye!");
        System.exit(0);
        return;
    }

    public int getRandomColor()
    {
        final Random rand = new Random();
        return Color.argb(255, rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    }

    public float getRandomTextSize()
    {
        final Random rand = new Random();
        return (rand.nextFloat() * 24) + 6;
    }
}
