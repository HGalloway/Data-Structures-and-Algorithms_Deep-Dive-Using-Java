import java.util.Scanner;

/*
 * Simple little program to see Big O Notation first hand using the example of putting sugar into tea.
 */

public class SugarInTea {
    private static int howManySteps = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many sugars?");
        int howManySugars = scanner.nextInt();
        
        getBowl();
        getSpoon();
        for (int i = 0; i < howManySugars; i++) {
            scoopSugar();
            pourSugar();
        }
        
        System.out.println("Total Steps: " + howManySteps);
    }

    private static void addStepToCount() {
        howManySteps++;
    }

    private static void getBowl() {
        System.out.println("Got Bowl!");
        addStepToCount();
    }

    private static void getSpoon() {
        System.out.println("Got Spoon!");
        addStepToCount();
    }

    private static void scoopSugar() {
        System.out.println("Scooped the sugar! It's now on the spoon.");
        addStepToCount();
    }

    private static void pourSugar() {
        System.out.println("Poured the sugar in the tea!");
        addStepToCount();
    }
}