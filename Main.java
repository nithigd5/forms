import java.util.Scanner;

import Validation.Type;
import Validation.Rule;
import data.forms.User;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user1 = new User();

        System.out.println("Name :");
        user1.name = sc.next();

        System.out.println("Age :");
        user1.age = sc.nextInt();

        System.out.println("Height :");
        user1.height = sc.nextFloat();

        System.out.println("Sex :");
        user1.sex = sc.next().charAt(0);

       
        sc.close();

        Rule nameRule = new Rule();
        nameRule.min = 3;
        nameRule.max = 50;
 
        Rule sexRule = new Rule();
        sexRule.setPattern("M|F|m|f");
        
        
    }
}
