import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();
        int clientNumber = keyboard.keyboardNumber(new Scanner(System.in));
        System.out.println("My number is: " + clientNumber);

        PrimeFactor primeFactor = new PrimeFactor();

        List<Integer> list = primeFactor.calculateListOfPrimeFactors(clientNumber);
        for (Integer i : list){
            System.out.println(i);
        }
    }
}
