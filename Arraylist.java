import java.util.ArrayList;
import java.util.Scanner;


public class Car {
    public static void Method() {
        long StartTime = System.nanoTime();
        System.out.println("current time :"+ StartTime);
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Sedan");
        cars.add("SUV");
        cars.add("Hatchback");
        cars.add("MVP");

        System.out.println("Types of cars: " + cars);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of car: ");
        String type = scanner.nextLine();

        System.out.println("Car Type: " + type);
        int tyres = 0;
        int cc = 0;

        switch (type) {
            case "Sedan":
            tyres = 4;
            cc = 1000;
            break;
            case "SUV":
            tyres = 4;
            cc = 2000;
            break;
            case "Hatchback":
            tyres = 4;
            cc = 1200;
            break;
            case "MVP":
            tyres = 4;
            cc = 1800;
            break;
            default:
            System.out.println("ended.");
            break;
        }

        if (tyres != 0 && cc != 0) {
            System.out.println("Number of tyres: " + tyres);
            System.out.println("Engine capacity (cc): " + cc);
        }
        long EndTime = System.nanoTime();
        System.out.println("current time :"+ EndTime);

        long Duration = EndTime - StartTime;
        System.out.println("Operation duration :"+Duration);
    }
    

    
    public static void main(String[] args) {
        Method();
    }
}