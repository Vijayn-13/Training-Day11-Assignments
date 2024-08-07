import java.io.FileWriter;
import java.util.*;
public class UserInput_toFile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter input: ");
        String str=sc.nextLine();
        try{
            FileWriter fw=new FileWriter("C:\\Users\\vijay.n\\Downloads\\user_input.txt");
            fw.write(str);
            fw.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
