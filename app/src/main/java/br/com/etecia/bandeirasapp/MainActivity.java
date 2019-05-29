package br.com.etecia.bandeirasapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.etecia.bandeirasapp.model.State;

public class MainActivity extends AppCompatActivity {

    State [] states={ new State("", "", "","")};

//Colocar na activity_main.xml o LinearLayout na vertical e colocar quem é filho de quem(negocio das bolinhas)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
