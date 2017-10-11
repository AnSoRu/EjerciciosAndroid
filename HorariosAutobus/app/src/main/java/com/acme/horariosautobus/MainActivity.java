package com.acme.horariosautobus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public void vistaAluche(View v){
        Intent intent = new Intent(this,Horarios.class);
        intent.putExtra("mostrar","aluche");
        startActivity(intent);
    }

    public void vistaFacultad(View v){
        Intent intent = new Intent(this,Horarios.class);
        intent.putExtra("mostrar","escuela");
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aluche = (Button)findViewById(R.id.alucheButton) ;
        Button escuela = (Button)findViewById(R.id.escuelaButton);

        aluche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vistaAluche(v);
            }
        });
        escuela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vistaFacultad(v);
            }
        });
    }
}
