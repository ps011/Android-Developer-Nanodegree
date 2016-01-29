package com.pransh.project0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button spotify,scores,library,build,bacon,capstone;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        spotify=(Button)findViewById(R.id.button);
        scores=(Button)findViewById(R.id.button2);
        library=(Button)findViewById(R.id.button3);
        build=(Button)findViewById(R.id.button4);
        bacon=(Button)findViewById(R.id.button5);
        capstone=(Button)findViewById(R.id.button6);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();



            }
        });


    }

    public void toast(View v)
    {
        switch(v.getId())
        {
            case  R.id.button : {
                Toast.makeText(MainActivity.this, "Spotify Streamer", Toast.LENGTH_LONG).show();
                    break;}

            case R.id.button2 : {Toast.makeText(MainActivity.this,"Scores App", Toast.LENGTH_SHORT).show();
                                break;}

            case R.id.button3 : {Toast.makeText(MainActivity.this,"Library App", Toast.LENGTH_SHORT).show();
                break;}

            case R.id.button4 : {Toast.makeText(MainActivity.this,"Build It Bigger", Toast.LENGTH_SHORT).show();
                break;}

            case R.id.button5 : {Toast.makeText(MainActivity.this,"Bacon Reader", Toast.LENGTH_SHORT).show();
                break;}

            case R.id.button6 : {Toast.makeText(MainActivity.this,"Capstone : My Own App", Toast.LENGTH_SHORT).show();
                break;}
        }

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
}
