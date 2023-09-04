public class palindrome {
    public static void main(String[] args){
        int num = 18481;
        int temp = num;   //copied number in temp var
        int revNum = 0;
        while (num>0){
            int lastDigit = num%10;
            num = num/10;
            revNum = (revNum*10)+lastDigit;
        }
        System.out.println(revNum);
        //check if palindrome or not
        if (temp==revNum){    
            System.out.println("Palindrome");
        }
        else{
            System.out.println("notPalindrome");
        }
    }
}
