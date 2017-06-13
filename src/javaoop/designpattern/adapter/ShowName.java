package javaoop.designpattern.adapter;

public class ShowName implements IShowName {
    @Override
    public void showName(String name) {
        System.out.println(this.standardize(name));
    }
    
    public String standardize(String name) {
        String result = name.trim();
        
        return result;
    }
}
