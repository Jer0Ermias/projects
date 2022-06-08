import java.util.*;
public class Record {
    private Date date;
    private Student student;
    private Course course;
    private float grade;

    public Record(Date date, Student student, Course course, float grade){
        this.course = course;
        this.date = date;
        this.grade = grade;
        this.student = student;
    }
    //where is Date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
