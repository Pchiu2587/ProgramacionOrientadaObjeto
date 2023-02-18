package Java_Advaced.Polimorfismo.PolimorfismoEjemplo2;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
      ClasePadre  suma = new ClaseHijaSuma();
      suma.pedirDatos();
      suma.operaciones();
      suma.mostrarResultado();

      ClasePadre resta = new ClaseHijaResta();
      resta.pedirDatos();
      resta.operaciones();
      resta.mostrarResultado();
    }
}
