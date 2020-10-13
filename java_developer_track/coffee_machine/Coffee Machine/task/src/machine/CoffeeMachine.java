package machine;

import java.util.Scanner;

public class CoffeeMachine {
    // Menu Enumerations
    enum Menu {
        BUY, FILL, TAKE, REMAINING, EXIT
    }

    // Variables
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    static Menu menu;
    static Scanner scanner = new Scanner(System.in);

    // Convert userInput to one of the menu options
    public static void menuSelection(String userInput) {
        menu = Menu.valueOf(userInput.toUpperCase());
    }

    // print the main menu
    public static void printMenu() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        menuSelection(scanner.nextLine());
        System.out.println();
    }

    // Print the ingredients of the coffee machine
    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();
    }

    // Take all the money in the register
    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();
    }

    // Fill the CoffeeMachine with ingredients
    public static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        water += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many ml of milk do you want to add:");
        milk += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += Integer.parseInt(scanner.nextLine());
        System.out.println();
    }

    // Buy a coffee from the CoffeeMachine
    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String selection = scanner.nextLine();
        switch (selection) {
            case "1":
                if (water >= 250 && beans >= 16 && cups >= 1) {
                    System.out.println("I have enough resources, making you an espresso!");
                    System.out.println();
                    water -= 250;
                    beans -= 16;
                    money += 4;
                    cups -= 1;
                } else {
                    System.out.println("Sorry not enough resources to make you an espresso.");
                    System.out.println();
                }
                break;
            case "2":
                if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                    System.out.println("I have enough resources, making you a latte!");
                    System.out.println();
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups -= 1;
                    money += 7;
                } else {
                    System.out.println("Sorry not enough resources to make you a latte.");
                    System.out.println();
                }
                break;
            case "3":
                if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                    System.out.println("I have enough resources, making you a cappuccino!");
                    System.out.println();
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups -= 1;
                    money += 6;
                } else {
                    System.out.println("Sorry not enough resources to make you a cappuccino.");
                    System.out.println();
                }
                break;
            default:
                System.out.println();
                break;
        }
    }

    // Run the CoffeeMachine
    public static void powerOnCoffeeMachine() {
        while (true) {
            // Collect user input
            printMenu();

            // If "exit" = break the loop
            if (menu == Menu.EXIT) {
                break;
            }

            // If "buy" = Buy a coffee
            if (menu == Menu.BUY) {
                buy();
            }

            // If "take" = Take all the money in the register
            if (menu == Menu.TAKE) {
                take();
            }

            // If "fill" = Fill the coffee machine
            if (menu == Menu.FILL) {
                fill();
            }

            // If "remaining" = Print the remaining ingredients in the coffee machine
            if (menu == Menu.REMAINING) {
                remaining();
            }
        }
    }

    // main method
    public static void main(String[] args) {
        powerOnCoffeeMachine();
    }
}


// Task #5
//    // Print the remaining ingredients in the coffee machine
//    private static void printCoffeeMachineIngredients(int water, int milk, int beans, int cups, int money) {
//        System.out.println("The coffee machine has:");
//        System.out.println(water + " of water");
//        System.out.println(milk + " of milk");
//        System.out.println(beans + " of coffee beans");
//        System.out.println(cups + " of disposable cups");
//        System.out.println(money + " of money");
//    }
//}
//
//// Loop for the coffee machine
//        while (true) {
//        System.out.println("Write action (buy, fill, take, remaining, exit):");
//        String userInput = scanner.nextLine();
//        System.out.println();
//
//        // exit; stop the program
//        if (userInput.equals("exit")) {
//            break;
//        }
//
//        // buy; buy a cup of coffee
//        if (userInput.equals("buy")) {
//            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
//            String selection = scanner.nextLine();
//            if (selection.equals("1")) {
//                if (water >= 250 && beans >= 16 && cups >= 1) {
//                    System.out.println("I have enough resources, making you an espresso!");
//                    water -= 250;
//                    beans -= 16;
//                    money += 4;
//                    cups -= 1;
//                } else {
//                    System.out.println("Sorry not enough resources to make you an espresso.");
//                }
//            } else if (selection.equals("2")) {
//                if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
//                    System.out.println("I have enough resources, making you a latte!");
//                    water -= 350;
//                    milk -= 75;
//                    beans -= 20;
//                    cups -= 1;
//                    money += 7;
//                } else {
//                    System.out.println("Sorry not enough resources to make you a latte.");
//                }
//            } else if (selection.equals("3")) {
//                if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
//                    System.out.println("I have enough resources, making you a cappuccino!");
//                    water -= 200;
//                    milk -= 100;
//                    beans -= 12;
//                    cups -= 1;
//                    money += 6;
//                }
//            } else {
//                System.out.println();
//            }
//        }
//
//        // fill; fill the coffee machine
//        if (userInput.equals("fill")) {
//            System.out.println("Write how many ml of water do you want to add:");
//            water += scanner.nextInt();
//            System.out.println("Write how many ml of milk do you want to add:");
//            milk += scanner.nextInt();
//            System.out.println("Write how many grams of coffee beans do you want to add:");
//            beans += scanner.nextInt();
//            System.out.println("Write how many disposable cups of coffee do you want to add:");
//            cups += scanner.nextInt();
//            System.out.println();
//        }
//
//        // take; take the money in the coffee machine
//        if (userInput.equals("take")) {
//            System.out.println("I gave you $" + money);
//            money = 0;
//            System.out.println();
//        }
//
//        // remaining; print the remaining ingredients
//        if (userInput.equals("remaining")) {
//            printCoffeeMachineIngredients(water, milk, beans, cups, money);
//        }
//    }
//}
//
//    // Print the remaining ingredients in the coffee machine
//    private static void printCoffeeMachineIngredients(int water, int milk, int beans, int cups, int money) {
//        System.out.println("The coffee machine has:");
//        System.out.println(water + " of water");
//        System.out.println(milk + " of milk");
//        System.out.println(beans + " of coffee beans");
//        System.out.println(cups + " of disposable cups");
//        System.out.println(money + " of money");
//    }

