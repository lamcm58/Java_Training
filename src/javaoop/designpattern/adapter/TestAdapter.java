package javaoop.designpattern.adapter;

import java.awt.List;

public class TestAdapter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List array = new List();
        array.add(" Teo ");
        array.add(" Ti ");
        array.add(" Ku ");
        
        IShowListName adapter = new ShowListNameAdapter(new ShowName());
        adapter.showListName(array);
    }

}
