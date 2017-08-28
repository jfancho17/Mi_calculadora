package incorporation.app.primera.mi.micalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //private double unito;
    private EditText workspace;
    private String count = "", operando1, operando2;
    private Double op1, op2, resultado;
    private int flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //count = 0;
        workspace = (EditText) findViewById(R.id.workspace);
        workspace.setInputType(InputType.TYPE_NULL);        //aqui casual desabilitando el teclado para que no copien marikadas
    }

    public void poner_punto(View view) {
        count += ".";
    }

    public void poner_cero(View view) {
        //count = (count * 10) + 0;
        count += "0";
        workspace.setText("" + count);
    }

    public void poner_uno(View view) {
        count += "1";
        workspace.setText("" + count);
    }

    public void poner_dos(View view) {
        count += "2";
        workspace.setText("" + count);
    }

    public void poner_tres(View view) {
        count += "3";
        workspace.setText("" + count);
    }

    public void poner_cuatro(View view) {
        count += "4";
        workspace.setText("" + count);
    }

    public void poner_cinco(View view) {
        count += "5";
        workspace.setText("" + count);
    }

    public void poner_seis(View view) {
        count += "6";
        workspace.setText("" + count);
    }

    public void poner_siete(View view) {
        count += "7";
        workspace.setText("" + count);
    }

    public void poner_ocho(View view) {//comentario
        count += "8";
        workspace.setText("" + count);
    }

    public void poner_nueve(View view) {
        count += "9";
        workspace.setText("" + count);
    }

    public void CE(View view) {
        count = "";
        operando1 = "";
        operando2 = "";
        resultado = 0.0;
        op1 = 0.0;
        op2 = 0.0;
        workspace.setText("");
    }

    public void dividir(View view) {
        operando1 = count;
        count = "";
        workspace.setText("" + operando1 + " ÷");
        flag = 4;
    }

    public void multiplicar(View view) {
        operando1 = count;
        count = "";
        workspace.setText("" + operando1 + " ×");
        flag = 3;
    }

    public void restar(View view) {
        operando1 = count;
        count = "";
        workspace.setText("" + operando1 + " −");
        flag = 2;
    }

    public void sumar(View view) {
        operando1 = count;
        count = "";
        workspace.setText("" + operando1 + " +");
        flag = 1;
    }

    public void resultado(View view) {
        /*-----------------------------------de entero a string
        int numero = 1234;
        String cadena = "";
        cadena = String.valueOf(numero);
        cadena= Integer.toString(numero);*/

        /*-----------------------------------de string a entero
        String cadena = "1234";
        int numero = 0;
        numero = Integer.parseInt(cadena)*/
        operando2 = count;
        op1 = Double.parseDouble(operando1);    //de string a Double
        op2 = Double.parseDouble(operando2);    //de string a Double
        if (flag == 1) {
            resultado = op1 + op2;
        } else if (flag == 2) {
            resultado = op1 - op2;
        } else if (flag == 3) {
            resultado = op1 * op2;
        } else if (flag == 4) {
            resultado = op1 / op2;
        }
        workspace.setText("" + resultado);
        count = "";
        operando1 = "";
        operando2 = "";
        resultado = 0.0;
        op1 = 0.0;
        op2 = 0.0;


    }


}
