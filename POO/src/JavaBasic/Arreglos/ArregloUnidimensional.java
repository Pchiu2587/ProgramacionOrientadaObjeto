package JavaBasic.Arreglos;

public class ArregloUnidimensional
{
    public static void main(String[] args)
    {
        int numeros[] = new int[5];

        numeros [0] = 52;
        numeros [1] = 512;
        numeros [2] = 522;
        numeros [3] = 522;
        numeros [4] = 523;

        for (int i= 0; i<=4; i++)
        {
            System.out.println("[" + numeros[i] + "]");
        }


    }
}
