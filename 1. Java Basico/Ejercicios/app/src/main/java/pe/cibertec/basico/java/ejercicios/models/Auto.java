package pe.cibertec.basico.java.ejercicios.models;

/*

    En esta clase Auto tengo los atributos NOMBRE y NUMERO ASIENTOS que son "static final".
    Esto quiere decir que puede ser consultado por cualquier clase y si creo varias clases Auto, ese atributo ocupara
    el mismo espacio de memoria
    ** No pueden ser sobreescritas

    Al extender de "Vehiculo" tengo la posibilidad de usar los metodos implementados y utilizar sus atributos.
    Si deseo puedo sobreescribirlos, sino no hay necesidad de implementarlos en la clase

    Otra forma seria implementar un constructor en la clase padre y pasar los parametros que necesito a traves del super
    de la clase hija pero como los datos que necesito estan dentro de la clase hija no sera necesario

    En el caso de los atributos los inicializare en el constructor Auto invocandolos con "this"

 */

public class Auto extends Vehiculo{

    /*
        *** Al ser constantes siempre van en mayusculas
     */
    private static final String NOMBRE = "auto";
    private static final int NUMERO_ASIENTOS = 5;

    public Auto(){
        this.nombre = NOMBRE;
        this.numeroAsientos = NUMERO_ASIENTOS;
    }


}
