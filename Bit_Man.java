import java.util.*;
public class Bit_Man{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Get Bit
        int n1=5;
        int pos1=2;
        int bm1 = 1<<pos1;
        if((bm1 & n1)==0){
            System.out.println("Bit is zero");
        }
        else{
            System.out.println("Bit is one");
        }

        //Set Bit
        int n2=5;
        int pos2=1;
        int bm2= 1<<pos2;
        int newNumber= bm2 | n2;
        System.out.println(newNumber);

        //Clear Bit
        int n3=5;
        int pos3=2;
        int bm3= 1<<pos3;
        int notnewNumber = ~(bm3);
        int newNumber1= notnewNumber & n3;
        System.out.println(newNumber1);

        //update bit
        System.out.println("Enter operation - 0 or 1");
        //operation 1 : set :::: 0 : clear
        int op =sc.nextInt();
        int n4=5;
        int pos4=1;
        int bm4= 1<<pos4;
        if(op==0){
            // operation 0 : clear bit
            int notnewNumber1 = ~(bm4);
            int newNumber2= notnewNumber1 & n4;
            System.out.println(newNumber2);
        }
        else{
            //operation 1 : set bit
            int newNumber3= bm4 | n4;
            System.out.println(newNumber3);
        }
    }
}