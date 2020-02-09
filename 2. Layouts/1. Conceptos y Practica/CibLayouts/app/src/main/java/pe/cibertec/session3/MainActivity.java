package pe.cibertec.session3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
/*

    Los layouts son elementos no visuales que permite controlar la distribucion posiciones y dimensiones de los controles.
    ViewGroup -> contenedores, los layouts extienden de estos
        Un vista que puede contener a otras vistas

        Framelayout: es el mas sencillo de todos los layouts, cuando se agregan multiples hijos alineados en la esquina superior izquierda
                    suele utilizarse con unico controlador en su interior para que pueda ser sustituible

            layout_gravity: permite que el hijo puede centrar ya sea vertical u horizontal

        Linearlayout: Este layout puede convertirse en una fila o columna (horizontal o vertical)

            layout_weight: permite ocupar el espacio disponible

        RelativeLayout: Este layout esta enfocado principal en posicionar los hijos en diferentes ubicaciones en vista y que entre ellos se ordenen

            layout_above / layout_below
            layout_alignLeft / top / right / bottom
            exampl
            layout_alignParentLeft / * / * / *
            layout_toLeftOf / * / * / * / *
            layout_alignBaseLine
            layout_centerInParent

        AbsoluteLayout : NO! , ESTA DEPRECADO


 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Descomentar solo para el example_6, si usan otro archivo con estas lineas de texto saldra error
        //por que no encontra el elemento
        //

        /*Spinner spinner = findViewById(R.id.sp_example);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);*/

        /*RatingBar ratingBar = findViewById(R.id.rtb_example);
        ratingBar.setNumStars(10);
        ratingBar.setRating(5.5f);*/

    }
}
