/*
    Equipo 3
    Chávez Torreblanca Angel Alexis
    Montes de Oca Arellano Edgar
    Rodríguez Domínguez Luis Fernando
    Santiago de Luis Mauricio
    Vargas Campos Miguel Ángel
*/

package com.example.actividad1_equipo3_5iv7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView salida;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salida = findViewById(R.id.textView);
    }

    public void EscribirCero(View view) {
        float valor = Float.parseFloat(salida.getText().toString());
        if (valor == 0.0f) {
            salida.setText("0");
        } else {
            salida.setText(salida.getText() + "0");
        }
    }

    public void EscribirUno(View view) {
        float valor = Float.parseFloat(salida.getText().toString());
        if (valor == 0.0f) {
            salida.setText("1");
        } else {
            salida.setText(salida.getText() + "1");
        }
    }

    public void EscribirDos(View view) {
        float valor = Float.parseFloat(salida.getText().toString());
        if (valor == 0.0f) {
            salida.setText("2");
        } else {
            salida.setText(salida.getText() + "2");
        }
    }

    public void EscribirTres(View view) {
        float valor = Float.parseFloat(salida.getText().toString());
        if (valor == 0.0f) {
            salida.setText("3");
        } else {
            salida.setText(salida.getText() + "3");
        }
    }

    public void EscribirCuatro(View view) {
        float valor = Float.parseFloat(salida.getText().toString());
        if (valor == 0.0f) {
            salida.setText("4");
        } else {
            salida.setText(salida.getText() + "4");
        }
    }

    public void EscribirCinco(View view) {
        float valor = Float.parseFloat(salida.getText().toString());
        if (valor == 0.0f) {
            salida.setText("5");
        } else {
            salida.setText(salida.getText() + "5");
        }
    }

    public void EscribirSeis(View view) {
        float valor = Float.parseFloat(salida.getText().toString());
        if (valor == 0.0f) {
            salida.setText("6");
        } else {
            salida.setText(salida.getText() + "6");
        }
    }

    public void EscribirSiete(View view) {
        float valor = Float.parseFloat(salida.getText().toString());
        if (valor == 0.0f) {
            salida.setText("7");
        } else {
            salida.setText(salida.getText() + "7");
        }
    }

    public void EscribirOcho(View view) {
        float valor = Float.parseFloat(salida.getText().toString());
        if (valor == 0.0f) {
            salida.setText("8");
        } else {
            salida.setText(salida.getText() + "8");
        }
    }

    public void EscribirNueve(View view) {
        float valor = Float.parseFloat(salida.getText().toString());
        if (valor == 0.0f) {
            salida.setText("9");
        } else {
            salida.setText(salida.getText() + "9");
        }
    }

    public void LimpiarResultado(View view) {
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
        salida.setText("0");
    }

    public void DEL(View view){
        String str = salida.getText().toString();
        try {
            if(str.length() > 1) {
                salida.setText(str.substring(0, str.length() - 1));
            }
            else {
                salida.setText("0");
            }
        }catch (Exception e) {
            salida.setText(str);
        }
    }

    public void CambioSigno(View view) {
        float valor = Float.parseFloat(String.valueOf(salida.getText()));
        valor = valor * -1.0f;
        salida.setText("" + valor);
    }

    public void OperacionPorcentaje(View view) {
        numero1 = Float.parseFloat(String.valueOf(salida.getText()));
        operacion = "%";
        salida.setText("0");
    }

    public void OperacionDividir(View view) {
        numero1 = Float.parseFloat(String.valueOf(salida.getText()));
        operacion = "/";
        salida.setText("0");
    }

    public void OperacionMulti(View view) {
        numero1 = Float.parseFloat(String.valueOf(salida.getText()));
        operacion = "*";
        salida.setText("0");
    }

    public void OperacionMenos(View view) {
        numero1 = Float.parseFloat(String.valueOf(salida.getText()));
        operacion = "-";
        salida.setText("0");
    }

    public void OperacionMas(View view) {
        numero1 = Float.parseFloat(String.valueOf(salida.getText()));
        operacion = "+";
        salida.setText("0");
    }

    public void EscribirPunto(View view) {
        if (!String.valueOf(salida.getText()).contains(".")) {
            salida.setText(salida.getText() + ".");
        }
    }

    public void MostrarResultado(View view) {
        numero2 = Float.parseFloat(String.valueOf(salida.getText()));
        float result = 0.0f;

        if(operacion.equals("%")){
            result = (numero1 / 100.0f) * numero2;
        }if(operacion.equals("/")){
            if(numero2 != 0.0f){
                result = numero1 / numero2;
            }else{
                result = 0.0f;
                Toast.makeText(this, "BROMITAAA XDXD", Toast.LENGTH_LONG).show();
            }
        }else if(operacion.equals("*")){
            result = numero1 * numero2;
        }else if(operacion.equals("-")){
            result = numero1 - numero2;
        }else if(operacion.equals("+")){
            result = numero1 + numero2;
        }

        salida.setText(result + "");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }

}