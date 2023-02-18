package JavaBasic.Ciclos;

public class For
{
    public static void  main(String[] args)
    {
        /*for (int i = 0; i <10; i++)// Si quieres que vaya incrementando de 1 en 1
        {
            System.out.println("i :" + i);

        }
        System.out.println("_________");
        for (int i = 0; i <10; i+=3)// Si quieres que vaya incrementando de 2 en 2
        {

            System.out.println("i :" + i);

        }
        for (int i = 0; i <=10; i++)
        {
           if(i==7)
            {
                break;
            }
            System.out.println("For i: " + " " + i);
        }*/
        for (int i = 0; i <=10; i++) {
            if (i == 7) {
                continue;   // palabra reservada de java, este numero no se imprime
            }
            System.out.println("For i: " + " " + i);
        }
    }
}
