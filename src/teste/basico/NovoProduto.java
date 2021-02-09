package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Caneta", 5.00);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluirCompleto(produto).fechar();
		//dao.abrirTransacao().incluir(produto).fecharTransacao().fechar();
		
		System.out.println("id do produto " + produto.getId());

	}

}
