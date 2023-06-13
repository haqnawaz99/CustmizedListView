package haqnawaz.org.customizedlistview;

public class Student {
    private String name;
    private String campus;
    private String rollNumber;
    private int imageID;

    public Student(String name, String campus, String rollNumber, int imageID) {
        this.name = name;
        this.campus = campus;
        this.rollNumber = rollNumber;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

}