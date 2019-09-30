package service;

import items.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ItemService implements IItemService {
    private List<Item> list = new ArrayList<>();
    {
        list.add(new Item(1, "Item", "12345"));
        list.add(new Item(2, "Spring", "12341"));
        list.add(new Item(3, "Example", "12343"));
    }

    @Override
    public List<Item> getAllItems() {
        return list;
    }



    @Override
    public Item getItemNo(int itemNo) {
        Predicate<Item> articlePredicate = a-> a.getItemNo() == itemNo;
        Item obj = list.stream().filter(articlePredicate).findFirst().get();
        return obj;
    }


    @Override
    public boolean addItem(Item item) {
        list.add(item);
        return true;
    }

    @Override
    public void deleteItem(int itemNo) {
        Predicate<Item> articlePredicate = a-> a.getItemNo() == itemNo;
        Item obj = list.stream().filter(articlePredicate).findFirst().get();
        list.remove(obj);

    }
}
