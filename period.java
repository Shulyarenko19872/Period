import java.time.LocalDate;
import java.time.Period;

public class Main {

  public static void main(String[] args) {
    LocalDate birthday = LocalDate.of(1975,12,31);
    System.out.println(getPeriodFromBirthday(birthday));
  }

  private static String getPeriodFromBirthday(LocalDate birthday) {
    LocalDate now = LocalDate.now();

    Period period = birthday.until(now);

    String text = period.getYears() + " years, " + period.getMonths() + " months, " +
            period.getDays() + " days";

    return text;
  }

}
