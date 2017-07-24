package HeadorTail;

import java.util.Scanner;




    public class ViewH_T {

        Scanner sc = new Scanner(System.in);

        void showMenu() {

            System.out.println("\n\t\tMain menu");
            System.out.println("Please select:");
            System.out.println("1 - Heads or Tails.");
            System.out.println("2 - Exit.");
            
            System.out.print("Enter: ");
            controller.handlerMenu(sc.next());

        }

        int numberOfShots() {
            System.out.print("\nEnter please the number of shots: ");
            return sc.nextInt();
        }

        void showResultDropCoins(int res[]) {
            System.out.println("Dropped heads - " + res[0]);
            System.out.println("Dropped tails - " + res[1]);
        }

    }

