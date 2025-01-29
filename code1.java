import java.util.Scanner;
public class code1{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = scanner.nextInt();
        scanner.close();

        if(number < 5){
        System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}    