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

        btnModulos=findViewById(R.id.btnModulos);
        btnModulos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DosActivity.this, DosActivity.class);
                startActivity(intent);
                showToast("Hiciste clic en el botón y pasaste a la página de Módulos");
            }
        });

        btnContacto=findViewById(R.id.btnContacto);
        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DosActivity.this, TresActivity.class);
                startActivity(intent);
                showToast("Hiciste clic en el botón y pasaste a la página de Contacto");
            }
        });

    }
            private void showToast(String message) {
           // Código para mostrar un mensaje en la interfaz de usuario
            Toast.makeText(DosActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}