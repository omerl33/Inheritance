public class Bird extends Animal{
    protected int heightFly;
    protected int wingsLength;
    public Bird(int age, String name , int heightFly , int wingsLength) {
        super(age, name);
        this.heightFly = heightFly;
        this.wingsLength = wingsLength;
    }

    public int getHeightFly() {
        return heightFly;
    }

    public void setHeightFly(int heightFly) {
        this.heightFly = heightFly;
    }

    public int getWingsLength() {
        return wingsLength;
    }

    public void setWingsLength(int wingsLength) {
        this.wingsLength = wingsLength;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
