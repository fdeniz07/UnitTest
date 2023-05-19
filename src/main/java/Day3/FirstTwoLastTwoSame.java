package Day3;

import java.util.DoubleSummaryStatistics;

public class FirstTwoLastTwoSame {

    //!!! Task: Ilk iki ve son iki karakteri ayni mi?? BABA

    public boolean check_If_First_Two_Last_Two_Are_Same(String text) {

        if (text.length() <= 1) return false;
        if (text.length() == 2) return true;

        String firstTwoChars = text.substring(0, 2); // AB
        String lastTwoChars = text.substring(text.length() - 2);

        return firstTwoChars.equals(lastTwoChars);
    }

}
