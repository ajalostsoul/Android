package com.example.ankijai.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrangeActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG="ankit";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Bundle appledata=getIntent().getExtras();
        String reason=appledata.getString("reason");
        if (reason==null){
            Log.i(TAG,"ghusa");
            return;
        }
        else if (reason.isEmpty()){
            Log.i(TAG,"khali h");
            return;
        }
        TextView text=(TextView)findViewById(R.id.orange_reasonid);
        text.setText(appledata.getString("reason"));

        Button btn=(Button)findViewById(R.id.orangebtnid);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.i(TAG,"yahan to ghusa");
        Intent i=new Intent();
        i.setAction("com.example.ankijai.intent");
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(i);
    }
}
