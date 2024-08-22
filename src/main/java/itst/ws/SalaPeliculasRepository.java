package itst.ws;

import org.springframework.data.jpa.repository.JpaRepository;
import itst.model.SalaPeliculas;

public interface SalaPeliculasRepository extends JpaRepository<SalaPeliculas,Integer> {

}
