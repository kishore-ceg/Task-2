package com.krazy_apps.task_2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Task_1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_1);

        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);



        add.setOnClickListener(add_Listener);
        sub.setOnClickListener(sub_Listener);
    }
    static int i=0;
    private View.OnClickListener add_Listener =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView txt = (TextView) findViewById(R.id.txt);
            i++;
            txt.setText("Total is : "+i);
        }
    };

    private View.OnClickListener sub_Listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView txt = (TextView) findViewById(R.id.txt);
            i--;
            txt.setText("Total is : "+i);
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_task_1, menu);
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
