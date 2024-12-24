package Input_output;
import java.io.FileInputStream;
public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("D:\\read.txt");
            int i = 0;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
