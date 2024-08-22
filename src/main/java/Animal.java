public class Animal {
    boolean isHungry = false;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        if (isHungry) {
            System.out.println("Eating");
            this.isHungry = true;
        }
    }
}
