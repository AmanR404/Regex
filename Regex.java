import java.util.regex.*;

public class Regex{
    String myPattern = "^[a-zA-Z0-9/.@/-/_]{8,}$";

    boolean checker(String word){
        Pattern pattern = Pattern.compile(myPattern);
        return pattern.matcher(word).matches();
    }

    public static void main(String[] args) {
        Regex regex = new Regex();
        System.out.println(regex.checker("Qaz@6543"));
    }

}