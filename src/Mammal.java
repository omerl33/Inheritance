public class Mammal extends Animal{

    protected int kalInMilk;
    protected int countPrag;

    public Mammal(int age, String name , int kalInMilk , int countPrag) {
        super(age, name);
        this.kalInMilk = kalInMilk;
        this.countPrag = countPrag;
    }

    public int getKalInMilk(){
        return kalInMilk;
    }
    public void setKalInMilk(int kalInMilk){
        this.kalInMilk = kalInMilk;
    }
    public int getCountPrag(){
        return countPrag;
    }

    public void setCountPrag(int countPrag) {
        this.countPrag = countPrag;
    }
//    public String toString(){
//        return "Mammal [ age " + age + ", name = " + name + "kalInMilk = " + kalInMilk + "countPrag = " + countPrag + " ] ";
//    }
}
