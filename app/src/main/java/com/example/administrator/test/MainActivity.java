package com.example.administrator.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnButton;
    private Button mBtnTextView;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = (Button) findViewById(R.id.btn_text_view);
        mBtnButton = (Button) findViewById(R.id.btn_button);
        mBtnEditText = (Button) findViewById(R.id.btn_edittext);
        mBtnRadioButton = (Button) findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = (Button) findViewById(R.id.btn_checkbox);
        mBtnImageView = (Button) findViewById(R.id.btn_imageview);
        setListeners();
          }


    private void setListeners(){
        Onclick onclick = new Onclick();
        mBtnTextView.setOnClickListener(onclick);
        mBtnEditText.setOnClickListener(onclick);
        mBtnButton.setOnClickListener(onclick);
        mBtnRadioButton.setOnClickListener(onclick);
        mBtnCheckBox.setOnClickListener(onclick);
        mBtnImageView.setOnClickListener(onclick);
    }
    private class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent=null;

        switch (v.getId()){
            case R.id.btn_text_view:
                //跳转至textview界面 点击事件
                intent  = new Intent(MainActivity.this,TextViewActivity.class);
                break;
            case R.id.btn_button:
                //跳转至Button界面 点击事件
                intent  = new Intent(MainActivity.this,ButtonActivity.class);
                break;
            case R.id.btn_edittext:
                //跳转至EditText界面 点击事件
                intent  = new Intent(MainActivity.this,EditTextActivity.class);
                break;
            case R.id.btn_radiobutton:
                //跳转至RadioButton界面 点击事件
                intent  = new Intent(MainActivity.this,RadioButtonActivity.class);
                break;
            case R.id.btn_checkbox:
                //跳转至CheckBox界面 点击事件
                intent  = new Intent(MainActivity.this,CheckBoxActivity.class);
                break;
            case R.id.btn_imageview:
                //跳转至ImageView界面 点击事件
                intent  = new Intent(MainActivity.this,ImageViewActivity.class);
                break;

        }
            startActivity(intent);
        }
    }
}
