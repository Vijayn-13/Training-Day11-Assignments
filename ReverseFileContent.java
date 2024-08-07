import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class ReverseFileContent {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\vijay.n\\Downloads\\input.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\vijay.n\\Downloads\\reversed.txt"));
            String str;
            StringBuilder reverse_str;
            while((str=br.readLine())!=null){
                reverse_str=new StringBuilder(str);
                reverse_str.reverse();
                str=new String(reverse_str);
                bw.write(str);
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
