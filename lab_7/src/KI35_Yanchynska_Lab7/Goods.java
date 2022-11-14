package KI35_Yanchynska_Lab7;
/**
 * Class Goods
 * @version 1.0
 */

public class Goods {
	int weight;
    int volume;
    String name;
    public static int number;
    /**
     * Constructor
     * @param weight
     * @param volume
     * @param name
     */
    public Goods(int weight, int volume, String name)
    {
        this.weight = weight;
        this.volume = volume;
        this.name = name;
        if (weight % 2 == 1) number++;
    }
    /**
     * Method returns the weight of the item
     */
    public int getWeight() {return weight;}
    /**
     * Method returns the volume of the item
     */
    public int getVolume() {return volume;}
    /**
     * Method returns the name of the item
     */
    public String getName() {return name;}
    /**
     * Method prints info
     */
    public void print()
    {
        System.out.println("Name: " + getName());
        System.out.println("Volume: " + getVolume());
        System.out.println("Weight: " + getWeight());
    }
}
