package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtA ,edtB,edtC,editKq;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vd3);
        edtA = findViewById(R.id.editA);
        edtB = findViewById(R.id.editB);
        edtC = findViewById(R.id.editC);
        editKq = findViewById(R.id.editKq);
        btn1 = findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = Integer.parseInt(edtC.getText().toString());
                editKq.setText(a+"");
            }
        });
        }
}
