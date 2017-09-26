package com.example.usuario.primera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button boton;
    private TextView texto;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.button);
        texto = (TextView) findViewById(R.id.textView);
        boton.setOnClickListener(this);
        actualizar();
    }

    public void onClick(View view){
        if (view == boton) {
            actualizar();
        }
    }

    private void actualizar(){
        texto.setText(new Date().toString());
    }
}