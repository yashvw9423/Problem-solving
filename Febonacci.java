public class Febonacci {
    public static void main(String[] args) {
        int n=20;
        int t=0;
        int l=1;
        int k;
        for(int i=1; i<=n; i++) {
            k=t+l;
            t=l;
            l=k;
            System.out.println(k);
        }
    }
    
}
