package Exercise_9;

  // Clothing Store

class ClothingItem {
  private String itemName;
  private double price;
  private String size;

  // Constructor
  
  public ClothingItem(String itemName, double price, String size) {
      this.itemName = itemName;
      this.price = price;
      this.size = size;
  }

  // Method to display clothing item details
  
  public void displayItemDetails() {
      System.out.println("Item: " + itemName + ", Price: " + price + ", Size: " + size);
  }
}

// Example usage

public class Main13 {
  public static void main(String[] args) {
      ClothingItem item = new ClothingItem("Jeans", 1400.0, "S");
      item.displayItemDetails();
  }
}
