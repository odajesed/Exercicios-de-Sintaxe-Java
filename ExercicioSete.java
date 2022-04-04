import java.util.Scanner;  

public class ExercicioSete {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int P =0, R =0, B =0, O =0;
        int total = 0;
        while(true)
        {
            int numero = sc.nextInt();
            if(numero < 0 || numero >100) break;

            if(numero < 25) P++;
            if(numero >= 25 && numero < 50) R++;
            if(numero >=50 && numero < 75) B++;
            if(numero >= 75) O++;

            total+=1;
        }
        System.out.print(P + " " + total);
        System.out.print("Péssimos-> " + (P*100/total) + "% ");
        System.out.print("Ruins-> " +(R*100/total)+ "% ");
        System.out.print("Bons-> " +(B*100/total)+ "% ");
        System.out.print("Ótimos-> " +(O*100/total)+ "% ");

    }

}
