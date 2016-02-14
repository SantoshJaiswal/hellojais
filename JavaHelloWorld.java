import java.io.Writer;
import java.io.FileWriter;
public class JavaHelloWorld{
        public static void main(String[] args){
                System.out.println("Java Hello World - new checkin");
                System.out.println("Hello again - with new checkin");
                Writer w = null;
                try {                   
                        String s = "/output/output.txt";
                        System.out.println(s);
                        w = new FileWriter(s);
                        w.write("hello");
                }catch (Exception e){
                }finally {
                        if (w != null){
                                try {
                                        w.close();
                                }catch(Exception e){
                                }
                        }
                }
        }
}