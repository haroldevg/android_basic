package pe.haroldev.tabexample.models;

public class Task {

    private String course;
    private String courseType;
    private String date;
    private String time;
    private String timeout;
    private String color;

    public Task(String course,String courseType,String date,String time,String timeout,String color){
        this.course = course;
        this.courseType = courseType;
        this.date = date;
        this.time = time;
        this.timeout = timeout;
        this.color = color;
    }

    public String getCourse() {
        return course;
    }

    public String getCourseType() {
        return courseType;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getTimeout() {
        return timeout;
    }

    public String getHurryTimeout() {
        return timeout+" left!";
    }

    public String getColor() {
        return color;
    }

    public static final Task[] LISTA ={
            new Task("CS-101 Python","Data Structures","03/03/2020","45 minutos","1 day","#e74c3c"),
            new Task("CS-101 Android","Data Structures","04/03/2020","45 minutos","1 day","#e74c3c"),
            new Task("CS-101 iOS","Data Structures","05/03/2020","45 minutos","1 day","#e74c3c"),
            new Task("CS-101 Java","Data Structures","06/03/2020","45 minutos","1 day","#00a2d3"),
            new Task("CS-101 Angular","Data Structures","07/03/2020","45 minutos","1 day","#00a2d3"),
            new Task("CS-101 .NET","Data Structures","08/03/2020","45 minutos","1 day","#00a2d3"),
            new Task("CS-101 Go","Data Structures","09/03/2020","45 minutos","1 day","#00a2d3"),
    };
}
