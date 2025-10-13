import java.util.Scanner;

public class shopping_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] shoppingList = new String[5];
        int itemCount = 0;

        System.out.println("Enter up to 5 items you need to buy:");

        
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            String input = scanner.nextLine().trim();

            
            if (input.isEmpty()) {
                break;
            }

            shoppingList[i] = input;
            itemCount++;
        }

        
        System.out.println("\n🛒 Your Shopping List:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("- " + shoppingList[i]);
        }

        
        System.out.println("\nTotal items: " + itemCount);

        
        System.out.print("\n🔍 Search for an item: ");
        String searchItem = scanner.nextLine().trim();
        boolean found = false;

        for (int i = 0; i < itemCount; i++) {
            if (shoppingList[i].equalsIgnoreCase(searchItem)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("✅ \"" + searchItem + "\" is in your shopping list.");
        } else {
            System.out.println("❌ \"" + searchItem + "\" is NOT in your shopping list.");
        }

        scanner.close();
    }
}
