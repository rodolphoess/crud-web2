package dao;

import java.util.Collection;

import modelo.Departamento;

public class DepartamentoDAO {

	public void salvar(Departamento departamento, Collection<Departamento> lista) {
		if (!lista.contains(departamento)) {
			lista.add(departamento);
		}
	}

	public void excluir(Departamento departamento, Collection<Departamento> lista) {
		lista.remove(departamento);

		departamento = new Departamento();
	}

}
