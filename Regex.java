import java.util.regex.*;

public class Regex{
    String myPattern = "^[a-z]*[/.]?[a-z]*?[@][a-z]*[/.][a-z]{2,4}[/.]?[a-z]{2,3}?$";

    boolean checker(String word){
        Pattern pattern = Pattern.compile(myPattern);
        return pattern.matcher(word).matches();
    }

    public static void main(String[] args) {
        Regex regex = new Regex();
        System.out.println(regex.checker("abc.xyz@bl.co.in"));
    }

}