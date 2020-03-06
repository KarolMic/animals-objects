package animals;

import actions.Climb;
import infrastructure.Tree;

/**
 * ForestAnimal class. It overrides method move() and it contains new method climb(Tree tree).
 *
 * @author Karol Mickiewicz
 */
public class ForestAnimal extends Animal implements Climb {

    @Override
    public String move() {
        return this.getName() + " is " + this.getAge() + " years old and it is moving";
    }

    public String climb(Tree tree) {
        return this.getName() + " is climbing a " + tree.getName();
    }

}
