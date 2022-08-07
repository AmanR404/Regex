import java.util.regex.*;

public class Regex{
    String myPattern = "^[0-9]{2}[ ][0-9]{10}$";

    boolean checker(String word){
        Pattern pattern = Pattern.compile(myPattern);
        return pattern.matcher(word).matches();
    }

    public static void main(String[] args) {
        Regex regex = new Regex();
        System.out.println(regex.checker("91 9893009922"));
    }

}