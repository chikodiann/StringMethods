package org.example;

public class TextBlockSample {
    public static void main(String[] args) {
        //old way of doing things
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);



        System.out.println("********************");
        System.out.println();
        //TextBlock format
        String textBlock = """
                Print a Bulleted List:
                            \u2022 First Point
                                \u2022 Sub Point
                                """;
        System.out.println(textBlock);

        System.out.println();
        int age = 27;
        System.out.printf("Your age is %d\n", age);
        System.out.format("");

        int yearOfBirth = 2023 - age;
        System.out.printf("Age %d, Birth year = %d", age, yearOfBirth);
    }


}
