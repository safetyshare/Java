package project.bean;

public class Student {
    private String sid;
    private String sname;
    private String sclass;
    private String address;
    private String teleNumber;
    private String QQ;

    public Student(String sid, String sname, String sclass, String address, String teleNumber, String QQ) {
        this.sid = sid;
        this.sname = sname;
        this.sclass = sclass;
        this.address = address;
        this.teleNumber = teleNumber;
        this.QQ = QQ;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeleNumber() {
        return teleNumber;
    }

    public void setTeleNumber(String teleNumber) {
        this.teleNumber = teleNumber;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }
}
