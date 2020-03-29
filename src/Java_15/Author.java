package Java_15;

public class Author {
    //Tao bien cho class Author
    private String name;
    private String email;
    private char gender;

    //Tao constructor
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //tao ham set and get
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public char getGender(){
        return this.gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    //Mota
    public String toString(){
        return String.format("Name:" + name + "Email:" + email + "Gender:" + gender);
    }


}
