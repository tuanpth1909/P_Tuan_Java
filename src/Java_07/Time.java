package Java_07;

public class Time {
    private int second, minute, hour;
    //Test contructors
    public Time(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    public Time(){
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    //Test setters and Getters
    public int getSecond(){
        return this.second;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getHour(){
        return this.hour;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    //Return "hh:mm:ss" with leading zeros.
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //Set second, minute and hour
    public void setTime(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    //Increment this instanse by one second, and return this instace.
    public Time nextSecond(){
        ++second;
        if(second >= 60){
            second = 0;
            ++minute;
            if (minute >= 60){
                minute = 0;
                ++hour;
                if(hour >= 24){

                }
            }
        }
        return this;
    }

}
