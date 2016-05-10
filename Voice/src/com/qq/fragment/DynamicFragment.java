package com.qq.fragment;

import com.qq.R;
import com.qq.activity.DifficultyActivity;
import com.qq.activity.HornorActivity;
import com.qq.activity.Study1Activity;
import com.qq.activity.TestActivity;
import com.qq.view.TitleBarView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class DynamicFragment extends Fragment {

	private Context mContext;
	private View mBaseView;
	private TitleBarView mTitleBarView;
	private RelativeLayout study;
	private RelativeLayout difficulty;
	private RelativeLayout test;
	private RelativeLayout hornor;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mContext=getActivity();
		mBaseView=inflater.inflate(R.layout.fragment_dynamic, null);
		findView();
		initTitleView();
		init();
		return mBaseView;
	}
	
	private void findView(){
		mTitleBarView=(TitleBarView) mBaseView.findViewById(R.id.title_bar);
		study=(RelativeLayout) mBaseView.findViewById(R.id.ll_dynamic);
		difficulty=(RelativeLayout) mBaseView.findViewById(R.id.difficulty);
		test=(RelativeLayout) mBaseView.findViewById(R.id.test);
		hornor=(RelativeLayout) mBaseView.findViewById(R.id.hornor);
	}
	
	private void initTitleView(){
		mTitleBarView.setCommonTitle(View.GONE, View.VISIBLE, View.GONE, View.GONE);
		mTitleBarView.setTitleText(R.string.dynamic);
	}
	private void init(){
		study.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(mContext, Study1Activity.class);
				startActivity(intent);
				getActivity().overridePendingTransition(R.anim.activity_up, R.anim.fade_out);
				
			}
		});
		difficulty.setOnClickListener(new OnClickListener() {
			
			@Override
			
			public void onClick(View v) {
				Intent intent=new Intent(mContext, DifficultyActivity.class);
				startActivity(intent);
				getActivity().overridePendingTransition(R.anim.activity_up, R.anim.fade_out);
				
			}
		});
		test.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(mContext, TestActivity.class);
				startActivity(intent);
				getActivity().overridePendingTransition(R.anim.activity_up, R.anim.fade_out);
		
			}
		});
		hornor.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(mContext, HornorActivity.class);
				startActivity(intent);
				getActivity().overridePendingTransition(R.anim.activity_up, R.anim.fade_out);
		
			}
		});
	}

}
