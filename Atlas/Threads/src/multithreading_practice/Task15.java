import java.io.*;
public class Task15{
    private static Object FileName01;

    public static void main(String args[])
    {
        File f1;
        f1 = new File("FileName01.txt");
        //create new file FileOutputStream outfile = null;
        byte Text[] = {'I', 'L','O','V','E', 'I','N','D','I','A'};
        try
        {
            FileOutputStream outfile = new FileOutputStream(f1);
            outfile.write(Text);
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(-1);
        }
        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}

