package com.example.myapplication;

/*
    Los metodos de acceso de los atributos de una clase son muy importantes para poder indicar que exponer o no.
    Por ejemplo si los atributos son expuestos como public cualquier pueda modificarlos

    public: permite que cualquier clase o instancia puede acceder a sus atributos (por defecto son public)
    protected: sus atributos solo pueden ser accedidos por las subclases(hijas)
    private: sus atributos solo pueden ser accedidos por la misma clase

    https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRCzWcAUVpurndLhU4TNKNp1huqLhBBh4aUF3fHTj2hh1rCuaEb

 */

public class MetodosAcceso {

    private int val = 5;
    protected int val2 = 7;
    public int val3 = 9;

}

class MetodoAcceso2{

    void testMetodoAcceso(){
        MetodosAcceso acceso = new MetodosAcceso();
        //Se enecuentra dentro de la mismo documento es por ello que puedo modificarlo
        //Si creas esta clase en otro lado no te permitira acceder a val2
        acceso.val2 = 10;
        //Con solo crear el objeto puedes modificar este atributo
        acceso.val3 = 15;
        //No se puede modificar val por que es privado, es decir solo puede ser accedido por la misma clase
        //Esta comentado para que no muestre el error
        //Puedes comentarlo si deseas probar su comportamiento
        //acceso.val = 7;
    }

}
