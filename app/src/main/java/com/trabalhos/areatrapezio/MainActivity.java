package com.trabalhos.areatrapezio;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText areaMaior;
    private EditText areaMenor;
    private EditText altura;
    private TextView txtRes;
    private Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        areaMaior = findViewById(R.id.areaMaior);
        areaMenor = findViewById(R.id.areaMenor);
        altura = findViewById(R.id.altura);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtRes = findViewById(R.id.txtRes);

        btnCalcular.setOnClickListener(x -> Calcular());

    }

    private void Calcular(){
        int numAreaMaior = Integer.parseInt(areaMaior.getText().toString());
        int numAreaMenor = Integer.parseInt(areaMenor.getText().toString());
        int numAltura = Integer.parseInt(altura.getText().toString());

        float res = ((numAreaMaior + numAreaMenor) * numAltura) / 2;

        String valor = getString(R.string.txtRes) + res + " cm²";

        txtRes.setText(valor);


    ;}
}