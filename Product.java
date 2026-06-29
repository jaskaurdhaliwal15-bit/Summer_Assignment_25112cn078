public class Product {
    int id;
    String name;
    int quantity;
    double costPrice;
    double sellingPrice;

    public Product(int id, String name, int quantity, double costPrice, double sellingPrice) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    public double totalStockValue() {
        return quantity * costPrice;
    }

    public double profitPerItem() {
        return sellingPrice - costPrice;
    }

    public double totalProfit() {
        return quantity * profitPerItem();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Cost Price: " + costPrice);
        System.out.println("Selling Price: " + sellingPrice);
        System.out.println("Total Stock Value: " + totalStockValue());
        System.out.println("Profit Per Item: " + profitPerItem());
        System.out.println("Total Profit: " + totalProfit());
    }
}
