import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int minimumMoves(String s, int d) 
    {
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        int g=0;
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)!='1')
            {
              count++; 
            }
            if(sb.charAt(i)=='1')
            {
                count=0;
            }
            if(count==d)
            {
               
                count=0;
                g++;
            }
            
        }
        return g;
        
   
    }

}

public class valid_binary_string {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int d = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.minimumMoves(s, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}