package pe.cibertec.parcialproject.models;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task {

    private String title;
    private String description;
    private Boolean selected;
    private Date date;

    public Task(String title, String description, Boolean selected, Date date) {
        this.title = title;
        this.description = description;
        this.selected = selected;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getSelected() {
        return selected;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime(){
        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        return format.format(date);
    }
    public String getHumanDate(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(date);
    }
}
