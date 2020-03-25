package Validator;

public class EmailValidator {
    //for checking email
    public boolean isEmailValid(String input){
        if(input == null){
            return false;
        }
        return input.matches("\\w+@\\w+\\.\\w+");
    }
}
