import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guestList = new ArrayList<>();

        while (true) {
            System.out.println("Do you want to add a new guest? ");
            System.out.println("1 - yes ");
            System.out.println("0 - no ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                System.out.println("Who is your guest? ");
                String guestName = scanner.next();
                guestList.add(guestName);
            }
        }


        while (guestList.isEmpty() == false) {

            System.out.println("Who is it?");
            String inputName = scanner.nextLine();

            if (guestList.contains(inputName)) {
                System.out.println("Welcome!");
                guestList.remove(inputName);
            } else {
                System.out.println("MRS!");
            }
        }

    }
}