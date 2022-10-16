package KI35.Yanchynska.Lab4;
/**
 * @author Yanchynska Natalia
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
            int START_TEMP = 43;
            System.out.println("Temperature: " + START_TEMP);

            ClimateControl conditioner = new ClimateControl(START_TEMP, 70);

            conditioner.turnOn(35, 10);

            System.out.println("Filter pollution: " + conditioner.getFilterPollution());

            conditioner.cleanFilter();

            System.out.println("Temperature: " + conditioner.getTemp());

            conditioner.changeHumidity(80, 10);

            conditioner.dispose();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}

