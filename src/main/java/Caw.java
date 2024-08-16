public class Caw extends Animal implements IAnimal {

    @Override
    public void eat() {
        super.eat();
    }

    public void walk() {
        System.out.println("I'm walking");
    }

    public void eat(String foodName) {
        if (foodName == "Barsim") {
            isHungry = false;
        } else {
            System.out.println("AAAAAAAH");
        }
    }
}
