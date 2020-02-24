package pe.cibertec.parcialproject.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    static SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");

    static Date currentDate(String date){
        try {
            return formatter1.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
