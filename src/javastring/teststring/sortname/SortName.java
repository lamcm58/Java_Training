package javastring.teststring.sortname;

public class SortName implements ISortName {
    @Override
    public void sortName(String[] fullName) {
        int n = fullName.length;
        String temp;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (compare(fullName[j - 1], fullName[j]) > 0) {
                    temp = fullName[j - 1];
                    fullName[j - 1] = fullName[j];
                    fullName[j] = temp;
                }
            }
        }
        
        for (String fName : fullName) {
            System.out.println(fName);
        }
    }
    
    public static String getName(String fullName) {
        String[] name = fullName.split(" ");
        
        return name[name.length - 1];
    }
    
    public static int compare(String fullName1, String fullName2) {
        String name1 = getName(fullName1);
        String name2 = getName(fullName2);
        
        if (!(name1.equalsIgnoreCase(name2))) {
            return name1.compareToIgnoreCase(name2);
        } else {
            return fullName1.compareToIgnoreCase(fullName2);
        }
    }
}
