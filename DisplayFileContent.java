import java.io.*;
import java.io.FileReader;

public class DisplayFileContent {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vijay.n\\Downloads\\source.txt"));
            String str;
            while((str=br.readLine())!=null){
                System.out.println(str);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
