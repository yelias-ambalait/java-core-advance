package string;

import java.util.Arrays;

public class String_Built_In_Methods {
    public static void main(String[] args) {
        String name = "United States Of Emirates.";
        String shortName = "    - UAE World      ";
        String number = "25";


//#01        charAt() is used to find the character of a string according to the index.
        System.out.println("Character index: "+name.charAt(7)); //output: S

//#02        concat() is used to concat two strings
        System.out.println("Concatenated strings: "+name.concat(shortName)); //output: United States Of Emirates - UAE

//#03        equalIgnoreCase() is used to compare two strings ignoring the case.
        System.out.println("EqualIgnoreCase: "+shortName.equalsIgnoreCase(" - uae")); //output: true
        System.out.println("EqualIgnoreCase: "+name.equalsIgnoreCase("united states of emirates")); //output: true

//#04        length() method is used to find the length of strings.
        System.out.println("Length of name: "+name.length()); //output: 25
        System.out.println("Length of number: "+number.length()); //output: 2

//#05        replace() is used to replace characters of the string
        System.out.println("Replace: "+name.replace("Emirates", "America")); //output: United States Of America

//#06        substring() is used to return a part of string as a string using index numbers
        System.out.println("Substring: "+name.substring(7)); //output: States Of Emirates
        System.out.println("Substring: "+name.substring(7, 13)); //output: States

//#07        toLowerCase() is used to convert strings into lower case.
        System.out.println("Lower Case: "+name.toLowerCase());  //output: united states of emirates

//#08        toUpperCase() is used to convert strings into upper case
        System.out.println("Upper Case: "+name.toUpperCase()); //output: UNITED STATES OF EMIRATES

//#09        trim() method is used to remove the blank spaces.
        System.out.println("Before trim: "+shortName);
        System.out.println("Trim: "+shortName.trim()); //output:

//#10        toCharArray() method is used to produce an array from a string
        System.out.println("To Character Array: "+ Arrays.toString(name.toCharArray())); //output: [U, n, i, t, e, d,  , S, t, a, t, e, s,  , O, f,  , E, m, i, r, a, t, e, s]

//#11        contains() method is used to check whether searching string is available or not in the string.
        System.out.println("Contains: "+name.contains("Emirates")); //output: true
        System.out.println("Contains: "+name.contains("America"));  //output: false

//#12        compareTo() method is used to compare two strings.
        System.out.println("CompareTo: "+name.compareTo("Of")); //output: 6 (+) integer if first string is greater than second string
        System.out.println("CompareTo: "+name.compareTo("United States Of Emirates")); //output: 0 if two strings are equal
        System.out.println("CompareTo: "+shortName.compareTo(name)); //output: -53 (-)integer if first string less than second string

//#13        isEmpty()
        System.out.println("Is empty: "+name.isEmpty());

//#14        split()
        System.out.println("Split: "+Arrays.toString(name.split(" ", 3)));

//#15        startsWith()
        System.out.println("Start with: "+name.startsWith("United"));

//#16        endsWith()
        System.out.println("End with: "+name.endsWith("."));

//#17        indexOf()
        System.out.println("Index of: "+name.indexOf(7));
        System.out.println("Index of: "+name.indexOf("S"));
        System.out.println("Index of: "+name.indexOf("S", 2));

    }
}
