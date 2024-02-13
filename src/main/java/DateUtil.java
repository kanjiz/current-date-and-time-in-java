import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateUtil is a utility class for handling date and time operations.
 * The main functionalities are formatting the current date and time into strings.
 */
public class DateUtil {

  private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy.MM.dd");
  private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH時mm分ss秒");

  /**
   * This method fetches the current date from the system,
   * and converts it to a string following a specific format ('yyyy.MM.dd'), and returns this string.
   *
   * @return A string representing the current date formatted as per the declared pattern. For example, if the current date is 1st April 2024, it would return '2024.04.01'.
   */
  public static String getFormattedCurrentDate() {
    LocalDate currentDate = LocalDate.now();
    return currentDate.format(DATE_FORMATTER);
  }

  /**
   * This method fetches the current date and time from the system,
   * and converts it into a string following a specific format ('yyyy年MM月dd日HH時mm分ss秒'), and returns this string.
   *
   * @return A string representing the current date and time formatted as per the declared pattern. An example output could be '2024年04月01日12時00分00秒' for 1st April 2024, 12:00:00.
   */
  public static String getFormattedCurrentDateTime() {
    LocalDateTime currentDateTime = LocalDateTime.now();
    return currentDateTime.format(DATE_TIME_FORMATTER);
  }
}
