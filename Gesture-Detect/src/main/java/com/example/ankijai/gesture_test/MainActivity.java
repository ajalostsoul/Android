package com.example.ankijai.gesture_test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnDoubleTapListener,
GestureDetector.OnGestureListener,View.OnClickListener{

    private static final String TAG="Ankitmessage";
    private TextView moodytext;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moodytext=(TextView) findViewById(R.id.textid);
        this.gestureDetector=new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
        Button button=(Button) findViewById(R.id.buttonid);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        moodytext.setText("Tapped by Button");
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        moodytext.setText("Excuse me, I just got tapped");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        moodytext.setText("Double Tap! Calling cops");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        moodytext.setText("Double Tap Event");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        moodytext.setText("Atleast u cant make my morale down.");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        moodytext.setText("Now u r pressing me :(");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        moodytext.setText("SingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        moodytext.setText("OnScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        moodytext.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        moodytext.setText("onFling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
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
