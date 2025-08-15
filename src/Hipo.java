public class Hipo extends Mammal{
    private int precentSoman;
    public Hipo(int age, String name, int kalInMilk, int countPrag , int precentSoman) {
        super(age, name, kalInMilk, countPrag);
        this.precentSoman = precentSoman;
    }

    public int getPrecentSoman() {
        return precentSoman;
    }

    public void setPrecentSoman(int precentSoman) {
        this.precentSoman = precentSoman;
    }
}
