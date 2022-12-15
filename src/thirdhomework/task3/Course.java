package thirdhomework.task3;

import java.util.Date;

public class Course {
    private java.util.Date startDate = new java.util.Date();
    private String name;
    private int hoursDuration;
    private String teacherName;

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Course (java.util.Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course (int hoursDuration, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }
}
