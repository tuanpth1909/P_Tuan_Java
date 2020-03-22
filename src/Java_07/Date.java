package Java_07;

public class Date {
    //the private instance variable
    private int year, month, day;

    //the contructors
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //the public getters/setters for the private variable
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public void setMonth(int month){
        this.year = year;
    }
    public void setYear(int year){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }

    //Return "MM/DD/YYYY" with leading zero for MM and DD
    public String toString(){
        return String.format("%02d/%02d/%4d", month, day, year);
    }
    //Set year, month and day - No input validation
    public void setDate(int yaer, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