// Part #4
//        // Gather the user input from the user
//        System.out.println("Write how many ml of water the coffee machine has:");
//        int water = scanner.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        int milk = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        int beans = scanner.nextInt();
//        System.out.println("Write how many cups of coffee you will need:");
//        int cupsOfCoffee = scanner.nextInt();
//
//        // Calculate the maximum cups of coffee you can make with the given ingredients
//        int cupsWaterMaximum = water / 200;
//        int cupsMilkMaximum = milk / 50;
//        int cupsBeansMaximum = beans / 15;
//        int maximumCupsOfCoffee = 0;
//        if (cupsWaterMaximum < cupsMilkMaximum) {
//            if (cupsWaterMaximum < cupsBeansMaximum) {
//                maximumCupsOfCoffee = cupsWaterMaximum;
//            } else {
//                maximumCupsOfCoffee = cupsBeansMaximum;
//            }
//        } else {
//            if (cupsMilkMaximum < cupsBeansMaximum) {
//                maximumCupsOfCoffee = cupsMilkMaximum;
//            } else {
//                maximumCupsOfCoffee = cupsBeansMaximum;
//            }
//        }
//
//        // Output the result
//        if (cupsOfCoffee == maximumCupsOfCoffee) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (maximumCupsOfCoffee > cupsOfCoffee) {
//            System.out.println("Yes, I can make that amount of coffee (and even " +
//                    (maximumCupsOfCoffee - cupsOfCoffee) + " more than that)");
//        } else {
//            System.out.println("No, I can make only " + maximumCupsOfCoffee + " cup(s) of coffee");
//        }

// Print the contents of the coffee machine
//        printCoffeeMachineIngredients(water, milk, beans, cups, money);
//
//                // Take a user action
//                System.out.println("Write action (buy, fill, take):");
//                String userInput = scanner.nextLine();
//
//                // Perform the action requested
//                switch (userInput) {
//                case "buy":
//                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
//                int number = scanner.nextInt();
//                System.out.println();
//                System.out.println("The coffee machine has:");
//                if (number == 1) {
//                // espresso logic
//                System.out.println((water - 250) + " of water");
//                System.out.println(milk + " of milk");
//                System.out.println((beans - 16) + " of coffee beans");
//                System.out.println((cups - 1) + " of disposable cups");
//                System.out.println((money + 4) + " of money");
//                } else if (number == 2) {
//                // latte logic
//                System.out.println((water - 350) + " of water");
//                System.out.println((milk - 75) + " of milk");
//                System.out.println((beans - 20) + " of coffee beans");
//                System.out.println((cups - 1) + " of disposable cups");
//                System.out.println((money + 7) + " of money");
//                } else {
//                // cappuccino logic
//                System.out.println((water - 200) + " of water");
//                System.out.println((milk - 100) + " of milk");
//                System.out.println((beans - 12) + " of coffee beans");
//                System.out.println((cups - 1) + " of disposable cups");
//                System.out.println((money + 6) + " of money");
//                }
//                break;
//                case "fill":
//                // fill logic
//                System.out.println("Write how many ml of water do you want to add:");
//                int addWater = scanner.nextInt();
//                System.out.println("Write how many ml of milk do you want to add:");
//                int addMilk = scanner.nextInt();
//                System.out.println("Write how many grams of coffee beans do you want to add:");
//                int addBeans = scanner.nextInt();
//                System.out.println("Write how many disposable cups of coffee do you want to add:");
//                int addCups = scanner.nextInt();
//                System.out.println();
//                System.out.println("The coffee machine has:");
//                System.out.println((water + addWater) + " of water");
//                System.out.println((milk + addMilk) + " of milk");
//                System.out.println((beans + addBeans) + " of coffee beans");
//                System.out.println((cups + addCups) + " of disposable cups");
//                System.out.println(money + " of money");
//                break;
//default:
//        // take logic
//        System.out.println("I game you $550");
//        System.out.println();
//        System.out.println(water + " of water");
//        System.out.println(milk + " of milk");
//        System.out.println(beans + " of coffee beans");
//        System.out.println(cups + " of disposable cups");
//        System.out.println("0 of money");
//        break;