package string.emailValidationExtraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();

        String email1 = "john_doe@example.com";
        String email2 = "jane.smith@company.org";
        String email3 = "invalid.email@com";

        System.out.println(email1+" : "+emailValidator.validateEmail(email1));
        System.out.println(email2+" : "+emailValidator.validateEmail(email2));
        System.out.println(email3+" : "+emailValidator.validateEmail(email3));


        System.out.println("\nExtracting domains: ");
        System.out.println(email1+" : "+emailValidator.extractDomain(email1));
        System.out.println(email2+" : "+emailValidator.extractDomain(email2));
        System.out.println(email3+" : "+emailValidator.extractDomain(email3));
    }
}
