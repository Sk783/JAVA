import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Sets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> cl = new HashSet<>();   // creating a set
        cl.add(4);   // add element
        cl.add(3);
        cl.add(2);
        cl.add(4);
        cl.add(-4);
        cl.remove(-4);  // remove element
        boolean x = cl.contains(-4);   // check if element is present in the set
        System.out.println(x);
        cl.size();
        int s = cl.size();   // checking size of the set
        System.out.println(s);
        System.out.println(cl);
    }
}