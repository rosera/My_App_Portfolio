package com.texturelabs.rosera.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.Context;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.app_portfolio);
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

    /*
     *
    URL:
    http://developer.android.com/guide/topics/ui/controls/button.html#HandlingEvents

    Information:
    The method you declare in the android:onClick attribute must have a signature exactly as shown above. Specifically, the method must:
        Be public
        Return void
        Define a View as its only parameter (this will be the View that was clicked)
     *
     */
    public void sendBtnSpotifyStreamer(View view) {
        // Respond to btn click
        Context context = getApplicationContext();
        CharSequence message = "This button will launch my Spotify Streamer app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public void sendBtnScoresApp(View view) {
        // Respond to btn click
        Context context = getApplicationContext();
        CharSequence message = "This button will launch my scores app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public void sendBtnLibraryApp(View view) {
        // Respond to btn click
        Context context = getApplicationContext();
        CharSequence message = "This button will launch my library app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public void sendBtnBuildItBigger(View view) {
        // Respond to btn click
        Context context = getApplicationContext();
        CharSequence message = "This button will launch my build it bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public void sendBtnXYZReader(View view) {
        // Respond to btn click
        Context context = getApplicationContext();
        CharSequence message = "This button will launch my XYZ reader app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public void sendBtnCapstone(View view) {
        // Respond to btn click
        Context context = getApplicationContext();
        CharSequence message = "This button will launch my capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
