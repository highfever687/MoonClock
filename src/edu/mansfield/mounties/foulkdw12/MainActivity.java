package edu.mansfield.mounties.foulkdw12;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.btnMainApp);
        b.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		startActivity(new Intent(MainActivity.this, Mooncalc.class));
        	}
        });
        VideoView videoView1 = (VideoView)findViewById(R.id.videoView1);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.android);

        videoView1.setVideoURI(uri);
        videoView1.start();  

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
