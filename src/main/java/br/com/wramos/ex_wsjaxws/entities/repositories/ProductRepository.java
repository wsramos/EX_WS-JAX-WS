package br.com.wramos.ex_wsjaxws.entities.repositories;

import br.com.wramos.ex_wsjaxws.jaxbgenerated.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProductRepository {
    private static final Map<String, Product> productMap = new HashMap<>();

    @PostConstruct
    public void initData() {
        Product mouse = new Product();
        mouse.setName("Mouse Gamer");
        mouse.setPrice(30.0);
        mouse.setQtd(10);

        productMap.put(mouse.getName(), mouse);

        Product teclado = new Product();
        teclado.setName("Teclado mecânico - Gamer");
        teclado.setPrice(50.0);
        teclado.setQtd(5);

        productMap.put(teclado.getName(), teclado);
    }

    public Product findProduct(String name) {
        return productMap.get(name);
    }
}
