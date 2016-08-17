package com.example.ankijai.memegenerator;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.util.Log;

public class BottomSectionFragment extends Fragment{

    private static final String TAG="ankit";
    private TextView toptext2;
    private TextView bottomtext2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.bottomlayout,container,false);
        toptext2=(TextView)view.findViewById(R.id.btm_lyt_toptextid);
        bottomtext2=(TextView)view.findViewById(R.id.btm_lyt_bottomtextid);

        return view;
    }

    public void setClickedText(String top, String bottom) {
        Log.i(TAG,String.valueOf(toptext2.getWindowToken()));
        Log.i(TAG, String.valueOf(toptext2.getApplicationWindowToken()));
        InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromInputMethod(toptext2.getWindowToken(), 0);
        toptext2.setText(top);
        bottomtext2.setText(bottom);
    }
}
