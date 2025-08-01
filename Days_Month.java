import java.util.*;
public class Days_Month{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Entera day number:");
        n=sc.nextInt();
        int d,m;
        d=n%30;
        m=n/30;
        System.out.println("Days: "+d);
        System.out.println("Month:"+m);
    }
}