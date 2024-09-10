package br.com.gabdev.services;

import br.com.gabdev.dao.IClienteDAO;
import br.com.gabdev.domain.Cliente;
import br.com.gabdev.exceptions.DAOException;
import br.com.gabdev.exceptions.MaisDeUmRegistroException;
import br.com.gabdev.exceptions.TableException;
import br.com.gabdev.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}
	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
