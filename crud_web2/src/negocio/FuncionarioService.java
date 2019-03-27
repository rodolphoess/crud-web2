package negocio;

import java.util.Collection;

import dao.FuncionarioDAO;
import modelo.Funcionario;

public class FuncionarioService {
	
	private FuncionarioDAO dao;
	
	public FuncionarioService() {
		this.dao = new FuncionarioDAO();
	}

	public void salvar(Funcionario funcionario, Collection<Funcionario> lista) {
		dao.salvar(funcionario, lista);
	}

	public void deletar(Funcionario funcionario, Collection<Funcionario> lista) {
		dao.deletar(funcionario, lista);
	}

	public void editar(Funcionario funcionario, Collection<Funcionario> lista) {
		
	}
}
