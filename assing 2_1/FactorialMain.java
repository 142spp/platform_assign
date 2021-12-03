import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Inputnum = sc.nextInt();
        for(int i=1; i<=Inputnum; i++){
            System.out.println("Factorial of " + i + " = " + getFactorial((i)));
        }
    }
    private static long getFactorial(final int n){
        long result = 1;
        for(int j=1; j<= n; j++){
            result *= j;
        }
        return result;
    }
}
