import java.util.Scanner;  


public class ExercicioCinco {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int numero = sc.nextInt();
        if( numero >= 0)
        {
            int total = 1;
            for(int i = numero; i != 0; i--)
            {
                total *= i;
            }
            System.out.println(total);

        } else{
            System.out.println(-1);
        }
    }
}
