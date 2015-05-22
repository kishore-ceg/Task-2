package com.krazy_apps.task_2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Home extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        Button app_button = (Button) findViewById(R.id.calc);
        Button name_button =(Button) findViewById(R.id.names);

        app_button.setOnClickListener(app_button_Listener);
        name_button.setOnClickListener(name_button_Listener);
    }

    private View.OnClickListener app_button_Listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent name =new Intent("com.krazy_apps.task_2.TASK_1");
            startActivity(name);
        }
    };

    private View.OnClickListener name_button_Listener =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent name =new Intent("com.krazy_apps.task_2.RANDOM_NAMES");
            startActivity(name);
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
