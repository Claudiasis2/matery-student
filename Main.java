
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        Materia materia = new Materia();

        Estudiante est1 = new Estudiante(12345, "Juan", "Pérez");
        Estudiante est2 = new Estudiante(67890, "Ana", "Gómez");
        Estudiante est3 = new Estudiante(11223, "Carlos", "Pérez");
        Estudiante est4 = new Estudiante(44556, "Luis", "Pérez");
        
        System.out.println(materia.inscribir(est1)); 
        System.out.println(materia.inscribir(est2)); 
        System.out.println(materia.inscribir(est3)); 
        System.out.println(materia.inscribir(est4)); 

        System.out.println(materia.inscribir(est1)); 

        materia.ingresarNotaPar(200056251, 85, 1); 
        materia.ingresarNotaPar(200805627, 90, 2); 
        materia.ingresarNotaSI(202408336, 45);
    }
}
