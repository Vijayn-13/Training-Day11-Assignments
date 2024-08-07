import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class LargeData_FileProcessing {
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter threshold amount: ");
            int amount=sc.nextInt();
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\vijay.n\\Downloads\\transactions.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\vijay.n\\Downloads\\filtered_transactions.txt"));
            String str;
            String[] arr;
            while((str=br.readLine())!=null){
                arr=str.split(",");
                if(Integer.valueOf(arr[2])>amount){
                    bw.write(str);
                    bw.newLine();
                }
            }
            br.close();
            bw.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
