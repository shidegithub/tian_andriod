package com.example.administrator.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    private Button mBtn3;
    private TextView tv_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtn3 = (Button) findViewById(R.id.btn_3);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"btn3被点击了",Toast.LENGTH_SHORT).show();
            }
        });
        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"TV1被点击了",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showToast(View view) {
        Toast.makeText(this,"btn4被点击了",Toast.LENGTH_SHORT).show();
    }
}
