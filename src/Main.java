import java.util.ArrayList;
import java.util.Scanner;
// thinl about how            to delete AFTER making sure it works in ALL circumstances
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<String> toDoStorage = new ArrayList<>();
    static Scanner toDoInput = new Scanner(System.in);
    static int nullStopper = 0;
    static String NextStep = "x";

    public static void main(String[] args) {
        for (var i = 0; i < i + 1; i++) {
            System.out.println("Would you like to Add, View, or Delete?");
            NextStep = toDoInput.nextLine();
            if (NextStep.equals("add")) {
                toDoLister();
            }
            if (NextStep.equals("view")) {
                System.out.println("All tasks below");

                for (var j = 0; j < toDoStorage.size(); j++) {
                    System.out.println("-" + toDoStorage.get(j));
                }
            }
            if (NextStep.equals("delete")) {
                int desireDelete = 0;
                System.out.println("All tasks below");

                for (var j = 0; j < toDoStorage.size(); j++) {
                    System.out.println( j + "-" + toDoStorage.get(j));
                }
                System.out.println("Enter the # of the object on the list below which you would like to delete.");
                  desireDelete = Integer.parseInt(toDoInput.nextLine());
                if (desireDelete >= 0 && desireDelete < toDoStorage.size()){
                    toDoStorage.remove(desireDelete);

                }
                System.out.println("Updated Task List Below:");
                for (var j = 0; j < toDoStorage.size(); j++) {
                    System.out.println("-" + toDoStorage.get(j));
                }

            }
        }

    }

    public static void toDoLister () {




        for (var i = nullStopper; i < i+1 ; i = nullStopper){

            System.out.println("Please enter a thing you have to-do");

            toDoStorage.add(toDoInput.nextLine());
            nullStopper++;
            System.out.println("Would you like to enter any more tasks? Enter \"yes\" or \"no\" if not.");
            if (toDoInput.nextLine().equals("no")){
                break;
            }

        }


        System.out.println("All tasks below");

        for (var i = 0; i < toDoStorage.size(); i++) {
            System.out.println("-"+toDoStorage.get(i));
        }



    }


}
