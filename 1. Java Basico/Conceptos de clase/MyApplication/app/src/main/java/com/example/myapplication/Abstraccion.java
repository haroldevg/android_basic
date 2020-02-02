package com.example.myapplication;

/*

    Abstraccion es una forma de extraer los metodos y propiedades comunes.
    Te permite usas modificadores de acceso tales como public, private y protected
    Puedes implementar metodos en una clase abstracta que pueden ser sobreescritos en las subclases
    Para hacer una clase abstracta se utiliza el termino "abstract"
    Puedes crear propiedades, atributos

 */

abstract class Abstraccion {

    private int val = 5;

    public static final int CONSTANTE = 5;

    //tiene el modificador de acceso protected es decir que solo puede ser utilizado por sus subclases(clases hijas)
    //Cuando se implemente aparece la palabra "super" que llamara el metodo de la superclase (padre)
    protected int sumar(int a,int b){
        return a + b;
    }

    //Un metodo abstracto tiene que ser implementado por las subclases que hereden esta clase abstracta
    public abstract int restar(int a,int b);

}
