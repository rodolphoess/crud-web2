package dao;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Departamento;
import negocio.DepartamentoService;

@ManagedBean
@SessionScoped
public class DepartamentoBean {
	
	private Departamento departamento;
	private Collection<Departamento> lista;
	
	private DepartamentoService departamentoService;

	public DepartamentoBean() {
		this.departamento = new Departamento();
		this.lista = new ArrayList<Departamento>();
		
		this.departamentoService = new DepartamentoService();
	}
	
	public void salvar() {
		if (departamentoService.salvar(departamento) && !lista.contains(departamento)) {
			lista.add(departamento);
		}
		
	}
	
	public void excluir() {
		if (departamentoService.deletar(departamento)) {
			lista.remove(departamento);
			
			departamento = new Departamento();
		}
	}
	
	public String voltarParaMenu() {
		return "/index";
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Collection<Departamento> getLista() {
		return lista;
	}

	public void setLista(Collection<Departamento> lista) {
		this.lista = lista;
	}
}
