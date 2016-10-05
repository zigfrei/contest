import java.io.*;

/**
 * Created by User on 05.10.2016.
 */
public class solution {
    public static void main(String[] args) throws IOException{
        String content="";
        String proof;
        BufferedReader reader =new BufferedReader(new FileReader("input.txt"));
        while ((proof=reader.readLine())!=null){
            content+=proof;
        }
        reader.close();
        String mcontent[] =content.split(" ");
        int sum =Integer.parseInt(mcontent[0]) +Integer.parseInt(mcontent[1]);
        OutputStream outStr =new FileOutputStream("output.txt");
        outStr.write((sum + System.lineSeparator()).getBytes());
        outStr.close();

    }
}
