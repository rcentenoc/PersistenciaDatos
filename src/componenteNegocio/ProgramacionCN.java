
package componenteNegocio;

import componenteDatos.ProgramacionDAO;
import componenteEntidad.Programacion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fab
 */
public class ProgramacionCN {
    
    private static ProgramacionCN instancia;
    public static ProgramacionCN getInstancia(){
        if(instancia==null){
            instancia = new ProgramacionCN();
        }
        return instancia;
    }
    
    public void insertar(Programacion programacion) throws SQLException{ 
        ProgramacionDAO.getInstancia().insertar(programacion);
    }
    public void actualizar(Programacion programacion) throws SQLException{
        ProgramacionDAO.getInstancia().actualizar(programacion);
    }
    public void eliminar(String idProgramacion) throws SQLException{
        ProgramacionDAO.getInstancia().eliminar(idProgramacion);
    }
    public Programacion buscarProgramacion(String idProgramacion) throws SQLException{
        return ProgramacionDAO.getInstancia().buscarProgramacion(idProgramacion);
    }
    public ArrayList<Programacion> mostrarPromacion() throws SQLException {
         return ProgramacionDAO.getInstancia().mostrarProgramacion();
    }
    
}
