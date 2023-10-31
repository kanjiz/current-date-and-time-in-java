import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 現在の日時を特定の形式で出力するクラスです。
 */
public class Main {
  /**
   * 日時のフォーマットを定義します。これは定数なので大文字で記述します。
   */
  private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH時mm分ss秒");

  /**
   * プログラムのエントリーポイントです。
   * 現在の日時を取得し、定義したフォーマットで出力します。
   */
  public static void main(String[] args) {
    System.out.println(getCurrentDateTime());
  }

  /**
   * 現在の日時を取得し、定義したフォーマットに従って文字列に変換するメソッドです。
   *
   * @return フォーマットされた現在の日時
   */
  public static String getCurrentDateTime() {
    // 現在の日時を取得します
    LocalDateTime currentDateTime = LocalDateTime.now();
    // 取得した日時を定義したフォーマットに従って文字列に変換します
    return currentDateTime.format(FORMATTER);
  }
}
