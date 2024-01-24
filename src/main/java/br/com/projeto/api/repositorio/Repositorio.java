/*Classe responsavel por implmeentar 
 * as ações SQL para criar, consultar,
 * deletar, atualizar etc
 */
package br.com.projeto.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.projeto.api.modelo.Cliente;

@Repository
public interface Repositorio extends CrudRepository<Cliente, Long> {

}
