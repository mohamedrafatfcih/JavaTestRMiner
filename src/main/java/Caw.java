public class Caw extends Animal {

    @Override
    public void eat() {
        super.eat();
    }

    public void eat(String foodName) {
        if (foodName == "Barsim") {
            isHungry = false;
        } else {
            System.out.println("AAAAAAAH");
        }
    }
}
