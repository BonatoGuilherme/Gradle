package Cardapio.cli;


import Cardapio.model.Database;
import Cardapio.model.ItemCardapio;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    void main() {
        Database database = new Database();
        List<ItemCardapio> itens = database.listaItemCardapio();

        // Percorre os itens como um fluxo para agrupá-los e contar quantos há em cada categoria.
        itens.stream()
                .collect(Collectors.groupingBy(
                        ItemCardapio::getCategoria, // Usa a categoria como chave de cada grupo.
                        Collectors.counting()       // Conta quantos itens pertencem a cada grupo.
                ))
                // Exibe cada categoria (key) e a quantidade de itens nela (value).
                .forEach((key, value) -> IO.println(key + ": " + value));

    }
}
