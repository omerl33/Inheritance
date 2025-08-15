public class Animal {
    protected String name;
    protected int age ;

    public Animal(int age , String name){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "Animal [ age " + age + ", name = " + name + " ] ";
    }
}
