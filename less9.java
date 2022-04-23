import java.util.StringTokenizer;

public class less9 {

    public static void  main(String args[]){

        String str = "Good news everyone!";

        StringTokenizer tokenizer = new StringTokenizer(str,"new");
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
