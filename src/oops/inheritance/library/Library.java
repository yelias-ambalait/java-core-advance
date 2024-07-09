package oops.inheritance.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;

    public Library(){
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item){
        items.add(item);
    }

    public List<LibraryItem> getItems(){
        return items;
    }

    public void display(){
        for(LibraryItem item : items){
            item.borrow();
        }
    }

}
