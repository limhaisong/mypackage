package day01;

import java.util.regex.Pattern;

public class myJavaLib {

    Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public boolean isNumeric_chk(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

}
