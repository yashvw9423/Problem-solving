public class Palindrome {
    public static void main(String[] args) {
        int n = 121; 
        int l = 0;
        int s = n;
        while (n!=0) {
            int p = n%10; //1
            l = (l * 10) + p;
            n=n/10;
        }

        if(s==l){
            System.out.println(s + " No is palindrome");
        }else{
            System.out.println(s + " Is not a palindrome");
        }   
    }
}
