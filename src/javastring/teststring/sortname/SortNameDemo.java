package javastring.teststring.sortname;

public class SortNameDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Human man1 = new Human("Chu An");
        Human man2 = new Human("Chu Văn Anh");
        Human man3 = new Human("Chu Bá An");
        Human man4 = new Human("Trần Văn An");
        Human man5 = new Human("Chu Bá Bảo An");
        Human man6 = new Human("Chu Bá Ân");
        
        String[] names = { man1.getName(), man2.getName(), man3.getName(), man4.getName(), man5.getName(), man6.getName() };

        ISortName sort = new SortName();
        sort.sortName(names);
    }

}
