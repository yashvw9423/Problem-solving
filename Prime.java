public class Prime {
    public static void main(String[] args) {
        int num = 97;
        int count = 0;
        for (int i=2; i<Math.sqrt(num); i++) {
            if(num%i==0){
                count++;
            }
        }

        if(num<2){
            System.out.println(num + " is not prime Number");
        }else if(count == 0) {
            System.out.println(num + " is prime Number");
        }else{
            System.out.println(num + " is not prime Number");
        }
    }    
}
