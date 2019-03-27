package negocio;

import java.util.Collection;

import dao.DepartamentoDAO;
import modelo.Departamento;

public class DepartamentoService {

	private DepartamentoDAO dao;

	public DepartamentoService() {
		this.dao = new DepartamentoDAO();
	}

	public void salvar(Departamento departamento, Collection<Departamento> lista) {
		dao.salvar(departamento, lista);
	}

	public void deletar(Departamento departamento, Collection<Departamento> lista) {
		dao.excluir(departamento, lista);
	}

	public void editar(Departamento departamento, Collection<Departamento> lista) {

	}
}
