import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[]args) {
        Scanner keybd = new Scanner(System.in);
        boolean redEyes = false;
        String answer;

        System.out.println("Are you eyes red? ");
        answer = keybd.nextLine();

        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            System.out.println("Then get some sleep!");
        } else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")){
            System.out.println("You look great!");
        }
    }

}

