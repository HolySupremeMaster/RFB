import java.sql.SQLException;
import java.util.Scanner;

public class RFBSystem {

    public static void main(String[] args) throws SQLException {
        boolean isRunning = true;
        Controller controller = new Controller();

        //bare en kommentar

        while(isRunning) {
            System.out.println("hey");


            System.out.println("\n 1. Opret barn \n 2. Indlæs alle børn \n 3. " +
                    "redigere barn \n 4. slet barn \n 5. Afslut");

            Scanner sc = new Scanner(System.in);
            int menuChoice = sc.nextInt();

            //Start menuen
            switch(menuChoice) {
                case 1:
                    controller.createChild();
                    break;
                case 2:
                    controller.readChildren();
                    break;
                case 3:
                    controller.updateChild();
                    break;
                case 4:
                    controller.deleteChild();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Der skete en fejl.");
                    isRunning = false;
                    break;
            }
        }
    }
}