package hello.itemservice.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ItemSearchCond {
    private String itemName;
    private Integer maxPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemSearchCond that = (ItemSearchCond) o;
        return Objects.equals(itemName, that.itemName) && Objects.equals(maxPrice, that.maxPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, maxPrice);
    }

    @Override
    public String toString() {
        return "ItemSearchCond{" +
                "itemName='" + itemName + '\'' +
                ", maxPrice=" + maxPrice +
                '}';
    }
}