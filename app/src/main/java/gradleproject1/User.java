package gradleproject1;

import java.util.List;

public class User {

    private String id;
    private String fname;
    private String lname;
    private String address;

    public User(String id, String fname, String lname, String address) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFname() {
        return this.fname;
    }

    public String getLname() {
        return this.lname;
    }

    public String getAddress() {
        return this.address;
    }

    public String getID() {
        return this.id;
    }

}
