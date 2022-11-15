
package componenteNegocio;

import componenteDatos.MatriculaDAO;
import componenteEntidad.Matricula;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fab
 */
public class MatriculaCN {
    
    private static MatriculaCN instancia;
    public static MatriculaCN getInstancia(){
        if(instancia==null){
            instancia = new MatriculaCN();
        }
        return instancia;
    }
    
    public void insertar(Matricula matricula) throws SQLException{ 
        MatriculaDAO.getInstancia().insertar(matricula);
    }
    
    public int cantidad() throws SQLException{
        return MatriculaDAO.getInstancia().cantidad();
    }
    
    public Matricula buscarMatricula(String idMatricula)throws SQLException{
        return MatriculaDAO.getInstancia().buscarMatricula(idMatricula);
    }
    public void eliminar(String idMatricula) throws SQLException{
        MatriculaDAO.getInstancia().eliminar(idMatricula);
    }
    public ArrayList<Matricula> mostrarMatriculas() throws SQLException {
         return MatriculaDAO.getInstancia().mostrarMatriculas();
   }
}
