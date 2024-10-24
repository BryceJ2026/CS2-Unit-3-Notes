public class Notes {

    public static void main(String []args) {
        

        //MULTI-WAY SELECTION
        System.out.println("What type of costume are you thinking of? (scary, cute, funny, other)");
        String choice = "no";
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





        // AND && OPERATOR
        // Both conditions need to be true for the conditional body to be executed
        boolean didHomework = false;
        boolean cleanedRoom = true;
        // can write the conditions either way below,
        // both are valid because we're using boolean variables already
        if ((didHomework == true) && (cleanedRoom)) {
            System.out.println("GET OUT");

        }

        else {
            System.out.println("GET BACK TO WORK");
        }
        // OR || OPERATOR
        //Evaluates to TRUE if AT LEAST one expressuon is true
        if ( (didHomework) || (cleanedRoom) ) {
            System.out.println("Do it later");
        }
        else {
            System.out.println("Do at least one thing bruh >:|");
        }


        // NOT ! OPERATOR
        // Use on only one condition to flip the boolean result

        boolean walkSignOn = true;
        // Condition body will execute only if condition is FALSE
        if (!walkSignOn) {
            System.out.println("STOP CROSSING THE STREET!!!");
        }


    }
}