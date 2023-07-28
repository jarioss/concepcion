package com.example.concepcion;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.util.Locale;

public class Home extends AppCompatActivity {
    //ZONA DE ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitiosTuristicos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //asociando los atributos de tipo boton a los ID que pusimos en xml
        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitiosTuristicos=findViewById(R.id.botonturismo);
        //escuchando los eventos de click en el boton
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el HOME
                Intent intent= new Intent(Home.this,Hoteles.class);
                startActivity(intent);
            }
        });
        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Home.this,Restaurantes.class);
                startActivity(intent2);
            }
        });

        botonSitiosTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Home.this,Sitios.class);
                startActivity(intent3);
            }
        });
    }
    //Cargamos el menu de opciones
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    //Funcion para cargar el funcionamiento del menu
    public boolean onOptionsItemSelected(MenuItem item){
        //observar el comportamiento del usuario frente el menu
        int itemSeleccionado=item.getItemId();
        switch(itemSeleccionado){
            case(R.id.opcion1):
                this.lenguageChange("es");
                Intent spanishIntent = new Intent(Home.this, Home.class);
                startActivity(spanishIntent);
                break;
            case(R.id.opcion2):
                this.lenguageChange("en");
                Intent englishIntent = new Intent(Home.this, Home.class);
                startActivity(englishIntent);
                break;
            case(R.id.opcion3):
                this.lenguageChange("it");
                Intent italianIntent = new Intent(Home.this, Home.class);
                startActivity(italianIntent);
                break;
            case(R.id.opcion4) :
                Toast.makeText(this, "accionaste Acerca de", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    //método para cambiar el idioma de la app

    public void lenguageChange(String lenguage){
        //Crear un objeto de la clase LOCALE para modificar el idioma
        Locale locale = new Locale(lenguage);

        //Establecemos la configuración del idioma en el telefono

        Resources resources = getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);

        //Actualizo la configuracion del telefono

        /*Context context = getBaseContext();
        context = context.createConfigurationContext(configuration);
        Resources resourcesUpdate = context.getResources();
        resourcesUpdate.updateConfiguration(configuration, resourcesUpdate.getDisplayMetrics());*/

        getBaseContext().getResources().updateConfiguration(configuration,getBaseContext().getResources().getDisplayMetrics());
    }
}