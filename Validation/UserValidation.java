package Validation;

public class UserValidation {
    public Rule nameRule;
    public Rule ageRule;
    public Rule heightRule;
    public Rule sexRule;
    public Rule dobRule;

    public UserValidation(Rule nameRule, Rule ageRule, Rule heightRule, Rule sexRule, Rule dobRule) {
        this.nameRule = nameRule;
        this.ageRule = ageRule;
        this.heightRule = heightRule;
        this.sexRule = sexRule;
        this.dobRule = dobRule;
    }

    public boolean validate() {

        

        return true;
    }
}
