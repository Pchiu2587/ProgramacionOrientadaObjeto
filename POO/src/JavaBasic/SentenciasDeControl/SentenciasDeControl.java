package JavaBasic.SentenciasDeControl;

public class SentenciasDeControl
{
    public static void main(String[] args)
    {
        boolean condicion = true;

        if(condicion)
        {
            System.out.println("Condición Verdadera");
        }
        else
        {
            System.out.println("Condición Falsa");
        }

        int x = 11;

        if(x <= 10 || x >= 12)
        {
            System.out.println("Tu numero es 10 o menor que 10");
        }
        else
        {
            System.out.println("Tu número es 11");
        }

        int numero= 1;
        String texto = "numero desconocido";
        if(numero ==1)
        {
            texto = "Numero Uno";
        }
        else if (numero == 2)
        {
            texto = "Numero Dos";
        }
        else if (numero == 3)
        {
            texto = "Numero Tres";
        }
        else if (numero == 4)
        {
            texto = "Numero Cuatro";
        }
       /* else
        {
            numero = "Numero Desconocido";
        }*/
        System.out.println("texto" + texto);
    }
}
