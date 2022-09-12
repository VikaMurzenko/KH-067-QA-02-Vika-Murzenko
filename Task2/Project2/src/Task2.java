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

    public static ArrayList<String> getWordByStartWith(Character startWithLetter, String[] words) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i=0; i<words.length; i++) {
            if (words[i].charAt(0)==startWithLetter) {
                result.add(words[i]);
            }
        }
        return result;
    }

    public static ArrayList<String> getWordByEndWith(Character endWithLetter, String[] words) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i=0; i<words.length; i++) {
            if (words[i].charAt(words[i].length()-1)==endWithLetter) {
                result.add(words[i]);
            }
        }
        return result;
    }

    public static ArrayList<String> getWordBySearchWord(String searchWord, String[] words) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i=0; i<words.length; i++) {
            if (words[i].contains(searchWord)) {
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
                System.out.println("Words start with letters:");
                String letter = scanner.next();

                ArrayList<String> resultStartWith = getWordByStartWith(letter.charAt(0), splitResult);
                if (resultStartWith.size() > 0) {
                    for (int i = 0; i < resultStartWith.size(); i++) {
                        System.out.println(resultStartWith.get(i));
                    }
                } else {
                    System.out.println("The word isn't found.");
                }

                break;
            case 3:
                System.out.println("Words ends with letters:");
                String letterEndWith = scanner.next();

                ArrayList<String> resultEndWith = getWordByEndWith(letterEndWith.charAt(0), splitResult);
                if (resultEndWith.size() > 0) {
                    for (int i = 0; i < resultEndWith.size(); i++) {
                        System.out.println(resultEndWith.get(i));
                    }
                } else {
                    System.out.println("The word isn't found.");
                }
                break;
            case 4:
                System.out.println("Words contain letters:");
                String searchWord = scanner.next();

                ArrayList<String> resultOfContain = getWordBySearchWord(searchWord, splitResult);
                if (resultOfContain.size() > 0) {
                    for (int i = 0; i < resultOfContain.size(); i++) {
                        System.out.println(resultOfContain.get(i));
                    }
                } else {
                    System.out.println("The word isn't found.");
                }

                break;
            case 0:
                System.out.println("Exit!");
                return;
        }

    }
}

