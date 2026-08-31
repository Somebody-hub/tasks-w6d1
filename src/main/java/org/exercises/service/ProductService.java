package org.exercises.service;

import org.exercises.model.Product;

import java.util.*;

public class ProductService {

    public void addProduct(List<Product> products, Product product) {
        products.add(product);
        System.out.println("Added: " + product);
    }

    public void showProductList(List<Product> allProducts) {
        if (allProducts.isEmpty()) {
            System.out.println("Product list is empty");
            return;
        }
        System.out.println("==Product List==");
        for (Product product : allProducts) {
            System.out.println(product);
        }
    }

    public List<Product> findMoreExpensiveThan(List<Product> allProducts, double minPrice) {
        List<Product> result = new ArrayList<>();
        for (Product product : allProducts) {
            if (product.getPrice() > minPrice) {
                result.add(product);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Product list is empty");
        } else {
            System.out.println("Products expensive than " + minPrice);
            showProductList(result);
        }
        return result;
    }

    public double calculateTotalCost(List<Product> products) {
        double totalCost = 0.0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        System.out.printf("Total cost is: $%.2f\n", totalCost);
        return totalCost;
    }
}
