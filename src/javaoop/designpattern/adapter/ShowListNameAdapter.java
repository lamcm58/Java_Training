package javaoop.designpattern.adapter;

import java.awt.List;

public class ShowListNameAdapter implements IShowListName {
    private ShowName shownName;
    
    public ShowListNameAdapter(ShowName shownName) {
        this.shownName = shownName;
    }
    
    @Override
    public void showListName(List listName) {
        for (int i = 0; i < listName.getItemCount(); i++) {
            shownName.showName(listName.getItem(i));
        }
    }
}
