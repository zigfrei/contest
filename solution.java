import java.io.*;


public class solution {
    public static void main(String[] args) throws IOException{
        String content="";
        String proof;
        BufferedReader reader =new BufferedReader(new FileReader("input.txt"));
        while ((proof=reader.readLine())!=null){
            content+=proof +" ";
        }

        reader.close();
        long summa=0;
        String mcontent[] =content.split(" ");
        for(int i=0;i<mcontent.length;i++){
            summa+=Long.parseLong(mcontent[i]);
        }
        String sum = summa/mcontent.length+"";
        FileWriter writer = new FileWriter("output.txt",false);
        writer.write(sum + '\n');
        writer.flush();

    }
}