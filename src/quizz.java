
import javax.swing.*;
import java.awt.*;

import java.util.Scanner;

    public class quizz {

        public static void main(String[] args) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            Scanner input = new Scanner(System.in);
            System.out.print("Vad blir " + number1 + " + " + number2 + " : ");
            int answer = input.nextInt();
            int count = 1;
            do {

                if (number1 + number2 != answer) {
                    System.out.print("Fel svar, försök igen" + number1 + " + " + number2 + " : ");
                    answer = input.nextInt();
                } else{
                    System.out.println("Rätt svar");
                    break;
                }
                count++;
            } while (count < 3);
            System.out.println("Nu är du klar ");

        }

    }
