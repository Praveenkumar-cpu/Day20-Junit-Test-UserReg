import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
        public static boolean firstName(String fname) {
            String regex = "^[A-Za-z0-9]*";
            Pattern p = Pattern.compile(regex);
            if (fname == null) {
                return false;
            }
            Matcher matcher = p.matcher(fname);
            return matcher.matches();

        }

    public static boolean lastName(String lname) {
        String regex = "^[A-Za-z0-9]*";
        Pattern p = Pattern.compile(regex);
        if (lname == null) {
            return false;
        }
        Matcher matcher = p.matcher(lname);
        return matcher.matches();

        }

    public static boolean eMail(String email) {
        String regex = "[a-z]+.+[a-z]+[@]+[a-z]+.+[a-z]$";
        Pattern p = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher matcher = p.matcher(email);
        return matcher.matches();

    }

    public static boolean mobileNumber(String number) {
        String regex = "[0-9]{10}$";
        Pattern p = Pattern.compile(regex);
        if (number == null) {
            return false;
        }
        Matcher matcher = p.matcher(number);
        return matcher.matches();

    }


    public static boolean passWord(String password) {
        String regex ="[A-Za-z0-9]{6,}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher matcher = p.matcher(password);
        return matcher.matches();

    }

    public String moodAnalyser(String fname, String lname,String number,String email,String password){
            if(firstName(fname)==true && lastName(lname)==true && eMail(email)==true && mobileNumber(number)==true && passWord(password)==true){
                System.out.println("Mood is Happy");
                return "Happy";
            }else
                System.out.println("Mood is Sad");
                return "Sad";

    }

        public static void main(String[] args) {

            String str = "Praveen"; //first name
            System.out.println("Test Case One");
            System.out.println(firstName(str));

            String str1 = "pgb"; //last name
            System.out.println("Test Case Two");
            System.out.println(lastName(str1));

            String str2 = "praveen@gmail.com"; //mail
            System.out.println("Test Case Three");
            System.out.println(eMail(str2));

            String str3 = "9980305519"; //number
            System.out.println("Test Case Four");
            System.out.println(mobileNumber(str3));

            String str4 = "Ag124565"; //number
            System.out.println("Test Case Five");
            System.out.println(passWord(str4));



        }
}
