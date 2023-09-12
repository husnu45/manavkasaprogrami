
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner getDataFromUser = new Scanner(System.in);

        double pear = 2.14 , apple = 3.68 , tomato = 1.11 , banana = 0.95 , eggplant = 5.00;
        
        System.out.print("Enter the kilogram of Pear :  ");
        
        double pearKG = getDataFromUser.nextDouble();
        
        System.out.print("Enter the kilogram of Apple :  ");
        
        double appleKG = getDataFromUser.nextDouble();
        
        System.out.print("Enter the kilogram of Tomato :  ");
        
        double tomatoKG = getDataFromUser.nextDouble();
        
        System.out.print("Enter the kilogram of Banana :  ");
        
        double bananaKG = getDataFromUser.nextDouble();
        
        System.out.print("Enter the kilogram of Eggplant :  ");
        
        double eggplantKG = getDataFromUser.nextDouble();
        
        
        double totalAmount = ((pear * pearKG) + (apple * appleKG) + (tomato * tomatoKG) + (banana * bananaKG) + (eggplant * eggplantKG));
        
        System.out.println("Amount You Have to Pay is : " + totalAmount);
        
        System.out.println("Thank you for shopping us.Have a nice day !!!");
        
        
        
    }
    
}
