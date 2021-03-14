import java.util.Scanner;

public class FirstCalculatorIJ {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        muliplicationTable ();

    }
    public static void addition(){

        System.out.print("First Number: ");
        int fNum = sc.nextInt();
        System.out.print("Secound Number: ");
        int sNum =  sc.nextInt();
        System.out.println(fNum+" + "+sNum+" = "+(fNum+sNum));
    }
   public static void multiplication(){
       System.out.print("First Number: ");
       int fNum = sc.nextInt();
       System.out.print("Secound Number: ");
       int sNum =  sc.nextInt();
       System.out.println(fNum+" * "+sNum+" = "+(fNum*sNum));

   }

    public static void muliplicationTable () {
        System.out.print ("Enter Number: ");
        int num = sc.nextInt ();
        for (int i = 1; i <= 10; i++) {
            System.out.println (num + " * " + i + " = " + (num * i));

        }

    }
}
