package exemplo;

public class Lista { //Aula 4.1
	String[] lista = {"Lila","Antonio","Clara","Miguel","João","Ariane","Ana"};
	
	public boolean buscar(String nome) {
		for (String aux : lista) {
			if (aux.equals(nome)) {
				return true;
			}
		}
		return false;
	}
}
