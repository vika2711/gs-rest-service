package service;

import items.Item;

import java.util.List;

public interface IItemService {
    List<Item>getAllItems();

Item getItemNo(int itemNo);
boolean addItem(Item item);
void deleteItem(int itemNo);
}

