import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args){
        int n = 6;
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
        for (int i = 1; i <= n; i++) {
            arr1.add(i);
        }
        System.out.println("Array1 : "+arr1);

        ArrayList<String> st = new ArrayList<>();
        st.add("Hello");
        st.add("World");

        System.out.println("Initial array list :-");
        System.out.println(st);

        st.set(1, "Sharad");    //updating the 1th Index

        System.out.println("Updated array list :-");
        System.out.println(st);
    }
}
