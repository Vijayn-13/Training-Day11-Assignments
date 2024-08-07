import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class SummaryReport {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\vijay.n\\Downloads\\logs.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\vijay.n\\Downloads\\log_summary.txt"));
            Map<String,Integer> mp=new HashMap<>();
            String str;
            String[] arr;
            while((str= br.readLine())!=null){
                arr=str.split(",");
                mp.put(arr[1],mp.getOrDefault(arr[1],0)+1);
            }
            bw.write("Summary Report:-");
            bw.newLine();
            for(Map.Entry<String,Integer> m:mp.entrySet()){
                bw.write(m.getKey()+" logs count: "+m.getValue());
                bw.newLine();
            }
            br.close();
            bw.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
