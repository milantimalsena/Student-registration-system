import java.util.ArrayList;

public class Student {
private int id;
private String name;
private String gender;
String contact;
private ArrayList <String> interest;
private String course;
private double fee;
private String reason;

public Student(int id, String name , String contact , ArrayList<String> interest,String course, String fee2, String reason){

this.id=id;
this.name=name;
this.contact=contact;
this.interest=interest;
this.course=course;
this.fee=fee;
this.gender=gender;
this.reason=reason;



}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName(){
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getContact(){
    return contact;
}

public void setContact(String contact) {
    this.contact = contact;
}
public ArrayList<String> getInterest() {
    return interest;
}
public void setInterest(ArrayList<String> interest) {
    this.interest = interest;
}

public String getCourse() {
    return course;
}


public void setCourse(String course) {
    this.course = course;
}

public double getFee() {
    return fee;

}

public void setFee(double fee) {
    this.fee = fee;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}

public String getReason() {
    return reason;
}

public void setReason(String reason) {
    this.reason = reason;
}



}
