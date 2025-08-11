import java.util.*;
public class Matrix_Ind{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c,x;
        int i,j;
        System.out.println("Enter Rows:");
        r=sc.nextInt(); // entering numbers of rows
        System.out.println("Enter Columns:");
        c=sc.nextInt(); // entering numbers of columns
        int mat[][]=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                // rows x columns
                System.out.println("Enter element at indices "+i+" "+j);
                mat[i][j]=sc.nextInt();
            }
        }
    
        System.out.println("Enter number to search");
        x=sc.nextInt(); // number to search in matrix
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                // to search mat[i][j]==x or not 
                if(mat[i][j]==x){
                    System.out.println(x+" is present at indices : "+i+" "+j);
                }
            }
        }
    }
}