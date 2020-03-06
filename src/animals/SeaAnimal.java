package animals;

import actions.Swim;
import infrastructure.WaterVessel;

/**
 * SeaAnimal class. It overrides method move() and it contains new method swim(WaterVessel waterVessel).
 *
 * @author Karol Mickiewicz
 */
public class SeaAnimal extends Animal implements Swim {

    @Override
    public String move() {
        return this.getName() + " is " + this.getAge() + " years old and it is moving";
    }

    public String swim(WaterVessel waterVessel) {
        return this.getName() + " is swimming in the " + waterVessel.getName();
    }
}
