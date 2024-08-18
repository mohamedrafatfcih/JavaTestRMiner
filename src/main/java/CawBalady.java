public class CawBalady extends Animal implements IAnimal {

    @Override
    public void eat() {
        super.eat();
    }

    public void walk() {
        System.out.println("I'm walking");
    }

    public void eatFood(String foodName, int quantity) {
        if (isFoodQuantitySufficient(foodName, quantity)) {
            isHungry = false;
        } else {
            System.out.println("AAAAAAAH");
        }
    }
}
