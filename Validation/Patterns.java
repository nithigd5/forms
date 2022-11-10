package Validation;

import java.util.regex.Pattern;

public class Patterns {
    final static Pattern EMAIL_PATTERN = Pattern.compile("([^0-9][a-zA-z0-9]+)@([a-z]+).([a-z]{3})");
    
    final static Pattern PHONE_PATTERN = Pattern.compile("[6-9][0-9]{9}");

    
}
