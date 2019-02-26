import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna"};
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        String input_name = keyboard.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length && !isExist; i++) {
            if (student[i].equals(input_name)) {
                System.out.println("Position of the student in the list is " + (i + 1));
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + input_name + " in the list");
        }
    }
}
