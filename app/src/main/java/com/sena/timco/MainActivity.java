package com.sena.timco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCambiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Para referenciar el button que está en el layout
         * se hace por medio del Id y con el método findViewById*/
        btnCambiar = findViewById(R.id.btnModulos);

        /* en la variable btnDos quedan almacenadas las propiedades del boton
         * para poder manejar el evento listener */
        btnCambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acciones a realizar cuando se hace clic en el botón
                // Por ejemplo, inicia otra actividad y muestra un mensaje en la interfaz de usuario
                Intent intent = new Intent(MainActivity.this, DosActivity.class);
                startActivity(intent);

                // Muestra un mensaje en la interfaz de usuario
                showToast("Hiciste clic en el botón y pasaste a la página de Módulos");

            }
        });
    }

    private void showToast(String message) {
        // Código para mostrar un mensaje en la interfaz de usuario
        // Puedes usar Toast u otras técnicas para mostrar mensajes al usuario
        // Aquí se usa Toast como ejemplo
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}