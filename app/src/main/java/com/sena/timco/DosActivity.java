package com.sena.timco;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DosActivity extends AppCompatActivity {

    Button btnInicio;
    Button btnModulos;
    Button btnContacto;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        btnInicio = findViewById(R.id.btnInicio);
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acciones a realizar cuando se hace clic en el botón
                // Por ejemplo, inicia otra actividad y muestra un mensaje en la interfaz de usuario
                Intent intent = new Intent(DosActivity.this, MainActivity.class);
                startActivity(intent);
                // Muestra un mensaje en la interfaz de usuario
                showToast("Hiciste clic en el botón y pasaste a la página de Inicio");
            }
        });


    }
            private void showToast(String message) {
           // Código para mostrar un mensaje en la interfaz de usuario
           // Puedes usar Toast u otras técnicas para mostrar mensajes al usuario// Aquí se usa Toast como ejemplo
            Toast.makeText(DosActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}