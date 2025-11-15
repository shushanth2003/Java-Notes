import java.util.Scanner;

class Calculator{
    int num1;
    int num2;


    //adding two number
    public int calculateSum(int num1,int num2){
        return num1+num2;
    }

    //difference two number
    public int differenceSum(int num1,int num2){
        return num1-num2;
    }
}
public class Calculators {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Calculator calculator=new Calculator();
        calculator.num1=in.nextInt();
        calculator.num2=in.nextInt();
        System.out.println("Adding Two Numbers : "+calculator.calculateSum(calculator.num1,calculator.num2));
        System.out.println("Difference Two Numbers : "+calculator.differenceSum(calculator.num1,calculator.num2));
    }
}
