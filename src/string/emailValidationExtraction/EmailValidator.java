package string.emailValidationExtraction;

public class EmailValidator {
    public boolean validateEmail(String email) {
        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".");
        if (atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length()-1) {
            return true;
        }
        return false;
    }
    public String extractDomain(String email) {
        int atIndex = email.indexOf("@");
        if(atIndex != -1 && atIndex < email.length() - 1) {
            return email.substring(atIndex+1);
        }
        return "Invalid email address";
    }
}
