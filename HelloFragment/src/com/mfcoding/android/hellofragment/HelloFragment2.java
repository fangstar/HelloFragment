package com.mfcoding.android.hellofragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HelloFragment2 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.hello_frag, container, false);
		((TextView) view.findViewById(R.id.text)).setText("HelloFragment2");

		return view;
	}

}
