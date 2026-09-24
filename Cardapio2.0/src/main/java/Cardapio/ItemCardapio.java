package Cardapio;

import java.math.BigDecimal;

public record ItemCardapio(Long id, String nome, String descricao, CategoriaCardapio Categoria, BigDecimal preco,
                           BigDecimal precoComDesconto) {
    public enum CategoriaCardapio {
        ENTRADAS, PRATOS_PRINCIPAIS, BEBIDAS, SOBREMESA
    }


    public CategoriaCardapio getCategoria() {
        return Categoria;
    }

}
