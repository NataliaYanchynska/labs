package lab_6;
import java.io.*;
import java.util.*;

public class CalcWFio {
    public void writeResTxt(String fName) throws FileNotFoundException
    {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ",result);
        f.close();
    }
    public void readResTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    public void writeResBin(String fName) throws FileNotFoundException, IOException
    {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();

    }
    public void readResBin(String fName) throws FileNotFoundException, IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }
    
    public void writeResFile(String fName) throws FileNotFoundException, IOException
    {
    	RandomAccessFile raf = new RandomAccessFile("result2.txt", "rw");
    	raf.writeBytes("hhnhjj");
    	raf.close();
    	
    }
    
    public void calculate(double x)
    {
    	double rad = x * Math.PI / 180.0;
        result = 1 / Math.sin(rad);
    		
    }
    public double getResult()
    {
        return result;
    }
    private double result;
}
