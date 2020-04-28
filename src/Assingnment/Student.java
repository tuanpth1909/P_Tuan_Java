package Assingnment;

public class Student {
    private String IDStudent;
    private String Name;
    private String Address;
    private String Phone;

    public Student(String IDStudent, String name, String address, String phone) {
        this.IDStudent = IDStudent;
        Name = name;
        Address = address;
        Phone = phone;
    }

    public String getIDStudent() {
        return IDStudent;
    }

    public void setIDStudent(String IDStudent) {
        this.IDStudent = IDStudent;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    @Override
    public String toString() {
        return String.format("%-5s %-30s %-30s %-15s", IDStudent, Name, Address, Phone);
    }
}
