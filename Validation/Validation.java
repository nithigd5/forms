package Validation;
import java.util.regex.Matcher;
//Validates any Form with given Rules
public class Validation<T> {
    private final Rule rule;
    private T value;

    public Validation(Rule rule, T value) {
        this.rule = rule;
        this.value = value;
    }

    public boolean validate(){


        if(this.rule.type == Type.EMAIL) return emailValidate((String)value);


        if(this.rule.type == Type.PHONE) return phoneValidate((String)value);

        
        return false;
    }


    
    private boolean phoneValidate(String phone) {
        final Matcher matcher = Patterns.PHONE_PATTERN.matcher(phone);
        return matcher.find();
    }

    public boolean emailValidate(String email){
        final Matcher matcher = Patterns.EMAIL_PATTERN.matcher(email);
        return matcher.find();
    }





}
