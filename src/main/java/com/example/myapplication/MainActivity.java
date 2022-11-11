package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText idA, idB, idC;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        idA = findViewById(R.id.but1);
        idB = findViewById(R.id.but2);
        idC = findViewById(R.id.but3);

        button.setOnClickListener(view -> {
            String a_value = idA.getText().toString(); // перевели в строку
            String b_value = idB.getText().toString();
            String c_value = idC.getText().toString();

            double a = Integer.parseInt(a_value);
            double b = Integer.parseInt(b_value);
            double c = Integer.parseInt(c_value);

            double x1 = 0;
            double x2 = 0;

            double D = b * b - 4 * a * c;

             if (D == 0) {
                 x1 = (-1 * b) / 2 * a;
                 textView.setText("Корень квадратного уровнения: " + Double.toString(x1));
             } else if (D > 0) {
                 x1 = (- 1 * b) + Math.sqrt(D) / 2 * a;
                 x2 = (- 1 * b) - Math.sqrt(D) / 2 * a;
                 textView.setText("Корни квадратного уровнения: " + Double.toString(x1) + " , " + Double.toString(x2));
             } else {
                 textView.setText("Нет действительных квадратных уравнений");
             }
        });
    }
}
