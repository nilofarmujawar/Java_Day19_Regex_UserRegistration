package com.regex;


/**
 * UC1 :- As a User need to enter a valid First Name
 *        - First name starts with Cap and has minimum 3 characters
 *
 * UC2 :- As a User need to enter a valid Last Name
 *        - Last name starts with Cap and has minimum 3 characters
 * 
 */

/**
 * Regex :-
 *  A regular expression is a sequence of characters that forms a search pattern.
 *  When you search for data in a text, you can use this search pattern to describe what you are searching for.
 */

/**
 * import scanner class ,matcher,pattern class
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * create a class name as UserRegistration
 */

public class UserRegistration {

    /**
     * create a object for scanner class
     * Scanner class for user input
     */
    Scanner sc=new Scanner(System.in);

    /**
     * create a method name as validateUsername
     * method to check username Valid or Invalid
     */
    public void validateUserName() {

        System.out.println("Enter UserName");

        String userName=sc.next();

        /**
         * regex pattern for username
         */
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";

        /**
         * First, the pattern is created using the Pattern.compile() method
         * The first parameter indicates which pattern is being searched for
         */

        Pattern p = Pattern.compile(regex);

        /**
         * The matcher() method is used to search for the pattern in a string.
         * It returns a Matcher object which contains information about the search that was performed.
         */
        Matcher matcher = p.matcher(userName);

        /**
         * boolean data type is used for return op is true or false
         */
        boolean result = matcher.matches();

        /**
         *  if else conditional statment is used
         *  if pattern match then print  valid username if not matched print invalid username
         */

        if(result){
            System.out.println("Valid username");
        }
        else {
            System.out.println("Invalid username");
        }
    }

    /**
     * create a method name as validateLastname
     * method to check LastName Valid or Invalid
     */
    public void validateLastName() {

        System.out.println("Enter LastName");

        String lastName=sc.next();

        /**
         *  regex pattern for Lastname
         */
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";

        /**
         * First, the pattern is created using the Pattern.compile() method
         * The first parameter indicates which pattern is being searched for
         */
        Pattern p = Pattern.compile(regex);

        /**
         * The matcher() method is used to search for the pattern in a string.
         * It returns a Matcher object which contains information about the search that was performed.
         */

        Matcher matcher = p.matcher(lastName);

        /**
         * boolean data type is used for return op is true or false
         */
        boolean result = matcher.matches();

        /**
         * if mather matches then print valid username other print invalid username
         */
        if(result){
            System.out.println("Valid username");
        }
        else {
            System.out.println("Invalid username");
        }
    }


    /**
     * create a main method
     * all programs execute in main method
     * @param args no arguments
     */
    public static void main(String[] args) {

        /**
         * create object for UserRegistration class
         * object name is registration.
         */
        UserRegistration registration=new UserRegistration();
        Scanner sc=new Scanner(System.in);

        /**
         * while loop is used
         */
        while(true) {

            /**
             * userinput choice for checking Multiple validation
             */
            System.out.println("Enter choice.............\n "
                    +"1)UserName\n"   //uc1
                    +"2)LastName\n");

            int choice=sc.nextInt();


            /**
             * using switch case for choosing option and print output calling wise.
             *
             */
            switch(choice) {

                /**
                 * for uc1 calling validateUsername method in this case
                 */
                case 1:
                    registration.validateUserName();
                    break;

                /**
                 * for uc2 calling validateLastname method in this case
                 */
                case 2:
                    registration.validateLastName();
                    break;

                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }
    }
}
