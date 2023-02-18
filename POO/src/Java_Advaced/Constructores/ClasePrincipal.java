package Java_Advaced.Constructores;

public class ClasePrincipal
{

    public static void main(String[] args)
    {
        //Instancia a la calse que no tiene constructor.
        SinConstructor sin = new SinConstructor();
        sin.pedirNombre();
        sin.imprimir();
        //Instancia a la clase conConstructor; nos ayuda ahorrar código en la clase principal
        ConConstructor con = new ConConstructor();

    }
}
