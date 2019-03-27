package dao;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Chefe;
import negocio.ChefeService;

@ManagedBean
@SessionScoped
public class ChefeBean {
	
	private Chefe chefe;
	private Collection<Chefe> lista;
	
	private ChefeService chefeService;

	public ChefeBean() {
		this.chefe = new Chefe();
		this.lista = new ArrayList<Chefe>();
		
		this.chefeService = new ChefeService();
	}
	
	public void salvar() {
		if (chefeService.salvar(chefe) && !lista.contains(chefe)) {
			lista.add(chefe);
		}
	}
	
	public void excluir() {
		if (chefeService.deletar(chefe)) {
			lista.remove(chefe);
			
			chefe = new Chefe();
		}
	}
	
	public String voltarParaMenu() {
		return "/index";
	}

	public Chefe getChefe() {
		return chefe;
	}

	public void setChefe(Chefe chefe) {
		this.chefe = chefe;
	}

	public Collection<Chefe> getLista() {
		return lista;
	}

	public void setLista(Collection<Chefe> lista) {
		this.lista = lista;
	}
}
