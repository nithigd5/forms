package Validation;

import java.util.regex.Pattern;

//Creates Rule for validation
public class Rule {
    public Type type;
    public int min;
    public int max;
    public Pattern pattern;
    
    public void setPattern(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    boolean required;
}
