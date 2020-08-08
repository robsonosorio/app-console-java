package data;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;

public class metodoProduto {
    List<Produto> listaProduto = new ArrayList<>();

    public void cadastraProduto(Produto produto) {
    listaProduto.add(produto);
        System.out.println(produto + "\n");
    }

    public void buscaProduto() {
        if(listaProduto.isEmpty()){
            System.out.println("\nLista não possui produto cadastrado!\n");
        } else {
            for (Produto pr : listaProduto) {
                System.out.println(pr);
            }
        }
    }

    public void deletaProduto(int id) {
        for (Produto pr : listaProduto) {
            if (pr.getIdProduto() == id) {
                listaProduto.remove(pr);
                System.out.println("\nProduto deletado com sucesso!\n");
                return;
            }
        }
    }

    public void alteraProduto(Produto produto) {
        for (Produto pr : listaProduto) {
            if (pr.getIdProduto() == produto.getIdProduto()) {
                pr.setIdProduto(produto.idProduto);
                pr.setNome(produto.nome);
                pr.setPreco(produto.preco);
                System.out.println("\nAlteração realizada com sucesso!\n");
            }
        }
    }
}
