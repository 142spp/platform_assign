import java.io.InputStream;
import java.util.Locale;
import java.lang.Math;
import java.util.Scanner;

public class ArrayEnum {
    enum Command{ADD, LIST , AVG ,SUM, INVALID ,STD ,QUIT}

    public static void main(String[] args){
        int[] values = new int[100];
        int index=0;

        final Scanner scanner = new Scanner(System.in);

        while(true){
            final Command command = getCommand(scanner);
            if(command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch(command){
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values,index);
                    break;
                case AVG:
                    System.out.printf("%.2f%n",getAvg(values,index));
                    break;
                case SUM:
                    System.out.printf("%d%n",getSum(values,index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
                case STD:
                    System.out.printf("%.2f%n",getStd(values,index));
            }

        }
        scanner.close();
    }

    private static Command getCommand(Scanner input){
        String order = input.next();

        Command command;
        try {
            command = Command.valueOf(order.toUpperCase());
        }
        catch (IllegalArgumentException e) {command = Command.INVALID;}
        return command;
    }

    private static int getValue(Scanner scanner){
        int newvalue = scanner.nextInt();
        return newvalue;
    }

    private static void printList(int[] values, int index){
        for(int i=0; i<index; i++){
            System.out.print(values[i]+ " ");
        }
        System.out.printf("%n");
    }
    private static float getAvg(int[] values, int index){
        int sum=0;
        for(int i=0; i<index; i++){
            sum += values[i];
        }
        return (float)sum/index;
    }
    private static int getSum(int[] values, int index){
        int sum=0;
        for(int i=0; i<index; i++){
            sum+= values[i];
        }
        return sum;
    }
    private static double getStd(int[] values, int index){
        double sum_of_pow =0;
        for(int i=0; i<index; i++){
            sum_of_pow += values[i]*values[i];
        }
        return Math.sqrt(sum_of_pow/index-getAvg(values, index)*getAvg(values, index));
    }
}
