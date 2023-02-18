package Java_Advaced.This;

public class Rectangulo
{
    private int base, altura, area;

    // * Parametros int base, int altura Estas variables se llaman igual pero no sirven para lo mismo
    public Rectangulo(int base, int altura)
    {
        this.base = base; // this.base es la variable global
        this.altura = altura;
    }

    public void CalculoArea()
    {
        area= base * altura;
    }
    public void imprimir()
    {
        CalculoArea(); //Ya no hay necesidad de llamar a la variable.
        System.out.println("El area es: " + area);
    }
}
