

public class Arrays {

  public static void main( String args[]) {

    System.out.println("Arrays\n");

    int size = 5;

    String[] names =  new String[ size ];

    names[0] ="ram";

    for( int i =0 ; i< names.length ; i++){
      System.out.println(names[i]+" ");
    }
  }
}
