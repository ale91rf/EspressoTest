package com.alefernandez.espressotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.inputField)
    EditText mInputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.changeText)
    public void btnChangeTextClicked(){
        mInputText.setText("Lalala");
    }

    @OnClick(R.id.switchActivity)
    public void btnSwitchActivityClicked(){
        Intent lIntent = new Intent(getApplicationContext(), SecondActivity.class);
        lIntent.putExtra("input", mInputText.getText().toString());
        startActivity(lIntent);
    }

}
