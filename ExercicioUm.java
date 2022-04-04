import java.util.Scanner;  


class ExercicioUm {  
    public static void main(String args[]) {
        
        Scanner sc= new Scanner(System.in);
        int numero = sc.nextInt();   
        int[] array = new int[numero]; 
        for( int i = 0; i < numero; i++)
        {
            array[i] = sc.nextInt();

        }
        int total = 0;
        

        for (int x = 0; x < array.length; x++)
        {
            if (array[x] < 0){
                total += 1;
            }
        }
        System.out.println(total);  
    }  
 }