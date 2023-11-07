# java-current-date-time-example

Java 8以降では、日付と時間の操作には新しいDate-Time APIが導入されました。このAPIは`java.time`パッケージに含まれており、`LocalDate`や`LocalDateTime`、`DateTimeFormatter`などのクラスを提供しています。

`LocalDate`クラスを使用すると、現在の日付を取得することができます。`LocalDate.now()`メソッドを呼び出すと、現在の日付が返されます。

`LocalDateTime`クラスを使用すると、現在の日時を取得することができます。`LocalDateTime.now()`メソッドを呼び出すと、現在の日時が返されます。

`DateTimeFormatter`クラスを使用すると、日時を特定の形式で出力することができます。`DateTimeFormatter.ofPattern`メソッドを使用して、出力形式を定義します。このメソッドの引数には、出力形式を表す文字列を指定します。

以下に、これらのクラスを使用して現在の日付と日時を取得し、"yyyy.MM.dd"と"yyyy年MM月dd日HH時mm分ss秒"の形式で出力する例を示します。

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 現在の日時と日付を特定の形式で出力するクラスです。
 */
public class Main {
    /**
     * 日付のフォーマットを定義します。これは定数なので大文字で記述します。
     */
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    /**
     * 日時のフォーマットを定義します。これは定数なので大文字で記述します。
     */
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH時mm分ss秒");

    /**
     * プログラムのエントリーポイントです。
     * 現在の日時と日付を取得し、定義したフォーマットで出力します。
     */
    public static void main(String[] args) {
        System.out.println(getCurrentDate());
        System.out.println(getCurrentDateTime());
    }

    /**
     * 現在の日付を取得し、定義したフォーマットに従って文字列に変換するメソッドです。
     *
     * @return フォーマットされた現在の日付
     */
    public static String getCurrentDate() {
        // 現在の日付を取得します
        LocalDate currentDate = LocalDate.now();
        // 取得した日付を定義したフォーマットに従って文字列に変換します
        return currentDate.format(DATE_FORMATTER);
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
        return currentDateTime.format(DATE_TIME_FORMATTER);
    }
}
```

このコードを実行すると、現在の日時が"yyyy年MM月dd日HH時mm分ss秒"の形式で出力されます。
