package com.sena.timco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TresActivity extends AppCompatActivity {

    Button btnInicio;
    Button btnModulos;
    Button btnContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);

        btnInicio=findViewById(R.id.btnInicio);
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TresActivity.this, MainActivity.class);
                startActivity(intent);
                showToast("Hiciste clic en el botón y pasaste a la página de inicio" +
                        "");
            }
        });

        btnContacto=findViewById(R.id.btnContacto);
        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TresActivity.this, TresActivity.class);
                startActivity(intent);
                showToast("Hiciste clic en el botón y pasaste a la página de Contacto");
            }
        });

        btnModulos=findViewById(R.id.btnModulos);
        btnModulos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TresActivity.this, DosActivity.class);
                startActivity(intent);
                showToast("Hiciste clic en el botón y pasaste a la página de Módulos");
            }
        });
    }

    private void showToast(String message) {
        // Código para mostrar un mensaje en la interfaz de usuario
        Toast.makeText(TresActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}