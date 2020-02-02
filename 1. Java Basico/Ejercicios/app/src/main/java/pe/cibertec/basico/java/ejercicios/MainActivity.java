package pe.cibertec.basico.java.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import pe.cibertec.basico.java.ejercicios.interfaces.Volador;
import pe.cibertec.basico.java.ejercicios.models.Auto;
import pe.cibertec.basico.java.ejercicios.models.Avion;
import pe.cibertec.basico.java.ejercicios.models.Helicoptero;
import pe.cibertec.basico.java.ejercicios.models.Moto;
import pe.cibertec.basico.java.ejercicios.models.Vehiculo;

/*

    Para este ejercicio quiero representar varios tipos de vehiculos y existe la posibilidad de que
     cree a futuro mas tipos de vehiculos, sin embargo escribir el mismo codig puede generar errores
     como por ejemplo:

     - metodos no implementados
     - escritura de metodos diferentes

     Puntos a favor:

     - Reutilizacion de codigo: por ejemplo si en la clase padre implementamos un metodo que en la mayoria de las clases hijas
     lo van a reutilizar sin necesidad de modificar entonces reducimos codigo en nuestras clases

     - Mantenimiento: si tenemos una funcionalidad que deseamos implementar a nuestra aplicacion, en vez de modificar la clase existente
     podemos heredar de esa clase e implementar una nueva clase con la funcionalidad que queremos agregar.

     *** Es un buena practica utilizar herencia si es que nuestro caso lo amerita

 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "JAVABASICO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vehiculo auto = new Auto();
        Vehiculo moto = new Moto();
        Vehiculo avion = new Avion();
        Vehiculo helicoptero = new Helicoptero();

        printNameInConsoleLog(auto);
        printNameInConsoleLog(moto);
        printNameInConsoleLog(avion);
        printNameInConsoleLog(helicoptero);
        /*
            Es necesario castear los objetos avion y helicoptero para poder usar el metodo volar
            ** Con castear me refiero a que intento convertir ese "Vehiculo" en "Volador" y de esa forma utilizar
                el metodo volar
         */

        ((Volador) avion).volar();
        ((Volador) helicoptero).volar();

    }

    private void printNameInConsoleLog(Vehiculo vehiculo){
        Log.d(TAG,"PRINT "+vehiculo.getNombre());
    }
}
