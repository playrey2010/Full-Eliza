import java.util.Scanner;

public class SimpleEliza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String problem = "";

        System.out.print("Good day. What is your problem?\n");
        while (!(problem.equalsIgnoreCase("I am feeling great")) && !problem.equalsIgnoreCase("q")) {
            System.out.print("Enter your response here or Q to quit: ");
            problem = sc.nextLine();
            if (problem.equalsIgnoreCase("q") || problem.equalsIgnoreCase("I am feeling great")) {
                break;
            }
            System.out.println(problem);
        }
    }
}
