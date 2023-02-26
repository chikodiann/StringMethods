package org.example;

public class StringBuilderSample {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        //an attempt to mutate a string
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        //an attempt to mutate a stringBuilder
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        //an attempt to increase the storage capacity
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        //an attempt to increase the storage capacity
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        System.out.println();
        System.out.println("*".repeat(40));

        //attempt to delete from a stringBuilder
        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        //let us delete the big"G" and replace it with a small"g"
        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        //first find the index
        System.out.println(builderPlus.indexOf("g"));
        //now let's replace without deleting anything
        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        //now let's look at reverse method... this prints the string in reverse mode;
        builderPlus.reverse();
        System.out.println(builderPlus);

        //finally setLength method is used to truncate the stringBuilder to the number of characters specified;
        builderPlus.setLength(7);
        System.out.println(builderPlus);
    }
    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
