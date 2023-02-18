package Java_Advaced.Polimorfismo.PolimorfismoEjemplo2;

import java.util.Scanner;

public abstract class ClasePadre
{
    protected int valor1, valor2, resultado;

    Scanner entrada = new Scanner(System.in);

    public void pedirDatos()
    {
        System.out.println("Dame el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.println("Dame el segundo valor :");
        valor2 = entrada.nextInt();
    }
    /* Para el polimorfismo debemos crear metodos abstractos, y por ende
    la clase también debe ser abstracta.
    Cabe mencionar que los metodos abstractos no llevan las llaves.{}, ya que su lógica (código)
    lo implementa en otra clase.
     */
    public abstract void operaciones();// Hasta aca queda el codigo y le daremos comportamiento en otro lugar

    public void mostrarResultado()
    {
        System.out.println("El resultado es: " + resultado);
    }
}
