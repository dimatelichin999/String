public class less11 {

    public static void main(String args[]){

            String str = "Hello";
            toGetResult1(str);
            toGetResult2(str);
            toGetResult3(str);
            toGetResult4(str);
    }
    public static void toGetResult1(String str){
        StringBuilder builder = new StringBuilder(str);
    builder.append("World");
        System.out.println(builder);
    }
    public static void toGetResult2(String str){
        StringBuilder builder = new StringBuilder(str);
        builder.deleteCharAt(2);
        String result = builder.toString();
        System.out.println(result);
    }
    public static void toGetResult3(String str){
        StringBuilder builder = new StringBuilder(str);
        builder.replace(2,5,"Hello");
        String result = builder.toString();
        System.out.println(result);
    }
    public static void toGetResult4(String str){
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        String result = builder.toString();
        System.out.println(result);
    }


}
