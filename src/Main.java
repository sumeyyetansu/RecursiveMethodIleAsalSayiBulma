import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (ısPrimeNumber(number )) {
            System.out.println(number + " sayısı asal sayıdır.");

        } else {
            System.out.println(number + " sayısı asal sayı değildır.");
        }
    }
    public static boolean ısPrimeNumber(int number) {
        int i = 1 ;
        if (number == 2) {
            return true;
        }
        else if (number < 2){
            return false;
        }
        else if(number > i){
            while (number > i){
                i++;
                if(number % i == 0){

                    return false;
                }
                else{
                    return true;
                }
            }
        }
        else {
            return false;
        }
        return ısPrimeNumber(number);
    }
}