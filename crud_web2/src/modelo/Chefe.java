package modelo;

import java.util.Collection;

public class Chefe extends Funcionario {

	private Collection<Departamento> departamentos;

	public Collection<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Collection<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
}
