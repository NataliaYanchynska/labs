package KI35_Yanchynska_Lab7;
/**
 * Class Book
 * @version 1.0
 */

public class Book extends Goods {
	int weight, volume;
    String name;
    /**
     * Constructor
     * @param weight
     * @param volume
     * @param name
     */
    public Book(int weight, int volume, String name)
    {
        super(weight, volume, name);

        this.weight = weight;
        this.volume = volume;
        this.name = name;
    }
}
