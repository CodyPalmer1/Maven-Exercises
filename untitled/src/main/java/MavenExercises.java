import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MavenExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String test = StringUtils.upperCase("lowercase");
//        System.out.println(test);

        System.out.print("Enter something: ");
        String userInput = sc.nextLine();

        System.out.println("You entered: " + userInput);
        if(!StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is not a number");
        } else {
            System.out.println(userInput + " is a number");
        }

        String swap = StringUtils.swapCase(userInput);
        System.out.println("Flipped Case: " + swap);
        String reverse = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reverse);

    }
}
