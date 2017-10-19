package com.example.lenovo.check_tarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CheckBox musica,carro,persona,calle;
    private ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musica =(CheckBox)findViewById(R.id.musica);
        carro =(CheckBox)findViewById(R.id.carro);
        persona =(CheckBox)findViewById(R.id.persona);
        calle = (CheckBox)findViewById(R.id.calle);

        foto =(ImageView)findViewById(R.id.foto);

        musica.setOnClickListener(this);
        carro.setOnClickListener(this);
        persona.setOnClickListener(this);
        calle.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        Checked();

    }

    public void Checked(){

        //UN SOLO
        if (musica.isChecked()==true){
            foto.setImageResource(R.drawable.muisca);
            Toast.makeText(this,"Musica ha sido selecionado",Toast.LENGTH_SHORT).show();

        }else if (carro.isChecked()==true){
            foto.setImageResource(R.drawable.car);
            Toast.makeText(this,"Carro ha sido selecionado",Toast.LENGTH_SHORT).show();

        }else if (persona.isChecked()==true){
            foto.setImageResource(R.drawable.persona);
            Toast.makeText(this,"Persona ha sido selecionado",Toast.LENGTH_SHORT).show();

        }else if (calle.isChecked()==true){
            foto.setImageResource(R.drawable.calle);
            Toast.makeText(this,"Calle ha sido selecionado",Toast.LENGTH_SHORT).show();


        }

        //DOBLES MUSICA
        if(musica.isChecked() == true && carro.isChecked()==true){
            foto.setImageResource(R.drawable.carmusic);
            Toast.makeText(this,"Musica y carro han sido selecionado",Toast.LENGTH_SHORT).show();
        }else if(musica.isChecked()==true && persona.isChecked()==true){
            foto.setImageResource(R.drawable.personamusica);
            Toast.makeText(this,"Musica y persona han sido selecionado",Toast.LENGTH_SHORT).show();
        }else if(musica.isChecked()==true && calle.isChecked()==true){
            foto.setImageResource(R.drawable.callemusica);
            Toast.makeText(this,"Musica y calle han sido selecionado",Toast.LENGTH_SHORT).show();
        }
        //DOBLES CARRO
        if(carro.isChecked() == true && musica.isChecked()==true){
            foto.setImageResource(R.drawable.carmusic);
            Toast.makeText(this,"Carro y musica han sido selecionado",Toast.LENGTH_SHORT).show();
        }else if(carro.isChecked()==true && persona.isChecked()==true) {
            foto.setImageResource(R.drawable.personacarro);
            Toast.makeText(this, "Carro y persona han sido selecionado", Toast.LENGTH_SHORT).show();
        }else if(carro.isChecked()==true && calle.isChecked()==true) {
            foto.setImageResource(R.drawable.carstreet);
            Toast.makeText(this, "Carro y calle han sido selecionado", Toast.LENGTH_SHORT).show();
        }

        //DOBLES PERSONA
        if(persona.isChecked() == true && musica.isChecked()==true){
            foto.setImageResource(R.drawable.personamusica);
            Toast.makeText(this,"Persona y musica han sido selecionado",Toast.LENGTH_SHORT).show();
        }else if(persona.isChecked()==true && carro.isChecked()==true) {
            foto.setImageResource(R.drawable.personacarro);
            Toast.makeText(this, "Persona y Carro han sido selecionado", Toast.LENGTH_SHORT).show();
        }else if(persona.isChecked()==true && calle.isChecked()==true) {
            foto.setImageResource(R.drawable.personinstreet);
            Toast.makeText(this, "Persona y calle han sido selecionado", Toast.LENGTH_SHORT).show();
        }

        //DOBLES CALLES
        if(calle.isChecked() == true && musica.isChecked()==true){
            foto.setImageResource(R.drawable.callemusica);
            Toast.makeText(this,"Calle y musica han sido selecionado",Toast.LENGTH_SHORT).show();
        }else if(calle.isChecked()==true && carro.isChecked()==true) {
            foto.setImageResource(R.drawable.carstreet);
            Toast.makeText(this, "Persona y Carro han sido selecionado", Toast.LENGTH_SHORT).show();
        }else if(calle.isChecked()==true && persona.isChecked()==true) {
            foto.setImageResource(R.drawable.personinstreet);
            Toast.makeText(this, "Persona y calle han sido selecionado", Toast.LENGTH_SHORT).show();
        }

    }
}
