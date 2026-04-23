package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {

    /**
     * EXERCISE: Complete the Cart class
     *
     * Instructions:
     * Replace all  comments with working code.
     */

    //  1.Create a private list that stores Product objects
    // Hint: Use List<Product> and ArrayList
    private List<Product> items = new ArrayList<>();

    /**
     * Adds a product to the cart.
     */
    public void addProduct(Product product) {

        // 2. Check if the product is null
        // If null → throw IllegalArgumentException
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }

        // 3. Add the product to the list
        items.add(product);
    }

    /**
     * Removes a product from the cart.
     */
    public void removeProduct(Product product) {

        // 4. Remove the product from the list
        items.remove(product);
    }

    /**
     * Returns all products in the cart.
     */
    public List<Product> getItems() {

        // 5. Return a read-only version of the list
        // Hint: Collections.unmodifiableList(...)
        return Collections.unmodifiableList(items);
    }

    /**
     * Returns the number of items in the cart.
     */
    public int getItemCount() {

        // 6. Return the size of the list
        return items.size();
    }

    /**
     * Checks whether the cart is empty.
     */
    public boolean isEmpty() {

        // 7. Return true if the cart is empty
        return items.isEmpty();
    }

    /**
     * Removes all products from the cart.
     */
    public void clear() {

        // 8. Clear the list
        items.clear();
    }

    /**
     * Calculates the total price.
     */
    public double getTotalPrice() {

        // 9. Create a variable to store the total (double total = 0;)
        double total = 0;

        // 10. Loop over all products (for-each loop)
        for (Product product : items) {

            // 11. Add each product price to total
            // Hint: product.getPrice()
            total += product.getPrice();
        }

        // 12. Return the total
        return total;
    }

    /**
     * (Optional Bonus)
     * Prints all products in the cart.
     */
    public void printItems() {

        // 13. Loop through all products
        for (Product product : items) {

            // 14. Print each product
            // Hint: System.out.println(product);
            System.out.println(product);
        }
    }
}

