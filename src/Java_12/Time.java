package Java_12;

public class Time {
    //khai bao ten
    private int second, minute, hour;

    //tao constructor
    public Time(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    //constructor default
    public Time(){
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    //tao ham set and get
    public int getSecond(){
        return this.second;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public int getMinute(){
        return this.minute;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public int getHour(){
        return this.hour;
    }
    public void setHour(int hour){
        this.hour = hour;
    }

    //Mo ta cach hien thi cac gi tri
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //ham set alltime
    public void setTime(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time nextSecond(){
        ++second;
        if (second >= 60) {
            second = 0;
            ++minute;
            if (minute >= 60) {
                minute = 0;
                ++hour;
                        if (hour >= 24){
                            hour = 0;
                        }
            }
        }
        return this;
    }

}
