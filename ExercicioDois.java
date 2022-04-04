import java.util.Scanner;  


public class ExercicioDois{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("R ");
        int R = sc.nextInt();
        System.out.print("S ");
        int S = sc.nextInt();
        System.out.print("T ");   
        int T = sc.nextInt();
        
        int temp, maior;

        temp = R>S?R:S;
        maior = T>temp?T:temp;
        System.out.println(maior);

    }
}
