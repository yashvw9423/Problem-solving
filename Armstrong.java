public class Armstrong {
    public static void main(String[] args) {

        //153
        //1^3 + 5^3 + 3^3 = 153
        //1 + 125 + 27 = 153

        int a = 9474;
        int k = 0;
        int digits = 0;
        int t = a;
        int l = 0;

        while (t!= 0){
            t = t/10;
            digits = digits + 1;
        }

        t = a;
        while (t!= 0){
            l = t % 10;
            k = k + (int) Math.pow(l, digits);
            t = t/10;
        }

        if (k == a){
            System.out.println(a + " Number is Armstrong");
        }else{
            System.out.println(a + " Number is not Armstrong");
        }

    }
}