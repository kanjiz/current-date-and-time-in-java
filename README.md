# current-date-time-in-java

このリポジトリでは、Javaで日付と時間を扱うための`LocalDate`と`LocalDateTime`の使い方を学べます。ここでは、`DateUtil`と`App`という名前のふたつのシンプルなJavaクラスを使って、それぞれの操作を実際にやってみます。

Java 8で日付と時間の操作には新しいDate-Time APIが導入されました。このAPIは`java.time`パッケージに含まれており、`LocalDate`や`LocalDateTime`、`DateTimeFormatter`などのクラスを提供しています。

`LocalDate`クラスを使用すると、現在の日付を取得できます。`LocalDate.now()`メソッドを呼び出すと、現在の日付が返されます。

[LocalDate \(Java SE 21 & JDK 21\)](https://docs.oracle.com/javase/jp/21/docs/api/java.base/java/time/LocalDate.html)

`LocalDateTime`クラスを使用すると、現在の日時を取得できます。`LocalDateTime.now()`メソッドを呼び出すと、現在の日時が返されます。

[LocalDateTime \(Java SE 21 & JDK 21\)](https://docs.oracle.com/javase/jp/21/docs/api/java.base/java/time/LocalDateTime.html)

`DateTimeFormatter`クラスを使用すると、日時を特定の形式で出力できます。`DateTimeFormatter.ofPattern`メソッドを使用して、出力形式を定義します。このメソッドの引数には、出力形式を表す文字列を指定します。

[DateTimeFormatter \(Java SE 21 & JDK 21\)](https://docs.oracle.com/javase/jp/21/docs/api/java.base/java/time/format/DateTimeFormatter.html)

## DateUtil.java

[`DateUtil.java`](src/main/java/DateUtil.java)は、「yyyy-MM-dd」形式の現在の日付と、「yyyy-MM-dd HH:mm:ss」形式の現在の日付時間を返すふたつのメソッドを提供しています。

- `getFormattedCurrentDate()`
- `getFormattedCurrentDateTime()`

## App.java

[`App.java`](src/main/java/App.java)は`DateUtil`の各メソッドの使用例を示しています。`main`メソッドでは、現在の日付と現在の日付時間を表示します。

以下は`App`クラスの実行手順です:

```bash
javac App.java
java App
```

これを実行すると、コンソールに現在の日付と現在の日付時間が表示されます。
