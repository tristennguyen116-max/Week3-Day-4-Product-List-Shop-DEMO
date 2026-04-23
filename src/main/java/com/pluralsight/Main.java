package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// Step 1: create an empty list of products
        // List<Product> products = new ArrayList<>();

// Step 2: create some products
        // Product p1 = new Product("Laptop", 1000);
        // Product p2 = new Product("Mouse", 50);
        // Product p3 = new Product("Keyboard", 150);

// Step 3: add products to the list
        // products.add(p1);

        ArrayList<Product> storeProducts = new ArrayList<>();

        storeProducts.add(new Product("Laptop", 2000));
        storeProducts.add(new Product("Mouse", 40));
        storeProducts.add(new Product("Keyboard", 100));
        storeProducts.add(new Product("Monitor", 300));
        storeProducts.add(new Product("Cords", 25));
        storeProducts.add(new Product("Microphone", 800));
        storeProducts.add(new Product("Gaming Desktop", 3000));


        System.out.println("Available store products:");
        for (Product product : storeProducts) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("================================");
        System.out.println();

        Cart cart = new Cart();

        cart.addProduct(storeProducts.get(0));
        cart.addProduct(storeProducts.get(1));
        cart.addProduct(storeProducts.get(2));
        cart.addProduct(storeProducts.get(3));
        cart.addProduct(storeProducts.get(4));
        cart.addProduct(storeProducts.get(5));
        cart.addProduct(storeProducts.get(6));

        System.out.println("Cart items:");
        for (Product product : cart.getItems()) {
            System.out.println(product);
        }

        System.out.println("------------------");
        System.out.printf("Total: $%.2f%n", cart.getTotalPrice());

        System.out.println();
        System.out.println("Item count: " + cart.getItemCount());

    }
}