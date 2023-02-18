package Java_Advaced.Polimorfismo.PolimorfismoEjemplo2;

public class ClaseHijaSuma extends ClasePadre
{
    @Override // A esto se le conoce sobreescribir metodos, es decir cuando estamos utilizando el polimorfismo
    public void operaciones()
    {
        resultado = valor1 + valor2;
    }
}
