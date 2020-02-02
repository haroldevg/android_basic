package pe.cibertec.basico.java.ejercicios.models;
/*

    REVISAR LOS APUNTES DE LA CLASE AUTO

 */

public class Moto extends Vehiculo {

    /*
     *** Al ser constantes siempre van en mayusculas
     */
    private static final String NOMBRE = "moto";
    private static final int NUMERO_ASIENTOS = 2;

    public Moto(){
        this.nombre = NOMBRE;
        this.numeroAsientos = NUMERO_ASIENTOS;
    }


}
