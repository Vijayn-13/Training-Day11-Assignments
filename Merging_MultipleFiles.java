import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class Merging_MultipleFiles {
    public static void main(String[] args){
        try{
            List<String> ls=new ArrayList<>();
            ls.add("text1.txt");
            ls.add("text2.txt");
            ls.add("text3.txt");
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\vijay.n\\Downloads\\merged_feedback.txt"));
            while(!ls.isEmpty()){
                BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\vijay.n\\Downloads\\"+ls.get(0)));
                String str;
                while((str=br.readLine())!=null){
                    bw.write(str);
                    bw.newLine();
                }
                ls.remove(0);
                br.close();
            }
            bw.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
