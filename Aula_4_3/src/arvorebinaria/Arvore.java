package arvorebinaria;

public class Arvore {
	No raiz;
	public Arvore(int valor) {
		raiz = new No(valor);
	}
	public No impRaiz() {
		return raiz;
	}
	public void inserir(int valor, No r) { //r = nó raiz
		if (r.valor > valor) {
			if (r.esq != null) {
				inserir(valor, r.esq);
			}else {
				No novo = new No(valor);
				r.esq = novo;
			}
		} else {
			if (r.dir != null) {
				inserir(valor, r.dir);
			}else {
				No novo = new No(valor);
				r.dir = novo;
			}
		}
	}
	public void preOrdem(No r) {
		if (r != null) {
			System.out.println(r.valor);
			preOrdem(r.esq);
			preOrdem(r.dir);
		}
	}
	public void emOrdem(No r) {
		if (r != null) {
			emOrdem(r.esq);
			System.out.println(r.valor);
			emOrdem(r.dir);
		}
	}
	public void posOrdem(No r) {
		if (r != null) {
			posOrdem(r.esq);
			posOrdem(r.dir);
			System.out.println(r.valor);
			
		}
	}
} 
