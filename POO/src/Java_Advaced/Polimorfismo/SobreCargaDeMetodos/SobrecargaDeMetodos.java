package Java_Advaced.Polimorfismo.SobreCargaDeMetodos;


public class SobrecargaDeMetodos
{
    public void suma (int a, int b) // Metods, con parametros
    {
        System.out.println("Resultado :" + (a + b));

    }
    public void suma (int a, int b, int c)
    {
        System.out.println("El resutado de esta suma es: " + (a + b + c));

    }

    public static void main(String[] args)
    {
        SobrecargaDeMetodos objSobrecarga = new SobrecargaDeMetodos();
        objSobrecarga.suma(100,100);// primer void de suma con parametros diferentes
        objSobrecarga.suma(200,200,200);
    }
}

