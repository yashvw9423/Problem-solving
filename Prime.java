public class Prime {
    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        for (int i=2; i<num; i++) {
            if(num%i==0){
                count++;
            }
        }

        if(num<2){
            System.out.println("Number is not prime");
        }else if(count == 0) {
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }    
}
