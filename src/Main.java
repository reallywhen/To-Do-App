import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        toDoLister();


    }

    public static void toDoLister () {
        String[] toDoStorage = new String[3];
        Scanner toDoInput = new Scanner(System.in);
        int nullStopper = 0;

        System.out.println("Please enter a thing you have to-do");

        for (var i = 0; i < toDoStorage.length; i++){
            nullStopper = nullStopper + 1;
            System.out.println("looped");
            toDoStorage[i] = toDoInput.nextLine();
            System.out.println("Would you like to enter any more tasks? Enter \"yes\" or \"no\" if not.");
            if (toDoInput.nextLine().equals("no")){
                System.out.println("Your task(s) are to " + toDoStorage[i] + ".");
                break;
            }

        }


        System.out.println("All tasks below");
        for (var i = 0; i < nullStopper; i++) {
            System.out.println("-"+toDoStorage[i]);
        }



    }

   public static void reference (){
    System.out.println("Please enter a thing you have to-do");
    Scanner toDoInput = new Scanner(System.in);
    String task1 = toDoInput.nextLine();
        System.out.println("Would you like to enter any more tasks? Enter \"no\" if not.");
    String task2 = toDoInput.nextLine();
        if (task2.equals("no")) {
        System.out.println("Your singular task is to " + task1 + ".");



    }
        else {
        System.out.println("Your tasks are; " + task1 + ", " + task2 + ".");
    }
}
}
