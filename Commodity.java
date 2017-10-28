package hw10;

public class Commodity {
private String name;
private int price;
private int amount;
public Commodity(String name, int price,int amount) {
	this.name = name;
	this.price = price;
	this.amount = amount;
}

public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return " -- Товар : " + name + " , ціна : " + price + " , в наявності : " + amount + " одиниць";
}


}
