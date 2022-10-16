package lab_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
/*** Клас Lab2 реалізує приклад програми до лабораторної роботи №2
 * @author Yanchynska Natalia
 * @version 1.0
 * @since version 1.0
 */

public class Lab2YanchynskaKI35 {
	private final static String file = "text.txt";
    /**
     * Статичний метод main є точкою входу в програму
     * @param args
     * @throws FileNotFoundException у випадку відстуності файлу за вказаною адресою.
     */
    public static void main(String[] args) throws FileNotFoundException {
    	Scanner scan = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(new File(file));
        System.out.print("Введіть розмір квадратної матриці: ");
        int size = scan.nextInt();
        System.out.print("Введіть символ заповнювач: ");
        char character = getPlaceholderCharacter();
        int half = size / 2;
        char[][] arr = new char[size][half];
        
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < half) arr[i][j] = character;
                if (i < half && j >= half || i >= half && j < half)
                    builder.append(String.format("%c\t", character));
                else
                    builder.append(" \t");
            }
            builder.append("\n");
        }

        writer.write(builder.toString());
        System.out.println(builder);
        System.out.println(Arrays.deepToString(arr));
        writer.close();
        scan.close();
    }

    private static char getPlaceholderCharacter() {
        Scanner scan = new Scanner(System.in);
        String character = scan.nextLine();
        if (character.length() != 1) {
            throw new IllegalArgumentException("Введіть один символ заповнювач");
        }
        return character.charAt(0);
    }
}









