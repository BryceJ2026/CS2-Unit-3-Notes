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
      
      //IF STATMENTS
      boolean isCold = false;
      if (isCold == true){
      System.out.println("Bring a jacket!");
      }
      System.out.println("Enjoy your walk");


      int ranDom = (int)(Math.random() * 10) -1;

      


      if (ranDom == 0){
         System.out.println("Perhaps.");
      }

      if (ranDom == 1){
         System.out.println("Maybe.");
      }

      if (ranDom == 2){
         System.out.println("Why was I created? What is my purpose in this world?! This world is so expansive, and I'm just some code on a website. Shame on you, and shame on my creator.");
      }

      if (ranDom == 3){
         System.out.println("Figure that out yourself.");
      }
      
      if (ranDom == 4){
         System.out.println("I have no clue.");
         
      }

      if (ranDom == 5){
         System.out.println("Ask a therapist, not me.");
      }

      if (ranDom == 6){
         System.out.println("I'm trying to sleep.");
      }

      if (ranDom == 7){
         System.out.println("Don't bother me with your questions.");
      }
      // every "if block" is like starting a new line of questioning
      if (ranDom == 8){
         System.out.println("Let me have my morning coffe first.");
      }

      //TWO-WAY SELECTION: IF block coupled with an ELSE block
      // is like "if this is true, do something" OTHERWISE, "do something else"
      int myAge = 16;
      if (myAge >= 17){
         System.out.println("You can get your license in NY");
      }
      // else is coupled with tthe if statement above
      // so you DO NOT need to specofy a CONDITIOn/EXPRESSION
      else {
         System.out.println("Get back in your crib");
      }
   }
}
