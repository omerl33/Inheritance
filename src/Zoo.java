import java.util.ArrayList;

public class Zoo {
    private String place;
    private int countCages;
    private boolean thereIsCafiteria;
    private ArrayList<Animal> cage = new ArrayList<>();

    public Zoo(String place , int countCages , boolean thereIsCafiteria ){
        this.place = place;
        this.countCages = countCages;
        this.thereIsCafiteria = thereIsCafiteria;
    }

    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public int getCountCages() {
        return countCages;
    }
    public void setCountCages(int countCages) {
        this.countCages = countCages;
    }
    public boolean isThereIsCafiteria() {
        return thereIsCafiteria;
    }
    public void setThereIsCafiteria(boolean thereIsCafiteria) {
        this.thereIsCafiteria = thereIsCafiteria;
    }

    public void addAnimel(Animal animal){
        cage.add(animal);
    }
    public void printNameAnimal(){
        for (Animal animalTmp : cage){
            System.out.println(animalTmp.name);
        }

    }
    public void makeSound(){
        for (Animal animalTmp : cage){
            if ( animalTmp instanceof Mammal){
                System.out.println(((Mammal) animalTmp).makeSound());
            }
        }
    }

    public static void main(String[] args) {
        Cow cow2 = new Cow(1 , "gal" , 3, 45 ,3);
        Hipo hipo = new Hipo(2 , "tamar" , 5 , 6, 7);
        Bird bird = new Bird(3 , "adi" , 3 , 2);
        Zoo zoo1 = new Zoo("holon", 4 , true);
        zoo1.addAnimel(new Cow(1 , "omer" , 3, 45 ,3));
        zoo1.addAnimel(cow2);
        zoo1.addAnimel(hipo);
        zoo1.addAnimel(bird);

//        zoo1.printNameAnimal();
        zoo1.makeSound();
    }
}
