package dao;

import java.util.Collection;

import modelo.Funcionario;

public class FuncionarioDAO {

	public void salvar(Funcionario funcionario, Collection<Funcionario> lista) {
		if (!lista.contains(funcionario)) {
			lista.add(funcionario);
		}
	}

	public void deletar(Funcionario funcionario, Collection<Funcionario> lista) {
		lista.remove(funcionario);

		funcionario = new Funcionario();
	}

}
