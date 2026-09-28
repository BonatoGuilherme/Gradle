package Cardapio;

import com.google.gson.Gson;

import java.math.BigDecimal;

import static Cardapio.ItemCardapio.CategoriaCardapio.BEBIDAS;

public class Main {
    void main() {
        ItemCardapio refresco = new ItemCardapio(1L, "suco", "tope", BEBIDAS, new BigDecimal("2.99"), null);

        Gson gson = new Gson();
        String json = gson.toJson(refresco);
        IO.println(json);
    }
}
