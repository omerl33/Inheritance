public class Reptile extends Animal{
    protected int tailLength;
    public Reptile(int age , String name , int tailLength){
        super(age , name);
        this.tailLength = tailLength;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }
//    public String toString(){
//        return "Reptile [ age " + age + ", name = " + name + "tailLength = " + tailLength + " ] ";
//    }
}
