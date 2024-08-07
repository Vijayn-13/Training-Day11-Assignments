import java.io.*;
public class CopyFileContent {
    public static void main(String[] args) throws IOException {
//        BufferedReader fr=new BufferedReader(new FileReader("C:\\Users\\vijay.n\\Downloads\\source.txt"));
//        String str;
//        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\vijay.n\\Downloads\\destination.txt"));
//        try {
//            while((str = fr.readLine()) != null) {
//                bw.write(str);
//                bw.newLine();
//            }
//            fr.close();
//            bw.close();
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
        try {
            FileReader fr = new FileReader("C:\\Users\\vijay.n\\Downloads\\source.txt");
            FileWriter fw = new FileWriter("C:\\Users\\vijay.n\\Downloads\\destination.txt");
            int i;
            while((i =fr.read())!=-1){
                fw.write((char)i);
            }
            fr.close();
            fw.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
