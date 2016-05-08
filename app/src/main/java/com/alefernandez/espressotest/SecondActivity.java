package com.alefernandez.espressotest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by alejandro on 8/5/16.
 */
public class SecondActivity extends Activity{

    @Bind(R.id.resultView)
    TextView mResultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        Bundle inputData = getIntent().getExtras();
        String input = inputData.getString("input");
        mResultView.setText(input);
    }

}
