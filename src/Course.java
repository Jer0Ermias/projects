import java.util.*;
public class Course {
    private String prefix;
    private int number;
    private String title;

    public Course(String prefix, int number, String title) {
        this.prefix = prefix;
        this.number = number;
        this.title = title;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return null;
    }
}
