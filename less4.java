public class less4 {
    
    public static void main(String args []){

        String str1 = "Я діма з міста Тернопіль";
        String str2 = "Я Діма з міста Тернопіль";

        int x = 32;
        int y = 32;

        if (str1.equals(str2)){
            System.out.println("правда");
        }
        else {
            System.out.println("неправда");
        }

        if (str1.equalsIgnoreCase(str2)){
            System.out.println("правда");
        }
        else {
            System.out.println("неправда");
        }
        if (str1.startsWith(str2)){
            System.out.println("правда");
        }
        else {
            System.out.println("неправда");
        }
        if (str1.endsWith(str2)){
            System.out.println("правда");
        }
        else {
            System.out.println("неправда");
        }
    }
}
