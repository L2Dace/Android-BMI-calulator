package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText weight,height;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cannang = weight.getText().toString();
                String chieucao = height.getText().toString();
                // ép kiểu
                Float w = Float.parseFloat(cannang);
                Float h = Float.parseFloat(chieucao)/100;
                Float kq = w / (h * h);
                //ép k   số -> chuỗi
                result.setText(String.valueOf(kq));
            }
        });
    }
    private void AnhXa(){
        result = (TextView) findViewById(R.id.result);
        weight = (EditText) findViewById(R.id.weight);
        height = (EditText) findViewById(R.id.height);
        button = (Button) findViewById(R.id.btn);
    }
}