package Models;

public class Child {
    private int cprNrID;
    private int dateOfEntry;
    private String childFirstName;
    private String childLastName;
    private String location;
    private String childrenInfo;

    public Child() {
    }

    public Child(int cprNrID, int dateOfEntry, String childFirstName, String childLastName, String location, String childrenInfo) {
        this.cprNrID = cprNrID;
        this.dateOfEntry = dateOfEntry;
        this.childFirstName = childFirstName;
        this.childLastName = childLastName;
        this.location = location;
        this.childrenInfo = childrenInfo;
    }

    public int getCprNrID() {
        return cprNrID;
    }

    public void setCprNrID(int cprNrID) {
        this.cprNrID = cprNrID;
    }

    public int getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(int dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public String getChildFirstName() {
        return childFirstName;
    }

    public void setChildFirstName(String childFirstName) {
        this.childFirstName = childFirstName;
    }

    public String getChildLastName() {
        return childLastName;
    }

    public void setChildLastName(String childLastName) {
        this.childLastName = childLastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getChildrenInfo() {
        return childrenInfo;
    }

    public void setChildrenInfo(String childrenInfo) {
        this.childrenInfo = childrenInfo;
    }
}
