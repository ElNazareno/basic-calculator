package com.example.ciclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    //Declarar variables xd
    Button btnSuma,btnResta,btnMultiplicacion,btnDivicion,btnLimpiar;
    EditText txtNumero1,txtNumero2;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero1=(EditText)findViewById(R.id.txtNumero1);
        txtNumero2=(EditText)findViewById(R.id.txtNumero2);
        btnSuma=(Button)findViewById(R.id.btnSuma);
        btnResta=(Button)findViewById(R.id.btnResta);
        btnMultiplicacion=(Button)findViewById(R.id.btnMultiplicacion);
        btnDivicion=(Button)findViewById(R.id.btnDivision);
        btnLimpiar=(Button)findViewById(R.id.btnLimpiar);
        txtResultado=(TextView)findViewById(R.id.txtResultado);



        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aa=txtNumero1.getText().toString();
                String awa="";
                try {
                    double n1=Double.parseDouble(txtNumero1.getText().toString());
                    double n2=Double.parseDouble(txtNumero2.getText().toString());
                    double res=n1+n2;
                    txtResultado.setText("el resultado es: "+res);
                }
                catch (Exception e)
                {
                    txtResultado.setText("Ni para sumar sirves CTM");
                }
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    double n1=Double.parseDouble(txtNumero1.getText().toString());
                    double n2=Double.parseDouble(txtNumero2.getText().toString());
                    double res=n1-n2;
                    txtResultado.setText("el resultado es: "+res);
                }
                catch (Exception e)
                {
                    txtResultado.setText("Ni para sumar restar CTM");
                }
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    double n1=Double.parseDouble(txtNumero1.getText().toString());
                    double n2=Double.parseDouble(txtNumero2.getText().toString());
                    double res=n1*n2;
                    txtResultado.setText("el resultado es: "+res);
                }
                catch (Exception e)
                {
                    txtResultado.setText("Ni para multilicar sirves CTM");
                }
            }
        });
        btnDivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    double n1=Double.parseDouble(txtNumero1.getText().toString());
                    double n2=Double.parseDouble(txtNumero2.getText().toString());
                    if(n2==0)
                    {
                        txtResultado.setText("ERROR: como vas a dividir entre 0");
                    }
                    else
                    {
                        double res=n1/n2;
                        txtResultado.setText("el resultado es: "+res);
                    }
                    }
                catch (Exception e)
                {
                    txtResultado.setText("Ni para Dividir sirves CTM");
                }
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado.setText("");
                txtNumero1.setText("");
                txtNumero2.setText("");
            }
        });
        }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}