package itst.ws;

import org.springframework.data.jpa.repository.JpaRepository;
import itst.model.TipoBoletos;

public interface TipoBoletosRepository extends JpaRepository<TipoBoletos, Integer>  {

}
