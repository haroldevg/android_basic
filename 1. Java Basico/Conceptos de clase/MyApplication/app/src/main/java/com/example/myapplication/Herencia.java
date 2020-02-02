package com.example.myapplication;
/*

    Herencia: La idea basica de herencia es compartir los atributos y metodos entre las demas clases.
    La clase padre que comparte sus metodos y variables es llamado superclase
    Las clases hijas que puedes utilizar los metodos y variables de la clase padre se llamada subclases

 */

public class Herencia {

    public class Person{

        String nombre;
        String apellidos;
        int edad;

        Person(String nombre,String apellidos,int edad) {
            this.apellidos = apellidos;
            this.nombre = nombre;
            this.edad = edad;
        }

        void caminar(){

        }

        void saludar(){

        }

        void saltar(){

        }

    }

    public class Profesor extends Person {

        Profesor(String nombre, String apellidos, int edad) {
            super(nombre, apellidos, edad);
        }

        @Override
        void caminar() {
            super.caminar();
        }

        @Override
        void saltar() {
            super.saltar();
        }

        @Override
        void saludar() {
            super.saludar();
        }
    }

    public class Alumno extends Person {

        Alumno(String nombre, String apellidos, int edad) {
            super(nombre, apellidos, edad);
        }

        @Override
        void saltar() {
            super.saltar();
        }

        @Override
        void saludar() {
            super.saludar();
        }

        @Override
        void caminar() {
            super.caminar();
        }
    }

}
