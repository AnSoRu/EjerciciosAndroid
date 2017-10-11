package com.acme.horariosautobus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Horarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String vista = getIntent().getExtras().getString("mostrar");
        if(vista!=null){
            if(vista.equals("aluche")) {
                setContentView(R.layout.vista_2);
            }
            if(vista.equals("escuela")){
                setContentView(R.layout.activity_horarios);
            }
        }
    }
}
