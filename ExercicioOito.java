import java.util.*;  


public class ExercicioOito {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int[][] matrix = new int[numero][numero];
        for(int i =0; i < numero; i++)
        {
            for(int j =0; j <numero; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int soma = 0,temp=0;
        boolean result = true;
        for(int i =0; i < numero; i++)
        {
            soma =0;
            for(int j =0; j <numero; j++)
            {
                soma += matrix[i][j];
            }
            if(i == 0) temp = soma;
            if(temp != soma) 
            {
                result = false;
                break;
            }
        }
        for(int i =0; i < numero; i++)
        {
            soma =0;
            for(int j =0; j <numero; j++)
            {
                soma += matrix[j][i];
            }
            if(temp != soma) 
            {
                result = false;
                break;

            }
        }
        int primaria = 0, secundaria = 0;
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
     
                
                if (i == j)
                    primaria += matrix[i][j];
     
               
                if ((i + j) == (numero - 1))
                    secundaria += matrix[i][j];
            }
            
        }
        if(temp != secundaria || temp != primaria) 
        {
            result = false;
        }
        System.out.print(result?"yes":"no");
    }
}
