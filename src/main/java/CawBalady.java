public class CawBalady extends Animal implements IAnimal {

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
