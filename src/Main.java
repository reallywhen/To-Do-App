import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        toDoLister();




    }

    public static void toDoLister () {

        System.out.println("Please enter your list of thing you have to-do");

        Scanner toDoInput = new Scanner(System.in);
        String task1 = toDoInput.nextLine();
        String task2 = toDoInput.nextLine();
        System.out.println("Your tasks are;" + task1 + "," + task2 + ".");


    }

    public static void inputReader() {

        System.out.printf("Please enter two integers to add.");


        Scanner inputReader = new Scanner(System.in);
        String name1 = inputReader.nextLine();
        String name2 = inputReader.nextLine();
        System.out.println((String) name2 + name1);

    }
}
