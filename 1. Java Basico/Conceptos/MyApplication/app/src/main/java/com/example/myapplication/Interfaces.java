package com.example.myapplication;

/*

    Una interfaz te permite declarar metodos y variables al igual que un abstract. Sin embargo, la principal diferencia
    es que no puedes implementarlo dentro del abstract y en el caso de las variables son estaticas.
    Solo se pueden usan los operadores public static final

 */

public class Interfaces {

    interface Interface{

        int valor = 5;

        void sumar();
        void restar();
    }

    class ImplementacionInterface implements Interface{

        @Override
        public void sumar() {
            //Al ser un valor estatico puedo acceder sin la necesidad de crear el objeto
            int valorEntero = Interface.valor;
        }

        @Override
        public void restar() {

        }
    }
}
