package com.example.ankijai.memegenerator;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment implements View.OnClickListener{
    private static EditText toptext;
    private static EditText bottomtext;

    toptextlistener activitycommander;


    public interface toptextlistener{
        public void creatememe(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activitycommander = (toptextlistener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.toplayout,container,false);

        toptext=(EditText)view.findViewById(R.id.toptextid);
        bottomtext=(EditText)view.findViewById(R.id.bottomtextid);
        Button button=(Button)view.findViewById(R.id.buttonid);

        button.setOnClickListener(this);
        //return super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }

    @Override
    public void onClick(View view) {
      //  InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
      //  imm.hideSoftInputFromInputMethod(getActivity().getCurrentFocus().getWindowToken(), 0);
        activitycommander.creatememe(toptext.getText().toString(),bottomtext.getText().toString());
    }
}
