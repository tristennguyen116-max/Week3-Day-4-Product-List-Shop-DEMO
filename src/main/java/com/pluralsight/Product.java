package com.pluralsight;

public class Product {

    // PAST Example Code
    // String name;
    // double price;
    // Product(String name, double price) {
    // this.name = name;
    // this.price = price;

            /**
             * Represents a product with a name and a price.
             */
            private final String name;

            private final double price;

                /**
                 * Creates a new Product instance.
                 *
                 * @param name the product name
                 * @param price the product price
                 */

                public Product(String name, double price) {
                    if (name == null || name.trim().isEmpty()) {
                        throw new IllegalArgumentException("Product name cannot be null or empty.");
                    }

                    if (price < 0) {
                        throw new IllegalArgumentException("Price cannot be negative.");
                    }

                    this.name = name.trim();
                    this.price = price;
                }

                /**
                 * Gets the product name.
                 *
                 * @return the product name
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Gets the product price.
                 *
                 * @return the product price
                 */
                public double getPrice() {
                    return price;
                }

                /**
                 * Returns a string representation of the product.
                 *
                 * @return formatted product information
                 */
                @Override
                public String toString() {
                    return String.format("Product{name='%s', price=%.2f}", name, price);
                }
            }


