import java.io.Writer;
import java.io.FileWriter;
public class JavaHelloWorld{
        public static void main(String[] args){
                System.out.println("Java Hello World - new checkin,eclipse");
                System.out.println("Hello again - with new checkin,eclipse");
                Calculator calc = new Calculator();
                System.out.println("The value after adding two numbers 2,3 is " + calc.add(2, 3));
                Writer w = null;
                try {                   
                        String s = "output.txt,eclipse";
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