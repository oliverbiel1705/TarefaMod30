package br.com.gabdev.dao;

import br.com.gabdev.dao.generic.IGenericDAO;
import br.com.gabdev.domain.Venda;
import br.com.gabdev.exceptions.DAOException;
import br.com.gabdev.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
