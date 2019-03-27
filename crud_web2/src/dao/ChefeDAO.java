package dao;

import java.util.Collection;

import modelo.Chefe;

public class ChefeDAO {
	
	public void salvar(Chefe chefe, Collection<Chefe> lista) {
		if (!lista.contains(chefe)) {
			lista.add(chefe);
		}
	}
	
	public void excluir(Chefe chefe, Collection<Chefe> lista) {
			lista.remove(chefe);
			
			chefe = new Chefe();
	}
}
