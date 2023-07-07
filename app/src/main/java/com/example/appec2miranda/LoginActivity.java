package com.example.appec2miranda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText correo,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        correo=findViewById(R.id.txt_correo);
        pass=findViewById(R.id.txt_pass);
        String email=correo.getText().toString();
        Button login=findViewById(R.id.btn_login);
     correo.addTextChangedListener(new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence s, int start, int count, int after) {

         }

         @Override
         public void onTextChanged(CharSequence s, int start, int before, int count) {
             if (email.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                 login.setEnabled(true);
             }
         }

         @Override
         public void afterTextChanged(Editable s) {

         }
     });
    }




    public void Verificar(View view){
        String email=correo.getText().toString();
        String password=pass.getText().toString();
        int a1=1;
        int a2=0;


        if (email.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            a1=1;
        } else {
            a1=0;
        }

        if (password.matches("^(?=.*[0-9]).{8,}$")) {
            a2=1;
        } else {
            a2=0;
        }
        Button login=findViewById(R.id.btn_login);
        if(a1==1 && a2==1)
            login.setEnabled(true);
        else
            login.setEnabled(false);
    }


    public void Verificar2(View view) {
        String email = correo.getText().toString();
        String password = pass.getText().toString();


        if (email.equals("ejemplo@idat.com.pe") && password.equals("Idat1234n")) {

            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, "correo Contraseña incorrecto", Toast.LENGTH_SHORT).show();


    }






}