import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) throws Exception {
        

        String name;
        byte age;
        double height;
        double weight;
        int jersey_number;

        Scanner sc = new Scanner(System.in);

        System.out.print("enter your name:");
        name = sc.nextLine();

        System.out.print("enter your age:");
        age = sc.nextByte();
        System.out.print("enter your height in meters:");
        height = sc.nextDouble();
        System.out.print("enter your weight in pounds:");
        weight = sc.nextDouble();

        System.out.print("enter your jersey number:");
        jersey_number = sc.nextInt();

       

        final int meter = 100;
        final double pound = 0.45359237;
        
        double weight_in_kg = weight * pound;
        double height_in_cm = height * meter;
        
        int rounded_height = (int)height_in_cm;
        int rounded_weight = (int)weight_in_kg;





        boolean maxage = age >= 18;
        boolean min_age = age <= 35;
        boolean min_weight = rounded_weight <= 90;
        String eligibility = "";
        if (maxage && min_age && min_weight == true ){
            eligibility = "Eligible";
        } else {
            eligibility = "Not Eligible";
        }


        String category = "";
        
        if (age<20 && age>18){
           
            category = "Rising Star";
        } else if (age>=20 && age <=30){
            
            category = "Prime Player";
        } else if (age>30){
            
            category = "Veteran";
        } 
        
        String position = "";
        String attacker = "No";
        switch (jersey_number) {
            case 1:
                position = "goalkeeper";
                break;
            
            case 2:
            case 3:
                position = "defender";
                break;
                
            case 4:
            case 5:
                position = "Central defender";
                break;
            case 6:
            case 8:
                position = "midfielder";
                break;  
            case 7:
            case 11:
                position = "Winger";
                attacker = "Yes";
                break;
            case 10:
                position = "Playmaker";
                break;
            case 9:
                position = "Striker";
                attacker = "Yes";
                break;  
            default:
                System.out.println("enter a valid player number");
                position = "N/A";
                break;
        }
        String decision = "";
        if  ("Prime Player".equals(category)) {   
            if (weight_in_kg < 80) {                  
                decision = "starting lineup.";
            } else { 
                decision = "the bench.";
            }
        } else {
            System.out.println("Player goes to the bench.");
        }
         String status = (category.equals("Prime Player") && weight_in_kg < 80) 
                        ? "Play" 
                        : "Rest";

        System.out.println("Player: "+ name);
        System.out.println("Age: "+ age + "," + category );
        System.out.println("Height: "+ rounded_height + "cm" );
        System.out.println("Weight: "+ rounded_weight + "kg");
        System.out.println("Jersey: "+ jersey_number);
        System.out.println("Position: "+ position);
        System.out.println("Attacker jersey: "+ attacker);
        System.out.println("Eligibility: "+ eligibility);
        System.out.println("Lineup Decision: "+ decision);
        System.out.println("Final Status: " + status);
    }
}
