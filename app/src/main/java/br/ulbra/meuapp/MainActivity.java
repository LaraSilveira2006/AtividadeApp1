package br.ulbra.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtv1, edtv2;
    Button btnsomar,btnsubtrair,btnMultiplicar,btndividir;
    TextView txtResultado;
    double v1, v2, soma,subtrair,multiplicar,dividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtv1 = (EditText) findViewById(R.id.edtv1);
        edtv2 = (EditText) findViewById(R.id.edtv2);
        btnsomar = (Button) findViewById(R.id.btnsomar);
        txtResultado = (TextView) findViewById(R.id.txtresultado);
        btnsubtrair =(Button)findViewById(R.id.btnSubtrair);
        btndividir = (Button)findViewById(R.id.btndividir);
        btnMultiplicar =(Button)findViewById(R.id.btnMultiplicar);

        btnsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edtv1.getText().toString());
                v2 = Double.parseDouble(edtv2.getText().toString());
                soma = v1 + v2;
                txtResultado.setText("Resultado: " + soma);
            }
        });
        btnsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edtv1.getText().toString());
                v2 = Double.parseDouble(edtv2.getText().toString());
                subtrair  = v1 - v2;
                txtResultado.setText("Resultado: " + subtrair);
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edtv1.getText().toString());
                v2 = Double.parseDouble(edtv2.getText().toString());
                multiplicar  = v1 * v2;
                txtResultado.setText("Resultado: " + multiplicar);
            }
        });
        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edtv1.getText().toString());
                v2 = Double.parseDouble(edtv2.getText().toString());
                dividir  = v1 / v2;
                txtResultado.setText("Resultado: " + dividir);
            }
        });
    }


}

