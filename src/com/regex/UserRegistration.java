package com.regex;
/**
 * UC1 :- As a User need to enter a valid First Name
 *        - First name starts with Cap and has minimum 3 characters
 * UC2 :- As a User need to enter a valid Last Name
 *        - Last name starts with Cap and has minimum 3 characters
 * UC3 :- As a User need to enter  a valid email
 *        - E.g. abc.xyz@bl.co.in
 *        - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with precise @ and . positions
 * UC4 :- As a User need to follow pre-defined Mobile Format
 *        - E.g. 91 9919819801
 *        - Country code follow by space and 10 digit number
 * UC5 :- As a User need to follow pre-defined Password rules.Rule1– minimum 8 Characters
 *         - NOTE – All rules must be passed
 * UC6 :- Rule2 – Should have at least 1 Upper Case
 *        - NOTE – All rules must be passed
 * UC7 :- Rule3 – Should  have at least 1 numeric number in the password
 *       - NOTE – All rules must be passed
 * UC8 :- Rule4 – Has exactly 1 Special Character
 *        - NOTE – All rules must be passed
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
     * create a method name as validateEmail
     *  method to check Email Valid or Invalid
     */
    public void validateEmail() {
        System.out.println("Enter Email");
        String email=sc.next();

        /**
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(email);
        boolean result = matcher.matches();

        if(result){
            System.out.println("Valid Email Address");
        }
        else {
            System.out.println("Invalid Email Address");
        }
    }

    /**
     * create a method name as validMobileNo
     * method to check Phoneno Valid or Invalid
     */
    public void validMobileNo() {
        System.out.println("Enter MobileNo with country code");
        String mobileno=sc.next();
        /**
         *  regex pattern for email
         */
        String regex =  "^[1-9]{2}\\s[0-9]{10}$";

        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(mobileno);

        boolean result = matcher.matches();
        /**
         * if match print valid MobileNo other print invalid mobileno
         */
        if(result){
            System.out.println("Valid MobileNo");
        }
        else {
            System.out.println("Invalid MobileNo");
        }
    }

    /**
     * create a method name as validPassword
     * method to check password Valid or Invalid
     */
    public void validPassword1() {
        System.out.println("Enter Password");
        String password=sc.next();
        /**
         * regex pattern for password:must contain atleast 8 characters
         */
        String regex = "^[a-zA-z1-9]{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(password);
        boolean result = matcher.matches();
        /**
         * if condition is true then print valid password otherswise print invalid password
         */
        if(result){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
    /**
     * create a method name as validPassword2
     * check password valid or not
     */
    public void validPassword2() {
        System.out.println("Enter Password");
        String password=sc.next();
        /**
         * regex pattern for password:
         * 1)must contain atleast 8 characters
         * 2)must contain one UpperCase
         */
        String regex = "^[A-Z]{1,}[a-zA-z1-9]{7,}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(password);
        boolean result = matcher.matches();
        /**
         * if condition is true then print valid password otherwise invalid
         */
        if(result){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }

    /**
     * create a method name as validPassword3
     * method to check password Valid or Invalid
     */
    public void validPassword3() {
        System.out.println("Enter Password");
        String password=sc.next();
        /**
         * regex pattern for password:
         * 1)must contain atleast 8 characters
         * 2)must contain one UpperCase
         * 3)should have 1 numericno.
         */
        String regex = "^[A-Z]{1}+[a-zA-z1-9]{6,}[1-9]{1}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(password);
        boolean result = matcher.matches();

        if(result){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }

    /**
     * create a method name as validPassword4
     * method to check password Valid or Invalid
     */
    public void validPassword4() {
        System.out.println("Enter Password");
        String password=sc.next();
        /**
         * regex pattern for password:
         * 1)must contain atleast 8 characters
         * 2)must contain one UpperCase
         * 3)should have 1 numericno
         * 4)has contain Exactily one specialSymbol.
         */
        String regex = "^[A-Z]{1}+[a-zA-z1-9]{6,}[@$^]{1}[1-9]{1}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(password);
        boolean result = matcher.matches();

        /**
         * if condition is true then print valid password otherwise print invalid password
         */
        if(result){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
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
                    +"2)LastName\n"  //uc2
                    +"3)Email\n"      //uc3
                    +"4)PhoneNo\n"    //uc4
                    +"5)password 1\n" //Uc5
                    +"6)password 2\n" //uc6
                    +"7)password 3\n" //uc7
                    +"8)password 4"); //uc8

            int choice=sc.nextInt();
            /**
             * using switch case for choosing option and print output calling wise.
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
                /**
                 * for uc3 calling validateEmail method in this case
                 */
                case 3:
                    registration.validateEmail();
                    break;
                /**
                 * for uc4 calling validMobileNo method in this case
                 */
                case 4:
                    registration.validMobileNo();
                    break;
                /**
                 * for uc5 calling validPassword1 method in 7this case
                 */
                case 5:
                    registration.validPassword1();
                    break;
                /**
                 * for uc6 calling validPassword2 method in this case
                 */
                case 6:
                    registration.validPassword2();
                    break;
                /**
                 * for uc7 calling validPassword3 method in this case
                 */
                case 7:
                    registration.validPassword3();
                    break;
                /**
                 * for uc8 calling validPassword4 method in this case
                 */
                case 8:
                    registration.validPassword4();
                    break;

                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }
    }
}