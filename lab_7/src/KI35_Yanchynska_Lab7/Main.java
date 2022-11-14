package KI35_Yanchynska_Lab7;
/**
 * Class Main
 * @version 1.0
 */
public class Main {
	/**
     * @param args
     */
    public static void main(String[] args)
    {
        try{
        	StorageOfGoods storage = new StorageOfGoods();
        	storage.put(new Book(101, 100, "Book1"));
        	storage.put(new Book(201, 300, "Book2"));
        	storage.put(new Pencil(10, 8, "Pencil1"));
        	storage.put(new Pencil(11, 8, "Pencil1"));
        	storage.put(new Pencil(10, 8, "Pencil1"));
        	System.out.println("Number = " +Goods.number);
            /*StorageOfGoods books = new StorageOfGoods();

            books.put(new Book(100, 100, "Book1"));
            books.put(new Book(150, 140, "Book2"));
            books.put(new Book(220, 90, "Book3"));

            System.out.println(books.get(1).getName());

            System.out.println(books.getHeaviestItem().getName());

            System.out.println(books.getWeight());

            books.showAll();

            StorageOfGoods pencils = new StorageOfGoods();

            pencils.put(new Pencil(10, 8, "Pencil1"));
            pencils.put(new Pencil(5, 4, "Pencil2"));
            pencils.put(new Pencil(8, 9, "Pencil3"));

            System.out.println(pencils.getHeaviestItem().getName());

            System.out.println(pencils.getWeight());

            pencils.showAll();*/
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
