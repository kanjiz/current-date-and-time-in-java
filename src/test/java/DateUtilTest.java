import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The DateUtilTest class conducts tests for the methods within the DateUtil class.
 * It contains two test methods, where each method is designed to test a specific function in the DateUtil class.
 */
public class DateUtilTest {

  /**
   * This test case, testGetFormattedCurrentDate, tests the DateUtil#getFormattedCurrentDate method.
   * It checks whether the method correctly returns a string formatted representation of the current date.
   * Note: The test might fail if the system date changes between the moments of calculating the expected result and running the method under test.
   */
  @DisplayName("Test for correctly formatted current date")
  @Test
  public void testGetFormattedCurrentDate() {
    // Generates the actual result by using the method under test
    String actual = DateUtil.getFormattedCurrentDate();
    // Generates the expected result by formatting the current date
    String expected = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));

    // Compares the actual result to the expected result
    assertEquals(expected, actual);
  }

  /**
   * This test case, testGetFormattedCurrentDateTime, tests the DateUtil#getFormattedCurrentDateTime method.
   * It checks whether the method correctly returns a string formatted representation of the current date and time.
   * Note: The test might fail if the system date-time changes between the moments of calculating the expected result and running the method under test.
   */
  @DisplayName("Test for correctly formatted current date and time")
  @Test
  public void testGetFormattedCurrentDateTime() {
    // Generates the actual result by using the method under test
    String actual = DateUtil.getFormattedCurrentDateTime();
    // Generates the expected result by formatting the current date and time
    String expected = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy年MM月dd日HH時mm分ss秒"));

    // Compares the actual result to the expected result
    assertEquals(expected, actual);
  }
}
