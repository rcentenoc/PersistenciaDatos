
package componenteEntidad;

import java.util.Objects;

/**
 *
 * @author Fab
 */
public class Aula {
    
    private String idAula;
    private int numeroAula;
    private int capacidad;

    public Aula(){
        
    }
    public Aula(String idAula, int numeroAula, int capacidad) {
        this.idAula = idAula;
        this.numeroAula = numeroAula;
        this.capacidad = capacidad;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return idAula + numeroAula + capacidad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.idAula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aula other = (Aula) obj;
        if (!Objects.equals(this.idAula, other.idAula)) {
            return false;
        }
        return true;
    }
    
    
}
