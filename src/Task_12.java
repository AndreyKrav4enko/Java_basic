import java.util.Locale;

public class Task_12 {
    public static void main (String[] args){

        String text = "I like Java!!!";
        boolean verify;

        if(text.contains("Java") || text.startsWith("I like") || text.endsWith("!!!")){
            System.out.println(text.toUpperCase(Locale.ROOT));
        }
        System.out.println();
        String changedText = text.replaceAll("a","o").substring(6,11);
        System.out.println(changedText);
    }
}
