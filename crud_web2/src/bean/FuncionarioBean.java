package bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Funcionario;
import negocio.FuncionarioService;

@ManagedBean
@SessionScoped
public class FuncionarioBean {
	
	private Funcionario funcionario;
	private Collection<Funcionario> lista;
	
	private FuncionarioService funcionarioService;

	
	public FuncionarioBean() {
		this.funcionario = new Funcionario();
		this.lista = new ArrayList<Funcionario>();
		
		this.funcionarioService = new FuncionarioService();
	}
	
	public void salvar() {
		funcionarioService.salvar(funcionario, lista);
	}
	
	public void excluir() {
		funcionarioService.deletar(funcionario, lista);
	}
	
	public String voltarParaMenu() {
		return "/index";
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Collection<Funcionario> getLista() {
		return lista;
	}
	
	public void setLista(Collection<Funcionario> lista) {
		this.lista = lista;
	}
}
