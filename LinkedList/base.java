
import SingleLL;
import java.util.Scanner;

public class base {

  public static void main(String[] args) {

    SingleLL list = new SingleLL();
    list.add(20);
    list.add(23);
    list.add(343);
    list.add(7868899);
    list.display();

    System.out.println("value: ");
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    sc.close();

    list.remove(val);
    list.display();
  }
}
