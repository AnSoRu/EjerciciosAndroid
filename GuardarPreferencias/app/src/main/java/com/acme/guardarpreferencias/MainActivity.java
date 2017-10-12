package com.acme.guardarpreferencias;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cargar = (Button)findViewById(R.id.cargar);
        Button guardar = (Button)findViewById(R.id.guardar);

        final SharedPreferences preferences = this.getSharedPreferences("preferencias",MODE_PRIVATE);

        cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensajeGuardado = preferences.getString("mensaje","");
                EditText texto = (EditText)findViewById(R.id.mensaje);
                texto.setText(mensajeGuardado);
            }
        });
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor edit = preferences.edit();
                EditText texto = (EditText)findViewById(R.id.mensaje);
                edit.clear();
                edit.putString("mensaje",texto.getText().toString());
                texto.setText("Guardado");
                edit.commit();
            }
        });

    }
}
