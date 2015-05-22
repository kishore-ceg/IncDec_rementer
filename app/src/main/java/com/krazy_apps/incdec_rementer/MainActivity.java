package com.krazy_apps.Inc

import android.support.v7.app.ActionBarActivity;

/Dec_rementer;



import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

import com.krazy_apps.incdec_rementer.R;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button decButton =(Button)findViewById(R.id.decButton);
        Button incButton =(Button)findViewById(R.id.incButton);

        decButton.setOnClickListener(decButtonListener);
        incButton.setOnClickListener(incButtonListener);

    }

    private OnClickListener decButtonListener = new OnClickListener() {
        public void onClick(View v) {

            EditText str = (EditText) findViewById(R.id.edit_message);
            int val=new Integer(str.getText().toString());
            val--;
            str.setText(""+val);
        }
    };

    private OnClickListener incButtonListener = new OnClickListener() {
        public void onClick(View v) {

            EditText str = (EditText) findViewById(R.id.edit_message);
            int val=new Integer(str.getText().toString());
            val++;
            str.setText(""+val);
        }
    };


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

