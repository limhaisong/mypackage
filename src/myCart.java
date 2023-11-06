
import java.util.regex.Pattern;

public class myCart {
    static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

    public static void main(String[] args) {
        boolean chk = isNumeric("223");
        System.out.println(chk);
    }
}
