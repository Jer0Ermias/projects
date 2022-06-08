import java.util.*;

public class Student{
    private String firstName;
    private String lastName;
    private Address[] addresses;
    private ArrayList<Phone> phoneNumbers;
    private int gNumber;

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Phone> getPhoneNumbers() {
        return phoneNumbers;
    }



    public void setMailAddr(Address addresses){

    }

    public void setBillingAddr(Address addresses){

    }

    public void setPhoneNumbers(ArrayList<Phone> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public int getGNumber() {
        return gNumber;
    }

    public void setGNumber(int gNumber) {
        this.gNumber = gNumber;
    }
}
