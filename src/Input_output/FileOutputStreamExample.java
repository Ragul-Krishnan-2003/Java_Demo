package Input_output;
import java.io.FileOutputStream;
public class FileOutputStreamExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("D:\\leo.txt");
            fos.write(75);
            fos.close();
            System.out.println("sucess....");
        }catch (Exception e){System.out.println(e);}
    }
}
