import java.util.*;

public class Passport extends Card {
  private String birthLocation;
  private int expirationYear;

  public Passport(String n, String birth, int expire) {
    super(n);
    birthLocation = birth;
    expirationYear = expire;
  }

  public Passport(String birth, int expire) {
    birthLocation = birth;
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
