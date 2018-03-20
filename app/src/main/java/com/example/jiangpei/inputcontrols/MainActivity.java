package com.example.jiangpei.inputcontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view) {

        int id = view.getId();

        switch (id) {
            case R.id.button:
                Toast.makeText(this, "按钮1被点击了", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "按钮2被点击了", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton:
                Toast.makeText(this, "图像按钮被点击了", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    public void onImageButtonClicked(View view) {
        Toast.makeText(this, "图像按钮被点击了", Toast.LENGTH_SHORT).show();
    }
}
