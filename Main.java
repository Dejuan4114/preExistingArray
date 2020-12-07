import java.util.Scanner;

class Main {
  public static void main(String[]                                         args) {
  
   String[] classOne = new String[12];

   String[] classTwo = new String[10];

   Scanner scan = new Scanner(System.in);

   for( int i = 0; i < 9; i++){
    classTwo [i] = scan.next();
    classOne [i] = classTwo[i];

    System.out.println(classOne[i]                                         );
  }
 classOne[10]= " Victoria";
 classOne[11]= " Omar";
 System.out.println("Victoria");
 System.out.println("Omar");
  }
}