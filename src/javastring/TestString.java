package javastring;


public class TestString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String[] names = { "Nguyen Thanh Viet", "chu Kim Thang", "Nguyen Cong Huy", "Mai Van An", "Dinh Tu" };
        for (String name : names) {
            String[] parts = name.split(" ", -1);
            System.out.println(parts[parts.length-1]);
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println(names[2].indexOf("Huy"));
    }

}
