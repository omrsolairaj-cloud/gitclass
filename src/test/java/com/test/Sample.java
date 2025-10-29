package com.test;

public class Sample {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    private void solairaj() {
		System.out.println("Raj");
	}

    public static void main(String[] args) {
        System.out.println("Sum: " + add(5, 3));
        System.out.println("Difference: " + subtract(5, 3));
    }
}

