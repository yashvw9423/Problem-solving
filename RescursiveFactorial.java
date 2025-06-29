public class RescursiveFactorial {

    static int recur(int n) {
        if(n==1){
            return 1;
        }else{
            return n * recur(n-1);
        }
    }

    public static void main(String[] args) {
        int result = recur(5);
        System.out.println(result);
    }
    
}
