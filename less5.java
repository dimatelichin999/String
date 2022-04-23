import java.util.Scanner;

public class less5 {

    public static void main(String args[]){

        String str1 = "Я діма з міста Тернопіль";


        int index   = str1.indexOf("діма");
       System.out.println(index);

       Scanner in = new Scanner(System.in);
       String s = in.nextLine();

       int index2 = s.indexOf("діма");
       System.out.println(index2);



    }
}

