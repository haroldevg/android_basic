package com.example.myapplication;

public class Operadores {

    void operadoresConNumerosEnteros(){
        int a = 5;
        int b = 7;
        //El valor para la variable C seria 12 ( 5 + 7 )
        int c  = a + b;
        //El valor actual seria 12 pero con el operador += acortas la sentencia de "c = c + a" a "c += a"
        //El valor nuevo seria 17
        c += a;
        //El valor actual seria 17 pero si utilizamos el operador -= acortas la sentencia de "c = c - a" a "c -= a"
        //El valor nuevo seria 12
        c -= a;
        //Al utilizar el operador "++" aumenta en 1 la variable
        c++;
        //Al utilizar el operador "--" reduces en 1 la variable
        c--;
        //Si deseas haces una multiplicacion o una division
        c = a*b;
        //Cuando divides dos enteros existe la posibilidad que el valor sea un decimal pero al usarlo en una variable entera
        //realizara un redondeo
        c = a/b;
    }

    void operadoresConStrings(){

        //Para unir dos Strings se usa el operador "+"
        String val = "Hola";
        String val2 = "Alumnos";
        String val3  = val+val2;
        //Como vimos en clase se pudo concatenar String y otros tipos de variables

    }

    /*
    *
    * En el caso de los operadores racionales es necesario tener presente sobre operadores logicos
    * https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT5ZZTlzYqyr5_8SU7fCKT5nylUy7ZwWSuS7rCM71ayJ2rynZG7
    *
    * */

    void operadoresRacionales(){

        int a = 5;
        int b = 7;

        //Con este operador estamos comparando dos variables
        //el valor a es igual al valor de b?
        //el valor es almacenado en result y como es un boolean acepta true o false
        boolean result = a == b;
        boolean result2 = a != b;
        // F && V = F
        boolean result3 = (a == b) && (a != b);
        // F || V = V
        boolean result4 = (a == b) || (a != b);
    }

}
