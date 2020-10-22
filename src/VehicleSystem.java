
import java.util.Scanner;

public class VehicleSystem {

    public static void main(String [] args){
        int i=0;
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        StreetRacer street=new StreetRacer();
        FormulaOne f1=new FormulaOne();
        Aircraft aircraft=new Aircraft();

        while(i!=4) {
            System.out.println("Type 1 for StreetRacer, 2 for FormulaOne, 3 for AirCraft, 4 to exit: ");
            i=input.nextInt();

            //print default behavior for vehicle
            if(i==1) {
                street.Display();
                street.performMove();
            }
            else if(i==2){
                f1.Display();
                f1.performMove();
            }
            else if(i==3){
                aircraft.Display();
                aircraft.performMove();
            }
            else {
                System.out.println("Invalid choice of type of vehicle. Try again");
            }

            while(i==1){
                System.out.println();
                System.out.println("Type 1 if you want me to drive, 2 to fly, 3 to exit choosing my moving behavior: ");
                int inputbehavior=input.nextInt();
                if(inputbehavior==1){
                    street.Display();
                    street.setBehavior(new Driving());
                    street.performMove();
                }
                else if(inputbehavior==2){
                    street.Display();
                    System.out.print("I cant fly");
                }
                else if(inputbehavior==3){
                    i=0;//
                }
                else {
                    System.out.println("Invalid choice of behavior. Try again");
                }
            }

            while(i==2){
                System.out.println();
                System.out.println("Type 1 if you want me to drive, 2 to fly, 3 to exit choosing my moving behavior: ");
                int inputbehavior=input.nextInt();
                if(inputbehavior==1){
                    f1.Display();
                    f1.setBehavior(new Driving());
                    f1.performMove();
                }
                else if(inputbehavior==2){
                    f1.Display();
                    System.out.print("I cant fly");

                }
                else if(inputbehavior==3){
                    i=0;//
                }
                else {
                    System.out.println("Invalid choice of behavior. Try again");
                }

            }

            while(i==3){
                System.out.println();
                System.out.println("Type 1 if you want me to drive, 2 to fly, 3 to exit choosing my moving behavior: ");
                int inputbehavior=input.nextInt();
                if(inputbehavior==1){
                    aircraft.Display();
                    aircraft.setBehavior(new Driving());
                    aircraft.performMove();
                }
                else if(inputbehavior==2){
                    aircraft.Display();
                    aircraft.setBehavior(new Flying());
                    aircraft.performMove();

                }
                else if(inputbehavior==3){
                    i=0;//
                }
                else {
                    System.out.println("Invalid choice of behavior. Try again");
                }
            }




        }


    }
}
