package com.example.rachelboylson.urgent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IncentiveButton(View v){
        Intent intent;
        intent = new Intent(MainActivity.this, Incentive.class);
        startActivity(intent);
    }

    public void IUButton(View v){
        Intent intent;
        intent = new Intent(MainActivity.this, Urgent_Important.class);
        startActivity(intent);
    }

    public void UUButton(View v){
        Intent intent;
        intent = new Intent(MainActivity.this, urgent_unimportant.class);
        startActivity(intent);
    }

    public void INButton(View v){
        Intent intent;
        intent = new Intent(MainActivity.this, not_urgent_important.class);
        startActivity(intent);
    }

    public void UNButton(View v){
        Intent intent;
        intent = new Intent(MainActivity.this, not_urgent_unimportant.class);
        startActivity(intent);
    }


    public void ImportantUrgent(View v){
        Intent intent;
        intent = new Intent(MainActivity.this, Urgent_Important.class);
        startActivity(intent);
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

 //   private class IncentiveButtonHandeler implements View.OnClickListener {
   //     @Override
     //   public void onClick(View v) {
       //     Intent intent;
         //   intent = new Intent(MainActivity.this, Incentive.class);
           // startActivity(intent);

//        }

  //  }
}
