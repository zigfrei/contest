import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;


public class solution {
  /*  public static void bubble(int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}*/

    public static void main(String[] args) throws IOException{
        String content="";
        String proof;
        BufferedReader reader =new BufferedReader(new FileReader("input.txt"));
        while ((proof=reader.readLine())!=null){
            content+=proof +" ";
        }
        reader.close();
        int n;


        String mcontent[] =content.split(" ");
        n=Integer.parseInt(mcontent[0]);
        int k[]=new int[n];
        for(int i=1;i<mcontent.length;i++){

            k[i-1]=Integer.parseInt(mcontent[i]);
        }
        Arrays.sort(k);
        String result=""+k[0];
        for(int i=1;i<k.length;i++) {
            result = result+" " +k[i];
        }

        FileWriter writer = new FileWriter("output.txt",false);

        writer.write(result + '\n');
        writer.flush();

    }
}