package com.example.jiangpei.inputcontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2;
    ImageButton imb1;

    EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        imb1 = (ImageButton) findViewById(R.id.imageButton);

        nameInput = (EditText) findViewById(R.id.editText);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        imb1.setOnClickListener(this);


    }

//    public void onButtonClicked(View view) {
//
//        int id = view.getId();
//
//        switch (id) {
//            case R.id.button:
//                Toast.makeText(this, "按钮1被点击了", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.button2:
//                Toast.makeText(this, "按钮2被点击了", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.imageButton:
//                Toast.makeText(this, "图像按钮被点击了", Toast.LENGTH_SHORT).show();
//                break;
//
//        }
//    }
//
//    public void onImageButtonClicked(View view) {
//        Toast.makeText(this, "图像按钮被点击了", Toast.LENGTH_SHORT).show();
//    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.button:
                Toast.makeText(this, "Welcome, " + nameInput.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "按钮2被点击了", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton:
                Toast.makeText(this, "图像按钮被点击了", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
