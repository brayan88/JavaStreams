import java.io.*;


/**
 * Created by Admin on 26.3.2016 г..
 */
public class _02_ALLCAPITALS {
    public static void main(String[] args) {
        try(
                BufferedReader reader = new BufferedReader(new FileReader("Lines.txt"));
        PrintWriter writer =new PrintWriter(new FileWriter("Lines.txt"));
        )
        {
         String str;
            String newText;
            while ((str=reader.readLine())!=null){
                writer.println(str.toUpperCase());
            }
        }
        catch (IOException ex){
            System.out.println("File not found");
        }
    }
}
