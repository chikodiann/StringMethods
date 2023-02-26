package org.example;

public class AllAboutStrings {
    public static void main(String[] args) {

        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l')); //will give the position of the first l
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l')); //will give the position of the last l

        //if we want to find the 2nd l's position, here are 2 methods to find it
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        //STRING COMPARISON METHODS
        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match, ignoring case");
        }
        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("Hello")) {
            System.out.println("String contains with Hello");
        }
        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }


    }
    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if (string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        if (string.isBlank()){
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length-1));

    }
}

