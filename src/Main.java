import animals.ForestAnimal;
import animals.SeaAnimal;
import infrastructure.Tree;
import infrastructure.WaterVessel;

/**
 * Application main class.
 *
 * @author Karol Mickiewicz
 */
public class Main {

    public static void main(String[] args) {

        Tree maple = new Tree();
        maple.setName("Maple");

        WaterVessel lake = new WaterVessel();
        lake.setName("Lake");

        SeaAnimal fish = new SeaAnimal();
        fish.setName("Fish");
        fish.setAge(8);
        System.out.println(fish.move());
        System.out.println(fish.swim(lake));

        System.out.println("----------------");

        ForestAnimal squirrel = new ForestAnimal();
        squirrel.setName("Squirrel");
        squirrel.setAge(6);
        System.out.println(squirrel.move());
        System.out.println(squirrel.climb(maple));

    }

}
