//Class

public class User {
    //Field (attributes)
    public String name;
    public Integer age;

    public User(String name) {
        this.name = name;
    }

    //Methods
    public void sayHello() {
        System.out.println("Hi, my name is " + name + "i am " + age + "years old");
    }
}
