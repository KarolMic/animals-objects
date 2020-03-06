package animals;

import infrastructure.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ForestAnimalTest {

    private ForestAnimal squirrel;
    private Tree maple;

    @Before
    public void init() {
        squirrel = new ForestAnimal();
        squirrel.setName("Squirrel");
        squirrel.setAge(6);

        maple = new Tree();
        maple.setName("Maple");

    }

    @Test
    public void move() {
        assertEquals(this.squirrel.move(), "Squirrel is 6 years old and it is moving");
    }

    @Test
    public void climb() {
        assertEquals(this.squirrel.climb(maple), "Squirrel is climbing a Maple");
    }
}