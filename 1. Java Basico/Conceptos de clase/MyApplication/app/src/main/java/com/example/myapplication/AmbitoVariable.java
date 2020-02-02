package com.example.myapplication;

/*

    final: Si una variable es declarada final no aceptara cambios una vez inicializada en la clase,
            Una clase final no puede heredar a otras clases hijas

    static: si tenemos una variable que sera una constante (ejemplo el valor de PI) entonces no tiene sentido crear
            esa misma variable por cada clase creada. Simplemente al ser un static ocupa el mismo espacio de memoria cada vez que sea crea una clase.


    static final: usamos este ambito en caso de que queremos tener una variable constante que sea un elemento comun para todas las clases.

 */

public class AmbitoVariable {

    public static double PI = 3.1416;
    public final double PI2 = 3.1416;
    public final static double PI3 = 3.1416;

}

class AmbitoVariable2{
    void testAmbitoVariable(){
        double val  = AmbitoVariable.PI;
        double val2 = AmbitoVariable.PI3;
    }
}
