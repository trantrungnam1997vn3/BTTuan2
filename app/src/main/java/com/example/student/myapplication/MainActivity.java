package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView resultText;
    private Button btnTong, btnHieu, btnTich, btnThuong, btnUSCLN;
    private EditText inputA, inputB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTong = (Button) findViewById(R.id.btnTong);
        btnHieu = (Button) findViewById(R.id.btnHieu);
        btnTich = (Button) findViewById(R.id.btnTich);
        btnThuong = (Button) findViewById(R.id.btnThuong);
        btnUSCLN = (Button) findViewById(R.id.btnUSCLN);

        btnTong.setOnClickListener(this);
        btnHieu.setOnClickListener(this);
        btnTich.setOnClickListener(this);
        btnThuong.setOnClickListener(this);
        btnUSCLN.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        inputA = (EditText)  findViewById(R.id.inputA);
        int valueA = Integer.parseInt(inputA.getText().toString());

        inputB = (EditText)  findViewById(R.id.inputB);
        int valueB = Integer.parseInt(inputB.getText().toString());
        switch (v.getId()) {
            case R.id.btnTong: {
                resultText = (TextView) findViewById(R.id.result);
                int result = valueA + valueB;
                resultText.setText("Ket qua la" + result);

                break;
            }
            case R.id.btnHieu: {
                resultText = (TextView) findViewById(R.id.result);
                int result = valueA - valueB;
                resultText.setText("Ket qua la" + result);
                break;
            }
            case R.id.btnTich: {
                resultText = (TextView) findViewById(R.id.result);
                int result = valueA * valueB;
                resultText.setText("Ket qua la" + result);
                break;
            }
            case R.id.btnThuong: {
                resultText = (TextView) findViewById(R.id.result);
                float result = valueA / (float) valueB;
                resultText.setText("Ket qua la" + result);
                break;
            }
            case R.id.btnUSCLN: {
                resultText = (TextView) findViewById(R.id.result);

                while (valueA != valueB) {
                    if (valueA > valueB) {
                        valueA -= valueB;
                    }
                    else {
                        valueB -= valueA;
                    }
                }
                resultText.setText("Tinh USCLN" + valueA);
                break;
            }

            case R.id.btnThoat: {
                finish();
            }
            default:
                break;
        }
    }
}
