package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import common.HelloCalc;

public class Client {

    private Client() {
    }

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            HelloCalc stub = (HelloCalc) registry.lookup("HelloCalc");
            scanner = new Scanner(System.in);

            String input;
            do {
                System.out.println("Enter the operation (example: 3*9) or 'S' to exit:");
                input = scanner.nextLine();

                input = input.replace(',', '.');

                if (input.equalsIgnoreCase("s")) {
                    break;
                }

                try {
                    // Using regular expression to split the string based on the operators
                    String[] parts = input.split("(?<=\\d)(?=[^\\.\\d])|(?<=[^\\.\\d])(?=\\d)");

                    double a = Double.parseDouble(parts[0]);
                    String operator = parts[1];
                    double b = Double.parseDouble(parts[2]);
                    double result = 0;

                    switch (operator) {
                        case "+":
                            result = stub.add(a, b);
                            break;
                        case "-":
                            result = stub.subtract(a, b);
                            break;
                        case "*":
                            result = stub.multiply(a, b);
                            break;
                        case "/":
                            if (b == 0) {
                                System.out.println("Error: Division by zero.");
                                continue;
                            }
                            result = stub.divide(a, b);
                            break;
                        default:
                            System.out.println("Invalid operator is: '" + operator + "'.");
                            continue;
                    }

                    System.out.println("Result = " + result);
                } catch (NumberFormatException e) {
                    System.out.println("Number format error: " + e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Input error: please ensure to enter a valid operation.");
                }

            } while (true);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
