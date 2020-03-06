package animals;

import infrastructure.WaterVessel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeaAnimalTest {

    private SeaAnimal fish;
    private WaterVessel lake;

    @Before
    public void init() {
        fish = new SeaAnimal();
        fish.setName("Fish");
        fish.setAge(8);

        lake = new WaterVessel();
        lake.setName("Lake");

    }

    @Test
    public void move() {
        assertEquals(this.fish.move(), "Fish is 8 years old and it is moving");
    }

    @Test
    public void swim() {
        assertEquals(this.fish.swim(lake), "Fish is swimming in the Lake");
    }

}