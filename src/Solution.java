

import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    // 6. Donat un vector de nombres enters, determina si algun element està repetit.
    //Declaro el vector, el boole� i les variables
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int [5];
        int posicioArray = 0;
        int posicioArray2;
        boolean repetit = false;

        //Demano els nombres
        for (posicioArray = 0; posicioArray < vector.length; posicioArray++){
            System.out.println("Introdueix un nombre");
            vector[posicioArray] = sc.nextInt();
        }

        //Tanco el teclat
        sc.close();


        //Comprobo si hi ha algun repetit amb dos for
        for (posicioArray = 0; posicioArray < vector.length; posicioArray++)
        {
            for (posicioArray2 = posicioArray+1; posicioArray2 < vector.length; posicioArray2++)
            {
                if (vector[posicioArray] == vector[posicioArray2]){
                    repetit = true;
                    System.out.println("El nombre " + vector[posicioArray] + " està repetit.");
                    return;
                }
            }
        }

        if (repetit == false){
            System.out.println("No hi ha repetits.");
        }
    }



}
