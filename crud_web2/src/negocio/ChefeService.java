package negocio;

import java.util.Collection;

import dao.ChefeDAO;
import modelo.Chefe;

public class ChefeService {
	
	private ChefeDAO dao;
	
	public ChefeService() {
		this.dao = new ChefeDAO();
	}

	public void salvar(Chefe chefe, Collection<Chefe> lista) {
		dao.salvar(chefe, lista);
	}
	
	public void deletar(Chefe chefe, Collection<Chefe> lista) {
		dao.excluir(chefe, lista);
	}
	
	public void editar(Chefe chefe, Collection<Chefe> lista) { 
		
	}

}
