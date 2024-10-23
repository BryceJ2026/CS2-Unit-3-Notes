public class Notes {

    public static void notes(String [] {
        

        //MULTI-WAY SELECTION
        System.out.println("What type of costume are you thinking of? (scary, cute, funny, other)");
        String choice = "scary";
        //Always start a "decision" with an IF statement

        if (choice.equals("scary")) {
            System.out.println("You should be taxes.");
        }
        // You can include as many else if statements as you want
        // but they must follow an initial IF statement
        else if (choice.equals("cute")) {
            System.out.println("You should be the heat death of the universe");
        }

        else if (choice.equals("funny")){
            System.out.println("You should be Jesse from Breaking Bad");
        }
        //Provide a "catch-all" choice in case earlier condituons are not met
        else {
            System.out.println("Stick to the script or you're FIRED");
        }

    }
}