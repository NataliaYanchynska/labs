package KI35_Yanchynska_Lab7;
/**
 * Class Pencil
 * @version 1.0
 */

public class Pencil extends Goods {
	int weight, volume;
    String name;
    /**
     * Constructor
     * @param weight
     * @param volume
     * @param name
     */
    public Pencil(int weight, int volume, String name)
    {
        super(weight, volume, name);

        this.weight = weight;
        this.volume = volume;
        this.name = name;

    }
}
