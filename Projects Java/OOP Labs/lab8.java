import java.io.*;
import java.util.Scanner;


public class ex1
{
    private String string;
    private Scanner scanner;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your information:");

        String string = scanner.nextLine();

        try (FileWriter writer = new FileWriter("D:\\Projects Java\\OOPlab8\\note1.txt", true))
        {
            writer.write(string);
            writer.append("\n");
            writer.flush();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }



        try (FileReader reader = new FileReader("D:\\Projects Java\\OOPlab8\\note1.txt"))
        {
            int c;
            while ((c = reader.read()) != -1)
            {
                System.out.print((char)c);
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
