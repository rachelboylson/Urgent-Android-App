package com.example.rachelboylson.urgent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Incentive extends AppCompatActivity {

    private final static String STORETEXT="storetext.txt";
    private EditText txtEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incentive);
        txtEditor=(EditText)findViewById(R.id.textbox);
    }

    public void saveClicked(View v) {
        try {
            OutputStreamWriter out=
                    new OutputStreamWriter(openFileOutput(STORETEXT, 0));
            out.write(txtEditor.getText().toString());
            out.close();
            Toast
                    .makeText(this, "The contents are saved in the file.", Toast.LENGTH_LONG)
                    .show();
        }

        catch (Throwable t) {
            Toast
                    .makeText(this, "Exception: "+t.toString(), Toast.LENGTH_LONG)
                    .show();
        }
    }
    public void readFileInEditor()
    {
        try {
            InputStream in = openFileInput(STORETEXT);
            if (in != null) {
                InputStreamReader tmp=new InputStreamReader(in);
                BufferedReader reader=new BufferedReader(tmp);
                String str;
                StringBuilder buf=new StringBuilder();
                while ((str = reader.readLine()) != null) {
                    buf.append(str+"n");
                }
                in.close();
                txtEditor.setText(buf.toString());
            }
        }
        catch (java.io.FileNotFoundException e) {
// that's OK, we probably haven't created it yet
        }
        catch (Throwable t) {
            Toast
                    .makeText(this, "Exception: " + t.toString(), Toast.LENGTH_LONG)
                    .show();
        }
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
