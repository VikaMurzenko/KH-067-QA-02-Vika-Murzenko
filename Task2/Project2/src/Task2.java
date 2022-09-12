import java.util.Scanner;
import java.util.ArrayList;
public class Task2 {

    public static ArrayList<String> getWordByLengthNumber(int lengthNumber, String[] words) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i=0; i<words.length; i++) {
            if (words[i].length()==lengthNumber) {
                result.add(words[i]);
            }
        }
        return result;


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x = "Ukraine,Poland,Germany";
        String[] splitResult = x.split(",");
        System.out.println(splitResult[0]);
        System.out.println(splitResult[1]);
        System.out.println(splitResult[2]);


        System.out.println("\nChoose the number!");
        String variant = "1 - maximum length,\n2 - start with,\n3 - end with,\n4 - contains,\n0 - exit\n ";
        System.out.println(variant);
        int number = scanner.nextInt();

        System.out.println("Your choice is " + number);

        switch (number) {
            case 1:
                System.out.println("Type word length number: ");
                int lengthNumber = scanner.nextInt();
                ArrayList<String> result = getWordByLengthNumber(lengthNumber, splitResult);
                if (result.size() > 0) {
                    for (int i = 0; i < result.size(); i++) {
                        System.out.println(result.get(i));
                    }
                } else {
                    System.out.println("The word isn't found.");
                }
                break;
            case 2:
                System.out.println("Starts with:");
                break;
            case 3:
                System.out.println("Ends with:");
                break;
            case 4:
                System.out.println("Contains:");
                break;
            case 0:
                return;
        }

    }
}
