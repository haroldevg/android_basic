package pe.cibertec.listviewexample.models;

public class Student {

    private String name;
    private String description;
    private String address;
    private int grade;
    private int imageUrl;

    public Student(String name, String description, String address, int grade,int imageUrl) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.grade = grade;
        this.imageUrl = imageUrl;
    }
    public Student(String name, String description, String address, int grade) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.grade = grade;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public int getGrade() {
        return grade;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
