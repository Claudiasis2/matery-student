                
/**
 * Write a description of class NumeroDesplegable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumeroDesplegable
{
    private int limite;
    private int valor;
    
    public NumeroDesplegable(int limite) {
        this.limite = limite;
        this.valor = 0;
    }

    public void setValor(int valor) {
        if (valor <= limite) {
            this.valor = valor;
        } else {
            System.out.println("Error: la nota no puede superar el límite.");
        }
    }

    public int getValor() {
        return valor;
    }
}
