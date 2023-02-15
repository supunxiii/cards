import java.util.*;

public class DriverLicense extends Card {
  private int expirationYear;

  public DriverLicense(String n, int expire) {
    super(n);
    expirationYear = expire;
  }
  public DriverLicense(int expire) {
    expirationYear = expire;
  }

  public boolean isExpired() {
    GregorianCalendar calendar = new GregorianCalendar();
    int current_year = calendar.get(Calendar.YEAR);
    if (expirationYear < current_year)
      return true;
    else
      return false;
    }
}
