import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Switch {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice :");
        int choice = scan.nextInt();
        String token = switch(choice){
            case 1 -> "Thank you for Booking";
            case 2 -> "Status : booked";
            case 3 -> "Ticket got cancelled ";
            case 4 -> "bye";
            default -> {
                System.err.println("invalid choice");
                yield "";
            }

        };
        System.out.println(token);

    }
}
