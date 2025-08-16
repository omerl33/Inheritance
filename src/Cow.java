public class Cow extends Mammal{
    private int countHamlatot;
    public Cow(int age, String name, int kalInMilk, int countPrag , int countHamlatot) {
        super(age, name, kalInMilk, countPrag);
        this.countHamlatot = countHamlatot;
    }

    public int getCountHamlatot() {
        return countHamlatot;
    }
    public void setCountHamlatot(int countHamlatot) {
        this.countHamlatot = countHamlatot;
    }

    public String makeSound(){
        return super.makeSound() + " Mooo";
    }

}
