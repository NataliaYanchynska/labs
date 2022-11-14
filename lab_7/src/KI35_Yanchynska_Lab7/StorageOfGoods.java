package KI35_Yanchynska_Lab7;
import java.util.*;
/**
 * Class StorageOfGoods
 * @version 1.0
 */

public class StorageOfGoods <T extends Goods>  {
	ArrayList<T> storage = new ArrayList<>();
    /**
     * Method returns an item by the index
     * @param index
     * @throws Exception
     */
    public T get(int index)
    {
        try{
            return storage.get(index);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    /**
     * Method puts an item
     * @param item
     */
    public void put(T item)
    {
        try {
            storage.add(item);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    /**
     * Method shows storage content
     */
    public void showAll()
    {
        for(int i = 0; i < storage.size(); i++)
        {
            try{
                storage.get(i).print();
                System.out.println("=====================");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    /**
     * Method shuffles the content
     */
    public void shake()
    {
        Collections.shuffle(storage);
    }
    /**
     * Method returns total content weight
     */
    public int getWeight()
    {
        int result = 0;

        for(int i = 0; i < storage.size(); i++)
        {
            result += storage.get(i).getWeight();
        }

        return result;
    }
    /**
     * Method returns the heaviest item
     */
    public T getHeaviestItem()
    {
        int heaviestIdx = 0;

        for(int i = 0; i < storage.size(); i++)
        {
            if(i == 0)
            {
                continue;
            }

            if(storage.get(i).getWeight() > storage.get(heaviestIdx).getWeight())
            {
                heaviestIdx = i;
            }
        }


        return storage.get(heaviestIdx);
    }
}
