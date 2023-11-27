package com.sena.timco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TresActivity extends AppCompatActivity {

    Button btnInicio;
    Button btnModulos;
    Button btnContacto;
    private EditText editTextName, editTextEmailAddress, editTextAsunto, editTextMultiline;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);

        editTextName = findViewById(R.id.editTextName);
        editTextEmailAddress = findViewById(R.id.editTextEmailAddress);
        editTextAsunto = findViewById(R.id.editTextAsunto);
        editTextMultiline=findViewById(R.id.editTextMultiline);

        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Obtener los valores de los campos de texto
                String name = editTextName.getText().toString();
                String email = editTextEmailAddress.getText().toString();
                String asunto = editTextAsunto.getText().toString();
                String mensaje =editTextMultiline.getText().toString();

                // Puedes hacer lo que quieras con los datos, por ejemplo, mostrarlos en un Toast
                String message = "Nombre completo: " + name + "\nCorreo electrónico: " + email + "\nAsunto: " + asunto + "\nMensaje: "+ mensaje;
                Toast.makeText(TresActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });


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