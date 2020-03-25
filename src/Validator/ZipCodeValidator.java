package Validator;

public class ZipCodeValidator {

    //for checking danish zip codes
    public boolean isZipCodeValid(String input) {
        if(input == null){
            return false;
        }
        if (input.matches("\\d{4}")) {
            try {
                int i = Integer.parseInt(input);
                //match possible zipcodes in dk
                if (i>555 && i<9999){
                    return true;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }


}
