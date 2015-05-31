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
        CharSequence message = getString(R.string.spotify_streamer);
        int duration = Toast.LENGTH_SHORT;

        // Refactor repeating code
        displayToast(message, duration);
    }

    public void sendBtnScoresApp(View view) {
        // Respond to btn click
        CharSequence message = getString(R.string.scores_app);
        int duration = Toast.LENGTH_SHORT;

        // Refactor repeating code
        displayToast(message, duration);
    }

    public void sendBtnLibraryApp(View view) {
        // Respond to btn click
        CharSequence message = getString(R.string.library_app);
        int duration = Toast.LENGTH_SHORT;

        // Refactor repeating code
        displayToast(message, duration);
    }

    public void sendBtnBuildItBigger(View view) {
        // Respond to btn click
        CharSequence message = getString(R.string.build_it_bigger);
        int duration = Toast.LENGTH_SHORT;

        // Refactor repeating code
        displayToast(message, duration);
    }

    public void sendBtnXYZReader(View view) {
        // Respond to btn click
        CharSequence message = getString(R.string.xyz_reader);
        int duration = Toast.LENGTH_SHORT;

        // Refactor repeating code
        displayToast(message, duration);
    }

    public void sendBtnCapstone(View view) {
        // Respond to btn click
        CharSequence message = getString(R.string.capstone);
        int duration = Toast.LENGTH_SHORT;

        // Refactor repeating code
        displayToast(message, duration);
    }

    /*
    Code review:
    You an reuse the toast showing method. You wrote the same logic 6 times.
    Refactor such logic into a single method that receives the toast's text and duration.
     */
    private void displayToast(CharSequence message, int duration) {
        Context context = getApplicationContext();

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
