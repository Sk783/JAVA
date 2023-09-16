//reverse the original string word by word

public class POTD1 {
    public static String reverseWords(String str){
        String[] words = str.split(" ");
        String res = "";
        for (int i = words.length-1; i>=0; i--){
                res+=words[i]+" ";
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "Welcome to coding Ninjas";
        System.out.println(reverseWords(str));
    }
}
