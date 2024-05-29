import java.util.*;

class airline_reservation{
    static int seats[] = new int[11];
    static Scanner  sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Indian Airlines: ");

        while (true) {
            System.out.println("Please select an option: ");
            System.out.println("1: View available seats: ");
            System.out.println("2: Reserve Seats: ");
            System.out.println("3: Exit ");
            int choice  = sc.nextInt();

            switch (choice) {
                case 1:
                    displaySeats();
                    break;
                case 2:
                    reserveSeats();
                    break;
                case 3:
                    System.out.println("Thank you for using Indian lines:");
                    System.exit(0);
            }
        }
    }
        public static void displaySeats(){
            System.out.println("Seats: ");
            for(int i=1;i<=10; i++){
                System.out.println("Seat "+ i + ":"+(seats[i] == 0 ? "Available" : "Reserved"));
            }
        }
        public static void reserveSeats(){
            
            System.out.println(" Enter the seat no. to reserve: ");
            int seat = sc.nextInt();
            if(seats[seat] == 0){
                seats[seat] = 1;
                System.out.println("Seat "+ seat+ " reserved sucessfully");
            }
            else{
                System.out.println("seat" + seat+ "is already reserved");
            }
        }
    }