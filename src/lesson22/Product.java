package lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    private long id;
    private String name;
    private double price;
    private double amount;

    public Product(long id, String name, double price, double amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + ", amount=" + amount + '}';
    }
}

class Supermarket {
    private List<Product> products;

    public Supermarket() {
        products = new ArrayList<>();
    }

    public void addProduct(Product... productsToAdd) {
        Collections.addAll(products, productsToAdd);
    }

    public void removeProduct(long productId, double amount) {
        for (Product product : products) {
            if (product.getId() == productId) {
                if (product.getAmount() >= amount) {
                    product.setAmount(product.getAmount() - amount);
                } else {
                    System.out.println("Insufficient amount of product: " + product.getName());
                }
                break;
            }
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Supermarket{" + "products=" + products + '}';
    }
}

class Customer {
    private String name;
    private double budget;
    private List<Product> basket;

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.basket = new ArrayList<>();
    }

    public void doShoppingIn(Supermarket store) {
        List<Product> storeProducts = store.getProducts();
        storeProducts.sort(Comparator.comparingDouble(Product::getPrice));
        for (Product product : storeProducts) {
            if (budget <= 0) break;
            if (product.getPrice() <= budget && product.getAmount() > 0) {
                double affordableAmount = Math.min(budget / product.getPrice(), product.getAmount());
                budget -= affordableAmount * product.getPrice();
                product.setAmount(product.getAmount() - affordableAmount);
                basket.add(new Product(product.getId(), product.getName(), product.getPrice(), affordableAmount));
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", budget=" + budget + ", basket=" + basket + '}';
    }
}

 class Main {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product(1, "Milk", 1.50, 10);
        Product p2 = new Product(2, "Bread", 2.00, 20);
        Product p3 = new Product(3, "Eggs", 0.20, 100);
        Product p4 = new Product(4, "Apple", 0.30, 50);

        // Create supermarket and add products
        Supermarket store = new Supermarket();
        store.addProduct(p1, p2, p3, p4);

        // Create customer with a budget
        Customer customer = new Customer("John Doe", 10.00);

        // Customer does shopping
        customer.doShoppingIn(store);

        // Print results
        System.out.println("Store after shopping: " + store);
        System.out.println("Customer after shopping: " + customer);
    }
}
