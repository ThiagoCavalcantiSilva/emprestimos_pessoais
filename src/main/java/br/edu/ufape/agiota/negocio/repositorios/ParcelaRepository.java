package br.edu.ufape.agiota.negocio.repositorios;

import br.edu.ufape.agiota.negocio.basica.Parcela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParcelaRepository extends JpaRepository<Parcela, Long> {

	List<Parcela> findByEmprestimoId(long idEmprestimo);

	Parcela findByIdAndEmprestimoClienteId(long idParcela, long clienteId);
}