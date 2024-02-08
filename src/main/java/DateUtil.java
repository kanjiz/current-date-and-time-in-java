import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utility class providing methods for date and time formatting.
 */
public class DateUtil {

  /**
   * Retrieves the current date, converts it to a string in a specific format ('yyyy.MM.dd'), and returns this string.
   * @return the current date formatted as a string
   */
  public static String getFormattedCurrentDate() {
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    LocalDate currentDate = LocalDate.now();
    return currentDate.format(dateFormatter);
  }

  /**
   * Retrieves the current date and time, converts it to a string in a certain format ('yyyy年MM月dd日HH時mm分ss秒'), and returns this string.
   * @return the current date and time formatted as a string
   */
  public static String getFormattedCurrentDateTime() {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH時mm分ss秒");
    LocalDateTime currentDateTime = LocalDateTime.now();
    return currentDateTime.format(dateTimeFormatter);
  }
}
