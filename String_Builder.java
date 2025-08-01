public class String_Build{
    public static void main(String []args){
        StringBuilder sb = new StringBuilder("Tanka");
        System.out.println(sb);//prints StringBuilder String

        System.out.println(sb.charAt(0));//prints char at 0th index

        sb.setCharAt(0,'S');//set char at 0th Position
        //Tanka ---> Sanka
        System.out.println(sb);

        sb.insert(0,'P'); //insert char at 0th Position 
        //Sanka --->  PSanka
        System.out.println(sb);

        sb.delete(2,4);
        System.out.println(sb);
    }
}