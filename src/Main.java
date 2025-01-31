import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String[] toDoStorage = new String[100];
    static Scanner toDoInput = new Scanner(System.in);
    static int nullStopper = 0;
    public static void main(String[] args) {
       for(var i = 0; i < i + 1; i++) {
           toDoLister();
       }


    }

    public static void toDoLister () {


        System.out.println("Please enter a thing you have to-do");

        for (var i = nullStopper; i < toDoStorage.length;i = nullStopper){


            toDoStorage[i] = toDoInput.nextLine();
            nullStopper++;
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


}
