package br.com.wramos.ex_wsjaxws.entities.repositories;

import br.com.wramos.ex_wsjaxws.entities.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProductRepositoryTest {
    private static final Map<String, Product> productMap = new HashMap<>();

    @PostConstruct
    public void initData() {
        Product mouse = new Product();
        mouse.setName("Mouse Gamer");
        mouse.setPrice(30.0);
        mouse.setQtd(10);

        productMap.put(mouse.getName(), mouse);

        Product teclado = new Product();
        mouse.setName("Teclado mecânico - Gamer");
        mouse.setPrice(50.0);
        mouse.setQtd(5);

        productMap.put(teclado.getName(), mouse);
    }

    public Product findProduct(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return productMap.get(name);
    }
}
