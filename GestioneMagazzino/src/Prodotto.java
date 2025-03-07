public class Prodotto {
private String name;
private String category;
private Double price;
private Double quantity;

public Prodotto(String name, String category, Double price, Double quantity) {
super();
this.name = name;
this.category = category;
this.price = price;
this.quantity = quantity;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getCategory() {
return category;
}

public void setCategory(String category) {
this.category = category;
}

public Double getPrice() {
return price;
}

public void setPrice(Double price) {
this.price = price;
}

public Double getQuantity() {
return quantity;
}

public void setQuantity(Double quantity) {
this.quantity = quantity;
}

@Override
public String toString() {
return name + "," + category + "," + price + "," + quantity;
}
}
