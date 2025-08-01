public class String_Build{
    public static void main(String []args){
        StringBuilder sb = new StringBuilder("Tanka");
        System.out.println(sb);

        sb.setCharAt(0,'S');
        System.out.println(sb);
    }
}