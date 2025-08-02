public class Bit_Man{
    public static void main(String args[]){
        int n=5;
        int pos=2;
        int bm = 1<<pos;
        if((bm & n)==0){
            System.out.println("Bit is zero");
        }
        else{
            System.out.println("Bit is one");
        }
    }
}