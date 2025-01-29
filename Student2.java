import java.util.Scanner;
public class Student2 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter The no .of Subjects");
        int numSubjects= scanner.nextInt();
        double[]marks= new double[numSubjects];
        double totalMarks = 0;
        for (int i =0; i< numSubjects; i++){ 
            System.out.println("Enter The mark of Subjects"+(i+1)+":");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }
double totalMaxMarks = numSubjects * 100;
double percentage =(totalMarks/totalMaxMarks)*100;
System.out.println("your percentage is:"+percentage+"%");
if(percentage >=80){
    System.out.println("you are eligible!");
}else{
    System.out.println("you are eligible.");
}
scanner.close();
}
}
