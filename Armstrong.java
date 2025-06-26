public class Armstrong {
    public static void main(String[] args) {

        //153
        //1^3 + 5^3 + 3^3 = 153
        //1 + 125 + 27 = 153

        int a = 153;
        int k = 0;
        int t = a;

        while (a!=0){
            int l = a%10;
            k = k + (l*l*l);
            a = a/10;
        }
        if (t==k){
            System.out.println(a + "Number is Armstrong");
        }else{
            System.out.println(a + "Number is not Armstrong");
        }

    }
}