import java.util.*;
class Bubble_Sort{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number or array elements");
        int n=sc.nextInt();
        int m[]=new int[n];
        int i,j,t;
        System.out.println("Enter array elements"); //input elements
        for (i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        //bubble sorting
        for(i=0;i<n-1;i++){
            for (j=0;j<(n-1-i);j++){
                if(m[j]>m[j+1]){
                    t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                }
            }
        }
        System.out.println("Numbers after asending sort are :");
        for(i=0;i<n;i++){
            System.out.println(m[i]);
        }
    }
}