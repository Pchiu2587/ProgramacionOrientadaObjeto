package JavaBasic.OperadoresYvariables;

public class OperadoresCondicionales
{
    public static void main(String[] args)
    {

        var a = 5;
        var resultado = a >= 0 && a<= 10;

        if (resultado)
        {
            System.out.println("Dentro de Rango");
        }
        else
        {
            System.out.println("Dentro de Rango");
        }

        var vacaciones = false;
        var diaDescanso = false;
        var domingo = false;

        if(vacaciones ||diaDescanso || domingo) //Con una condicion que se cumpla "o"
        {
            System.out.println("Puedo Beber Cerveza");
        }
        else
        {
            System.out.println("No puedo Beber Cerveza");
        }

    }
}
