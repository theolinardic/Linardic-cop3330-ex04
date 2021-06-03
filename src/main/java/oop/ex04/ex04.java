package oop.ex04;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args)
    {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String userNoun = userInputScanner.nextLine();
        System.out.print("Enter a verb: ");
        String userVerb = userInputScanner.nextLine();
        System.out.print("Enter an adjective: ");
        String userAdjective = userInputScanner.nextLine();
        System.out.print("Enter an adverb: ");
        String userAdverb = userInputScanner.nextLine();

        System.out.print("Every day I " + userVerb + " my " + userAdjective + " " + userNoun + " " + userAdverb + ".");
    }
}
