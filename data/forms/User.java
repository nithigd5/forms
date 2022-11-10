package data.forms;

//Stores Users input data
public class User{
    public String name;
    public String dob;
    public float height;
    public int age;
    public boolean isverified;
    public char sex;


    public User(){

    }


    public User(String name, int age, char sex, float height, String dob){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.dob = dob; 
    }

}
