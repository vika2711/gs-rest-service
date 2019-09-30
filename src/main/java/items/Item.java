package items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Item {
    private String name;
    private int quantity;

    private Value amount;
    private int itemNo;
    private String inventoryCode;

    public Item(int i, String name, String inventoryCode){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Value getAmount() {
        return amount;
    }

    public void setAmount(Value amount) {
        this.amount = amount;
    }



    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }



    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", itemNo=" + itemNo +
                ", inventoryCode='" + inventoryCode + '\'' +
                '}';
    }
}
