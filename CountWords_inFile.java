import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class CountWords_inFile {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\vijay.n\\Downloads\\text_file.txt"));
            int count=0;
            String str;
            String[] arr;
            while((str=br.readLine())!=null){
                if(!str.isEmpty()) {
                    arr=str.split(" ");
                    count+=arr.length;
                }
            }
            System.out.println("Words count: "+count);
            br.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
