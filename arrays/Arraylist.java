
import java.util.ArrayList;
import java.util.List;

public class Arraylist{

  public static void main( String a[]){

    ArrayList<String> names = new ArrayList<>(99); // size 0 define n in ()
    names.add("ram"); // size = 9 or n 
    names.add("raghu"); // size = n + n/1 + 1
    names.add(0,"gana"); // insertAt
    //System.out.println(names);

    List<Integer> nums = new ArrayList<>();
    nums.add(33);
    nums.add(88344);
    nums.add(89);
    nums.add(898);

    List<Integer> newlist = new ArrayList<>();
    newlist.add(1);
    newlist.add(2);

    nums.addAll(newlist);
    //System.out.println(nums.get(2));

    for (Integer num : nums){
      System.out.println(num);
    }
  }
}
