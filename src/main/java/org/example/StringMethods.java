package org.example;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = "+ startingIndex);
        System.out.println("Birth year = "+ birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11","1982");
        System.out.println("newDate = " + newDate);

        //another way to write this is;
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        //another way to write this is;
        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);

        //another way to write it will be METHOD CHAINING, like this...
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        //replace
        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));

        System.out.println("*".repeat(30));
        System.out.println(newDate.replaceFirst("/", "-")); //this will replace only the first occurrence
        System.out.println(newDate.replaceAll("/", "---"));

        //repeat
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        //indent
        System.out.println("ABC\n".repeat(3).indent(8)); //use indent to add spaces to a textblock
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));  // use negative indent to remove spaces
        System.out.println("-".repeat(20));

    }
}
