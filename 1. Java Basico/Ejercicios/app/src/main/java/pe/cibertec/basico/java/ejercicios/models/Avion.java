package pe.cibertec.basico.java.ejercicios.models;

import android.util.Log;

import pe.cibertec.basico.java.ejercicios.interfaces.Volador;

/*

    REVISAR LOS APUNTES DE LA INTERFACE VOLADOR

    Aqui he implementado la interface volador, ya que es el unico vehiculo que puede volar e implementarlo
    en la clase padre permitiria a una moto volar

 */
public class Avion extends Vehiculo implements Volador {

    private static final String TAG = "Avion";

    private static final String NOMBRE = "moto";
    private static final int NUMERO_ASIENTOS = 50;

    public Avion(){
        this.nombre = NOMBRE;
        this.numeroAsientos = NUMERO_ASIENTOS;
    }

    @Override
    public void volar() {
        Log.d(TAG,"volar");
    }
}
