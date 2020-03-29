package Java_12;

public class Date {
    //khai bao cac bien instance
    private int year, month, day;

    //tao constructor
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //tao ham set and get
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getMonth(){
        return this.month;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getDay(){
        return this.day;
    }
    public void setDay(int day){
        this.day= day;
    }

    //Mo ta cac hien thi cua DD/MM/YYYY
    public String toString(){
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    //tao mot ham truyen thang ra 3 gia tri ngay thang nam
    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

}
