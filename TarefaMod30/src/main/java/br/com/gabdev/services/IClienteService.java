package br.com.gabdev.services;

import br.com.gabdev.domain.Cliente;
import br.com.gabdev.exceptions.DAOException;
import br.com.gabdev.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {
	Cliente buscarPorCPF(Long cpf) throws DAOException;
}
