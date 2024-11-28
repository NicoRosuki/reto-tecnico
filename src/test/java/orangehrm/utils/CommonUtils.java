package orangehrm.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CommonUtils {

  public static String getTodayInCustomFormat() {

    LocalDate today = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");

    return today.format(formatter);
  }

}
