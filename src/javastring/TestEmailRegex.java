package javastring;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEmailRegex {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<String> emails = new ArrayList<String>();
        emails.add("sairamkrishna@tutorialspoint.com");
        emails.add("kittuprasad700@gmail.com");
        emails.add("sairamkrishna_mammahe%google-india.com");
        emails.add("sairam.krishna@gmail-indai.com");
        emails.add("sai#@youtube.co.in");
        emails.add("kittu@domaincom");
        emails.add("kittu#gmail.com");
        emails.add("@pindom.com");

        String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        for (Object email : emails) {
            Matcher matcher = pattern.matcher((CharSequence) email);
            System.out.println(email + " : " + matcher.matches());
        }
    }

}
