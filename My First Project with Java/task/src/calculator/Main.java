package calculator;

import java.util.Scanner;

enum Products {
    BUBBLEGUM("Bubblegum", "$2", 202),
    TOFFEE("Toffee", "$0.2", 118),
    ICE_CREAM("Ice cream", "$5", 2250),
    MILK_CHOCOLATE("Milk chocolate", "$4", 1680),
    DOUGHNUT("Doughnut", "$2.5", 1075),
    PANCAKE("Pancake", "$3.2", 80);

    private final String productName;

    private final String productPrice;

    private final int earnedAmount;

    Products(String productName, String productPrice, int earnedAmount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.earnedAmount = earnedAmount;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public int getEarnedAmount() {
        return earnedAmount;
    }
}

public class Main {
    public static void main(String[] args) {
        calculateNetIncome();
    }

    public static void displayProductNameAndPrice() {
        System.out.println("Prices:");
        for (Products products : Products.values()) {
            System.out.println(products.getProductName() + ": " + products.getProductPrice());
        }
    }

    public static int calculateIncomeForAllProducts() {
        System.out.println("Earned amount:");
        int totalIncome = 0;
        for (Products products : Products.values()) {
            System.out.println(products.getProductName() + ": $" + products.getEarnedAmount());
            totalIncome += products.getEarnedAmount();
        }

        System.out.println("Income: $" + totalIncome);
        return totalIncome;
    }

    public static void calculateNetIncome() {
        int totalIncome = calculateIncomeForAllProducts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();

        int netIncome = totalIncome - staffExpenses - otherExpenses;
        System.out.println("Net income: $" + netIncome);

    }
}