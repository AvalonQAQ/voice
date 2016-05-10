package com.qq.activity;
import java.io.File;


import com.qq.R;
import com.qq.fragment.DynamicFragment;
import com.qq.wifi.foregin.Globals;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.ImageButton;

public class Study1Activity extends Activity{
	private Context mContext;
	private TextView grade;
	private TextView mean;
	private ImageView hand;
	private ImageView word;
	private ImageView mouth;
	private VideoView example;
	private VideoView you;
	private ImageButton last;
	private ImageButton next;
	private Activity mActivity;
	public Study1Activity() {}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.study);
		
		mActivity = Study1Activity.this;
		// Set the application-wide context global, if not already set
        Context myContext = Globals.getContext();
        if (myContext == null) {
            myContext = mActivity.getApplicationContext();
            if (myContext == null) {
                throw new NullPointerException("Null context!?!?!?");
            }
            Globals.setContext(myContext);
        }

        grade = (TextView) findViewById(R.id.yourpoint);
        mean = (TextView) findViewById(R.id.mean);        
        last = (ImageButton) findViewById(R.id.gotolast);
        next = (ImageButton) findViewById(R.id.gotonext);
        hand = (ImageView) findViewById(R.id.examplehand);
        word = (ImageView) findViewById(R.id.word);
        mouth= (ImageView) findViewById(R.id.examplemouth);
        example = (VideoView) findViewById(R.id.examplevideo);
        you = (VideoView) findViewById(R.id.yourvideo);
        mContext=mActivity.getApplicationContext();
        next.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(mContext, Study2Activity.class);
				startActivity(intent);
				
			}
		});
        last.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				
				Study1Activity.this.finish();
			}
		});
	}
	
}
