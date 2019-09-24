package items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Value {
    private Long id;
    private String item;

    public Value() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }


    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", item='" + item + '\'' +
                '}';
    }
}
