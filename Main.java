public class Main {

   public static void main(String []args) {
      //One = sign ASSIGNS a value to a variable
      int age = 15;
      int year = 14;
      // Two == is checking for EQUALITY
      boolean match = (age == year);
      System.out.println("Does age match year?" + match);
      year = 15; //Re-ASSIGNING
      System.out.println(age == year); // true

      // != means "is Not equal to"
      System.out.println(age != year); // false


      // REALTIONAL OPERATORS
      // used in boollean expression
      double pi = 3.1415;
      System.out.println(pi > 0);// checking if positive
      System.out.println(pi < 0);// checking if negative
      System.out.println(pi >= 3.14); // true
      System.out.println(pi <= 10); //true
      

   }
}
