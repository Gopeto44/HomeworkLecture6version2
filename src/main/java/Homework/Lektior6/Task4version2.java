package Homework.Lektior6;

import java.util.Scanner;

public class Task4version2 {
    public static void main (String args []){
        //Напишете програма/ метод, която чете число от 1 до 7 в конзолата (или се приема като параметър на метод)
        // и на базата на това изписва в конзолата деня от седмицата във формат:
        //You have selected 1. Day of the week is Monday.
        Scanner keybord = new Scanner(System.in);
        System.out.println("Enter number");
        int dayOfTheWeek = keybord.nextInt();
        switch (dayOfTheWeek){
            case 1:
                System.out.println("You have selected 1. Day of the week is Monday.");
                break;
            case 2:
                System.out.println("You have selected 2. Day of the week is Tuesday.");
            break;
            case 3:
                System.out.println("You have selected 3. Day of the week is Wednesday.");
            break;
            case 4:
                System.out.println("You have selected 4. Day of the week is Thursday.");
                break;
            case 5:
                System.out.println("You have selected 5. Day of the week is Friday.");
                break;
            case 6:
                System.out.println("You have selected 6. Day of the week is Saturday.");
                break;
            case 7:
                System.out.println("You have selected 7. Day of the week is Sunday.");
                break;
            default:
                System.out.println("There is no such day");
                break;

        }

    }
}
