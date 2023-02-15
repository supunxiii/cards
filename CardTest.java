public class CardTest {
  public static void main(String[] args) {
    DriverLicense d1 = new DriverLicense("Supun Wijesooriya", 1999);
    System.out.println("License of Supun expired: " + d1.isExpired());
    DriverLicense d2 = new DriverLicense("Taylor Swift", 1989);
    System.out.println("License of Taylor expired: " + d2.isExpired());
    Passport p1 = new Passport("Supun Wijesooriya", "California", 2014);
    System.out.println("Passport of Supun expired: " + p1.isExpired());
    Passport p2 = new Passport("Taylor Swift", "Pennysylvania", 2013);
    System.out.println("Passport of Taylor expired: " + p2.isExpired());
    CreditCard c1 = new CreditCard("Supun Wijesooriya", 5555, 444444444);
    CreditCard c2 = new CreditCard(7575, 1515151761);  // credit card that doesn't have a name.
  }
}
