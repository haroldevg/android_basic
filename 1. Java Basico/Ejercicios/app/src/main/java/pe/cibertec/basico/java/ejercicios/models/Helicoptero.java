package pe.cibertec.basico.java.ejercicios.models;

import android.util.Log;

import pe.cibertec.basico.java.ejercicios.interfaces.Volador;

public class Helicoptero extends Vehiculo implements Volador {

    private static final String TAG = "Helicoptero";
    private static final String NOMBRE = "Helicoptero";
    private static final int NUMERO_ASIENTOS = 4;

    public Helicoptero(){
        this.nombre = NOMBRE;
        this.numeroAsientos = NUMERO_ASIENTOS;
    }

    @Override
    public void volar() {
        Log.d(TAG,"volar");
    }
}
