import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd");
        int numberToCheck = scanner.nextInt();

        if(EvenorOdd(numberToCheck)){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
        scanner.close();
    }
    static boolean EvenorOdd(int number){
        if (number % 2 == 0){
             return true;
        }
        else {
            return false;
        }
    }
}