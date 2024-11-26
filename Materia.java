 import java.util.ArrayList;
/**
 * Write a description of class Materia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Materia
{
    private ArrayList<Estudiante> listEst;
    
    public Materia(){
        listEst = new ArrayList<Estudiante>();
    }
    
    public String inscribir(Estudiante est){
        String msg = "";
        Estudiante e;
        boolean encontre = false;
        int pos= 0; 
        while(!encontre && pos<listEst.size()){
            e = listEst.get(pos);
            if(e.equals(est)){
                encontre = true;
            }
            pos++;
        }
        if(encontre){
            msg = "estudiante ya esta inscrito";
        }else{
            listEst.add(est);
            msg = "estudiante inscrito exitosamente";
        }
        return msg;
    }
    //k
    private Estudiante buscarPorCodigo(int codSis) {
        for (Estudiante est : listEst) {
            if (est.getCodSis() == codSis) {
                return est;
            }
        }
        return null;
    }
    //k
    public void ingresarNotaPar(int codSis, int n, int nP) {
        Estudiante est = buscarPorCodigo(codSis);
        if (est != null) {
            est.registrarParcial(n, nP);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public void ingresarNotaSI(int codSis, int n) {
        Estudiante est = buscarPorCodigo(codSis);
        if (est != null) {
            est.registrarSegundaInstancia(n);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
