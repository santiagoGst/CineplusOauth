package itst.ws;

import org.springframework.data.jpa.repository.JpaRepository;
import itst.model.Clasificaciones;

public interface ClasificacionesRepository extends JpaRepository<Clasificaciones,Integer> {

}
