package com.example.myapplication;

/*
    Considerar que la nomenclatura de clases en java es CamelCase es decir que cada frase o palabra
    comienza con una letra mayuscula y luego con minuscula.
    Evitar separar el nombre por algun otro caracter (ejem /*_-)

    En el caso de las variables preferiblemente en minusculas.

    Aqui dejo una tabla mas detallada de los tipos de variable

    https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRtNQwoQVrR9qoPUod0N0kioyPXY2Q9DvWaogdqJbDZlQj2oz2I

*/

public class TipoVariable {

    // Es un arreglo de caracteres que puede representar frases o palabras
    String name = "Tipo de variable";

    // El valor entero permite guardar numeros naturales de - 2,000,000,000 a 2,000,000,000 aprox
    // Considerar que cada tipo de variable tiene un valor minimo y maximo que puede almacenar
    int age = 18;

    // A diferencia del valor entero ocupa el doble de memoria y su valor minimo y maximo es muchisimo mayor
    long cantidadStock = 2000000;

    //Este tipo de variable almacena true o false, es el que menos bytes ocupa
    boolean enable = true;

    //Este tipo de variable representa valores decimales, obligatoriamente debe ir una f al final
    float precio = 0.5f;

    //A diferencia de double su valor minimo y maximo que puede almacenar es mayor
    double monto = 2.5;

    //A parte de ArrayList y LinkedList hay una forma mas sencilla de recorrer un arreglo
    int[] numeros = {1, 2, 3, 4, 5};
    String[] palabras = {"palabra1","palabra2"};

    //Cuando creas un arreglo vacio te pide indicar cuantos elementos vas a almacenar
    //A diferencia de los arreglos que vimos en clase este no es dinamico ( es decir una vez creado con un tamaño fijo, no te permite agregar mas)
    double[] montos = new double[20];

    //Un arreglo de 20 elementos tiene indices del 0 al 19, siempre se cuenta desde el cero
    //Si agregas un valor fuera del rango de los que definiste, saldra un error
    void inicializarNumeros(){
        montos[0] = 20.5;
        montos[1] = 21.2;
        montos[2] = 15.6;
        montos[3] = 14.5;
    }

    //Puedes inicializar atributos en una sola linea si comparten el mismo tipo de variable
    int x,y,z;

    //En el caso de los objetos se crea de esta forma
    //Tipo variable = new Tipo
    //Al crear un objeto, tenemos la disponibilidad de inicializar todos sus atributos y conocer su comportamiento
    //A traves de los metodos
    Person person = new Person();

    /*
    IMPORTANTE

    CUANDO NO SE INICIALIZA UNA VARIABLE, PUEDE RETORNAR ERROR.
    TE PEDIRA QUE LE DES UN VALOR A ESA VARIABLE

     */

}
