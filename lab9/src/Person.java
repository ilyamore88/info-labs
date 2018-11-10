import java.util.Calendar;

public class Person {
    private String lastname;
    private String firstname;
    private String middlename;
    private Calendar birthday;

    public String getFIO() {
        return (this.lastname + " " + this.firstname.charAt(0) + "." + this.middlename.charAt(0) + ".");
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }
}
