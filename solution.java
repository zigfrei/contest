import java.io.*;

/**
 * Created by User on 05.10.2016.
 */
public class solution {
    public static void main(String[] args) {
        String content="";
        String proof;
        try{
        BufferedReader reader =new BufferedReader(new FileReader("input.txt"));
        while ((proof=reader.readLine())!=null){
            content+=proof;
        }
        reader.close();}catch (Exception e){}
        String mcontent[] =content.split(" ");
        int sum =Integer.parseInt(mcontent[0]) +Integer.parseInt(mcontent[1]);
        try{
        OutputStream outStr =new FileOutputStream("output.txt");
        outStr.write((sum + System.lineSeparator()).getBytes());
        outStr.close();}catch (Exception e){}

    }
}
