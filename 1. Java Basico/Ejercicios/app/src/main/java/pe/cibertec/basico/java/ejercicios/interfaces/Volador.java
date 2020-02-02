package pe.cibertec.basico.java.ejercicios.interfaces;

/*

    Escenario real:
    Entre los vehiculos creados existe un grupo que puede volar, entonces en vez de implementar ese metodo
    en la clase padre puedo crear una interface para que asi se implemente en las vehiculos que pueden volar

    Por que no implemento este metodo en la clase padre?
    - Si implemento ese metodo en la clase padre doy la posibilidad que una moto pueda volar

 */

public interface Volador {
    void volar();
}
