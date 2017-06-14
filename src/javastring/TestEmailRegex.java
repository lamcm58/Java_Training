package javastring;

public class TestEmailRegex {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String PHONE_REGEX = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$";
        String phone = "0966623949";
        boolean check = phone.matches(PHONE_REGEX);
        
        System.out.println(check);
    }

}
