package pe.cibertec.parcialproject.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pe.cibertec.parcialproject.models.Task;

public interface MockData {

    List<Task> task = new ArrayList<Task>(Arrays.<Task>asList(
            new Task("Android Básico", "Curso de android básico en Cibertec", false, DateUtils.currentDate("29/02/2020 02:00 PM")),
            new Task("Android Intermedio", "Curso de android intermedio en Cibertec", false, DateUtils.currentDate("28/02/2020 02:00 PM")),
            new Task("Android Avanzado", "Curso de android avanzado en Cibertec", false, DateUtils.currentDate("27/02/2020 02:00 PM")),
            new Task(".NET 2012", "Curso de .NET en Cibertec", false, DateUtils.currentDate("27/02/2020 02:00 PM")),
            new Task("Frontend Angular", "Curso de angular en Cibertec", false, DateUtils.currentDate("26/02/2020 02:00 PM")),
            new Task("PHP Developer", "Curso de PHP en Cibertec", false, DateUtils.currentDate("26/02/2020 02:00 PM")),
            new Task("Vue", "Curso de Vue en Cibertec", false, DateUtils.currentDate("25/02/2020 02:00 PM")),
            new Task("Java Developer", "Curso de Java en Cibertec", false, DateUtils.currentDate("25/02/2020 02:00 PM"))
            ));
}