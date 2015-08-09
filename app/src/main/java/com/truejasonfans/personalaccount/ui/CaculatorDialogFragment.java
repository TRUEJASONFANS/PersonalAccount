package com.truejasonfans.personalaccount.ui;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.truejasonfans.personalaccount.R;

public class CaculatorDialogFragment extends DialogFragment {
	/**
	 * Create a new instance of MyDialogFragment, providing "num" as an
	 * argument.
	 */
	static CaculatorDialogFragment newInstance(int num) {
		CaculatorDialogFragment f = new CaculatorDialogFragment();

		// Supply num input as an argument.
		Bundle args = new Bundle();
		args.putInt("num", num);
		f.setArguments(args);

		return f;
	}

	private int mNum;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mNum = getArguments().getInt("num");

		// Pick a style based on the num.
		int style = DialogFragment.STYLE_NORMAL, theme = 0;
		switch ((mNum - 1) % 6) {
		case 1:
			style = DialogFragment.STYLE_NO_TITLE;
			break;
		case 2:
			style = DialogFragment.STYLE_NO_FRAME;
			break;
		case 3:
			style = DialogFragment.STYLE_NO_INPUT;
			break;
		case 4:
			style = DialogFragment.STYLE_NORMAL;
			break;
		case 5:
			style = DialogFragment.STYLE_NORMAL;
			break;
		}
		switch ((theme - 1) % 5) {
		case 0:
			theme = android.R.style.Theme_Holo;
			break;
		case 1:
			theme = android.R.style.Theme_Holo_Light_Dialog;
			break;
		case 2:
			theme = android.R.style.Theme_Holo_Light;
			break;
		case 3:
			theme = android.R.style.Theme_Holo_Light_Panel;
			break;
		case 4:
			theme = android.R.style.Theme_Holo_Light;
			break;
		}
		setStyle(style, theme);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_main_fragment_addbill, container, false);
		return v;
	}
}
