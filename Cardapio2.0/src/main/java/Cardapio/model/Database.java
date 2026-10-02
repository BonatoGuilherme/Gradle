package Cardapio.model;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static Cardapio.model.ItemCardapio.CategoriaCardapio.*;

public class Database {
    public List<ItemCardapio> listaItemCardapio() {
        List<ItemCardapio> itens = new LinkedList<>();
        itens.add(new ItemCardapio(1L, "Suco natural", "Suco natural de laranja", BEBIDAS, new BigDecimal("2.99"), null));
        itens.add(new ItemCardapio(2L, "Bruschetta", "Pão italiano com tomate, manjericão e azeite", ENTRADAS, new BigDecimal("18.90"), null));
        itens.add(new ItemCardapio(3L, "Salada Caprese", "Tomate, muçarela de búfala e manjericão", ENTRADAS, new BigDecimal("24.90"), null));
        itens.add(new ItemCardapio(4L, "Sopa de abóbora", "Creme de abóbora com croutons", ENTRADAS, new BigDecimal("19.90"), null));
        itens.add(new ItemCardapio(5L, "Filé à parmegiana", "Filé empanado com molho de tomate e queijo", PRATOS_PRINCIPAIS, new BigDecimal("42.90"), null));
        itens.add(new ItemCardapio(6L, "Risoto de cogumelos", "Risoto cremoso com cogumelos frescos", PRATOS_PRINCIPAIS, new BigDecimal("39.90"), null));
        itens.add(new ItemCardapio(7L, "Lasanha bolonhesa", "Lasanha artesanal com molho bolonhesa", PRATOS_PRINCIPAIS, new BigDecimal("37.90"), null));
        itens.add(new ItemCardapio(8L, "Limonada", "Limonada fresca preparada na hora", BEBIDAS, new BigDecimal("8.90"), null));
        itens.add(new ItemCardapio(9L, "Refrigerante", "Refrigerante gelado em lata", BEBIDAS, new BigDecimal("6.50"), null));
        itens.add(new ItemCardapio(10L, "Pudim", "Pudim de leite condensado com calda de caramelo", SOBREMESA, new BigDecimal("12.90"), null));
        itens.add(new ItemCardapio(11L, "Brownie", "Brownie de chocolate servido com sorvete", SOBREMESA, new BigDecimal("16.90"), null));
        return itens;
    }
}
