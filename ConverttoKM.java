import java.util.Scanner;

public class ConverttoKM{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter miles: ");

            int miles = scanner.nextInt();

            System.out.println(converttoKM(miles) + "KM");
        }
       //System.out.println(converttoKM(20));
        
        }
    public static double converttoKM(int miles) {

        double result = miles * 1.60934;

        return result;
    }
}