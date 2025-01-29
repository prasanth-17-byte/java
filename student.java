import java.util.Scanner;
public class student{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Tamil :");
        int A = scanner.nextInt();
        System.out.print("English :");
        int B = scanner.nextInt();
        System.out.print("Maths :");
        int C = scanner.nextInt();
        System.out.print("Science :");
        int D = scanner.nextInt();
        System.out.print("Social Science :");
        int E = scanner.nextInt();
        scanner.close();
        float x= ((A+B+C+D+E)/5);
        System.out.println(x);
        if(x<=50){
            System.out.println("FAIL");

        }else{
            System.out.println("PASS");
        }
        
        
    }
}