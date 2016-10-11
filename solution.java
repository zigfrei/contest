import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;


public class solution {

    public static void main(String[] args) throws IOException{
        StringBuilder content=new StringBuilder("");
        String proof;
        BufferedReader reader =new BufferedReader(new FileReader("d:/123.txt"));
        while ((proof=reader.readLine())!=null){
            content.append(proof);
            content.append(" ");
        }
        reader.close();
        int n;
        int m;
        int k;

        String mcontent[] =(content.toString()).split(" ");
        n=Integer.parseInt(mcontent[0]);
        m =Integer.parseInt(mcontent[1]);
        k=Integer.parseInt(mcontent[2]);
        BigInteger[][] seats=new BigInteger[n][m];

        int q;
        int w;

       try {
        for(int i=3;i<mcontent.length-1;i++){

            q=Integer.parseInt(mcontent[i])-1;
            w=Integer.parseInt(mcontent[i+1])-1;
            seats[q][w]=BigInteger.valueOf(1);
            i++;
        }}catch (Exception e){System.out.println("Na vvode");}



        int result=0;
        int result3=0;
        for(int i=0;i<n;i++){
            result=0;
            for (int j=0;j<m;j++){
                try{result++;
                if(seats[i][j]==BigInteger.valueOf(1)){
                    result=0;}
                    if(result ==2){result3++;result=1;}

                }catch (Exception e){System.out.println("Na edinkah");}

        }}
        String result2 = result3+"";

        System.out.println(result2);

        FileWriter writer = new FileWriter("d:/1234.txt",false);

        writer.write(result2 + '\n');
        writer.flush();

    }
}