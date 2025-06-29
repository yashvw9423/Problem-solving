public class SumOfNo {
    
    public static void main(String[] args) {
        int n = 123;
        int i = 0;
        int j = 0;
        int k = n;
        int sum = 0;

        while(n!=0) {
            i = n % 10; // 3, 2, 1
            sum = sum + i;
            n = n/10;
        }

        System.out.println("Sum of Number is " + sum);
    }

} 