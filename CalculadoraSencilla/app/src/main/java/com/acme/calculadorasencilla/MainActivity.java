package com.acme.calculadorasencilla;

import android.content.SyncStatusObserver;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {



    //ConcurrentLinkedDeque<String> operaciones = new ConcurrentLinkedDeque<String>();
    //List<Pair<Integer,String>> miLista = new ArrayList<Pair<Integer, String>>();

    boolean cadMF = false;

    public void procesar(TextView tv) {
        if(tv!=null) {
            System.out.println(tv.getText().toString());
            //Mirar si cumple la expresion regular
            String pattern = "-?\\d+(\\s*[-+*%/]\\s*-?\\d+)*\\s*[-+*%/]\\s*-?\\d+";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(tv.getText().toString());
            if (m.find()) {
                //Aqui tengo que procesar los tokens
                tv.setText("_");
                String cInt = tv.getText().toString();

            } else {
                //No esta bien formada la cadena
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Cadena mal formada", Toast.LENGTH_SHORT);
                toast.show();
                tv.append("_");
                cadMF = true;
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cero = (Button) findViewById(R.id.button_0);
        Button decimal = (Button) findViewById(R.id.button_decimal);
        Button igual = (Button) findViewById(R.id.button_igual);

        Button uno = (Button) findViewById(R.id.button_1);
        Button dos = (Button) findViewById(R.id.button_2);
        Button tres = (Button) findViewById(R.id.button_3);

        Button cuatro = (Button) findViewById(R.id.button_4);
        Button cinco = (Button) findViewById(R.id.button_5);
        Button seis = (Button) findViewById(R.id.button_6);

        Button siete = (Button) findViewById(R.id.button_7);
        Button ocho = (Button) findViewById(R.id.button_8);
        Button nueve = (Button) findViewById(R.id.button_9);

        Button por = (Button) findViewById(R.id.button_por);
        Button div = (Button) findViewById(R.id.button_div);
        Button exp = (Button) findViewById(R.id.button_exp);
        Button del = (Button) findViewById(R.id.button_del);

        Button mas = (Button) findViewById(R.id.button_mas);
        Button menos = (Button) findViewById(R.id.button_menos);

        final TextView introducido = (TextView) findViewById(R.id.introducido);
        System.out.println("Al inicio es " + introducido.getText().toString());
        introducido.setText(" ");

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length() - 1));
                introducido.append("0_");
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("._");
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                procesar(introducido);
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("1_");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("2_");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("3_");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("4_");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                System.out.println(text);
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("5_");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("6_");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("7_");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("8_");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("9_");
            }
        });
        por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!introducido.equals("")) {
//                    if(cadMF){
//                        introducido.setText("");
//                        introducido.setText("_");
//                        cadMF = false;
//                    }
                    String text = introducido.getText().toString();
                    introducido.setText(text.substring(0, text.length()- 1));
                    introducido.append("*_");
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "No se ha introducido ningun numero", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!introducido.equals("")) {
//                    if(cadMF){
//                        introducido.setText("");
//                        introducido.setText("_");
//                        cadMF = false;
//                    }
                    String text = introducido.getText().toString();
                    introducido.setText(text.substring(0, text.length()- 1));
                    introducido.append("/_");
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "No se ha introducido ningun numero", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("exp_");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if(cadMF){
                    introducido.setText("");
                    introducido.setText("_");
                    cadMF = false;
                }*/
                String text = introducido.getText().toString();
                if (text.length()>1) {
                    introducido.setText(text.substring(0, text.length() - 2));
                    introducido.append("_");
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "No se ha introducido ningun numero", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!introducido.equals("")) {
//                    if(cadMF){
//                        introducido.setText("");
//                        introducido.setText("_");
//                        cadMF = false;
//                    }
                    String text = introducido.getText().toString();
                    introducido.setText(text.substring(0, text.length()- 1));
                    introducido.append("+_");
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "No se ha introducido ningun numero", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(cadMF){
//                    introducido.setText("");
//                    introducido.setText("_");
//                    cadMF = false;
//                }
                String text = introducido.getText().toString();
                introducido.setText(text.substring(0, text.length()- 1));
                introducido.append("-_");
            }
        });
    }
}
