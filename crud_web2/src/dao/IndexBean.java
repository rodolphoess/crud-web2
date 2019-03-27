package dao;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class IndexBean {

	public String cadastrarDepartamento() {
		return "/cadastro_departamento";
	}
	
	public String cadastrarChefe() {
		return "/cadastro_chefe";
	}
	
	public String cadastrarFuncionario() {
		return "/cadastro_funcionario";
	}
}
