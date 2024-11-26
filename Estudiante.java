
/**
 * Write a description of class Estudiante here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Estudiante
{
    private int codSis;
    private String nombre, apellido;
    private NumeroDesplegable[] parciales;
    private NumeroDesplegable segundaInstancia;
    //k
    public Estudiante(int codSis, String nombre, String apellido) {
        this.codSis = codSis;
        this.nombre = nombre;
        this.apellido = apellido;
        this.parciales = new NumeroDesplegable[3]; 
        for (int i = 0; i < 3; i++) {
            parciales[i] = new NumeroDesplegable(100); 
        }
        this.segundaInstancia = new NumeroDesplegable(51);  
    }
    //k
    public void registrarParcial(int nota, int numeroParcial) {
        if (numeroParcial >= 1 && numeroParcial <= 3) {
            parciales[numeroParcial - 1].setValor(nota);
        }
    }
    //k
    public void registrarSegundaInstancia(int nota) {
        segundaInstancia.setValor(nota);
    }
    //k
    public int getCodSis() {
        return codSis;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof Estudiante) {
            Estudiante other = (Estudiante) obj;
            return this.codSis == other.codSis;
        }
        return false;
    }
}
