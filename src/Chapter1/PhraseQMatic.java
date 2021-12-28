package Chapter1;

import java.util.Objects;
import java.util.Scanner;

public class PhraseQMatic {
    public static void main(String[] args) {
        String[] wordOne = {
                "Привет","hello","dog","cat"
        };
        String[] wordTwo = {
                "market","store","java","js"
        };
        String[] wordThree = {
                "react","angular","redux","flutter"
        };
        int oneLength = wordOne.length;
        int twoLength = wordTwo.length;
        int threeLength = wordThree.length;


        Scanner scanner = new Scanner(System.in);
        while (true){
            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);

            String phrase = wordOne[rand1] + " "+ wordTwo[rand2] + " " + wordThree[rand3];
            System.out.println(phrase);
            String key =  scanner.nextLine();
            if (Objects.equals(key, "exit")){
                System.out.println("Пока ");
                break;
            }
        }
    }
}
