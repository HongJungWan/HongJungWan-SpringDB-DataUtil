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
public class ItemUpdateDto {
    private String itemName;
    private Integer price;
    private Integer quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemUpdateDto that = (ItemUpdateDto) o;
        return Objects.equals(itemName, that.itemName) && Objects.equals(price, that.price) && Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, price, quantity);
    }

    @Override
    public String toString() {
        return "ItemUpdateDto{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}