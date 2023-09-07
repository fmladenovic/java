import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("How much is he? ");
            String name1 = scanner.nextLine();


            System.out.println("In love with? ");
            String name2 = scanner.nextLine();

            int percentage = random.nextInt(101);



            System.out.println(name1 + " " + name2 + " is " + percentage + "%" + " in love" );
        }
    }
}