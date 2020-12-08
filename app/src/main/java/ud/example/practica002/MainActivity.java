package ud.example.practica002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Valor01, Valor02;
    private RadioButton Opera01,Opera02,Opera03,Opera04 ;
    private Button Boton01;
    private TextView TextSal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Valor01 = findViewById(R.id.TextNum1);
        Valor02 = findViewById(R.id.TextNum2);
        Opera01 = findViewById(R.id.radioSuma);
        Opera02 = findViewById(R.id.radioResta);
        Opera03 = findViewById(R.id.radioMultiplicacion);
        Opera04 = findViewById(R.id.radioDivision);
        Boton01 = findViewById(R.id.BtnCalcular);
        TextSal = findViewById(R.id.Total);
    }

       public void calcular (View v){
           int resultado = 0;
           if(Valor01.getText().toString().isEmpty() || Valor02.getText().toString().isEmpty()) {
               Toast.makeText(this,"Campo numerico vacio", Toast.LENGTH_LONG).show();
           }//Cierre del if cuando no hay datos en los campos de texto
           else{
               if (Opera01.isChecked()) {
                   resultado = Integer.parseInt(Valor01.getText().toString()) + Integer.parseInt(Valor02.getText().toString());
               } else if (Opera02.isChecked()) {
                   resultado = Integer.parseInt(Valor01.getText().toString()) - Integer.parseInt(Valor02.getText().toString());
               } else if (Opera03.isChecked()) {
                   resultado = Integer.parseInt(Valor01.getText().toString()) * Integer.parseInt(Valor02.getText().toString());
               } else if (Opera04.isChecked()) {
                   if (Integer.parseInt(Valor02.getText().toString()) != 0) {
                       resultado = Integer.parseInt(Valor01.getText().toString()) / Integer.parseInt(Valor02.getText().toString());
                   } else {
                       Toast.makeText(this,"No puede dividir por 0", Toast.LENGTH_LONG).show();;
                   }
               }
               TextSal.setText(String.valueOf(resultado));
           }// Cierre else cuando hay datos en los campos de texto

       }//Cierre funcion Calcular

 }//Cierre actividad.java