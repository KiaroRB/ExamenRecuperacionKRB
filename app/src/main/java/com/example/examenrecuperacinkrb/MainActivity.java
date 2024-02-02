import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.examenrecuperacinkrb.R;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewArea = findViewById(R.id.textViewArea);
        final EditText editTextLado = findViewById(R.id.editTextLado);
        Button btnGenerar = findViewById(R.id.btnGenerar);

        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el lado ingresado por el usuario
                String ladoStr = editTextLado.getText().toString();

                if (!ladoStr.isEmpty()) {
                    // Convertir el lado a un número decimal
                    double lado = Double.parseDouble(ladoStr);

                    // Calcular el área del cuadrado
                    double area = lado * lado;

                    // Mostrar el resultado en el TextView
                    textViewArea.setText("Área del Cuadrado: " + area);
                }
            }
        });
    }
}
