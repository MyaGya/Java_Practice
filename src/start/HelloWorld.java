package start;
import java.util.ArrayList;
public class HelloWorld {

    public static void main(String[] args) {
        String[] collection = {"월", "화", "수"};
        for(int i=0; i < collection.length; i++) {
            System.out.println(collection[i]);
        }
        String s = "tmp";
        System.out.println(s.charAt(s.length()-1));

    }
}
