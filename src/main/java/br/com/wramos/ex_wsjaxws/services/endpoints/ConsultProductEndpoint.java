package br.com.wramos.ex_wsjaxws.services.endpoints;

import br.com.wramos.ex_wsjaxws.entities.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import br.com.wramos.ex_wsjaxws.jaxbgenerated.ConsultRequest;
import br.com.wramos.ex_wsjaxws.jaxbgenerated.ConsultResponse;
@Endpoint
public class ConsultProductEndpoint {
    private static final String NAMESPACE_URI = "http://www.example.com/produtos";

    private ProductRepository productRepository;

    @Autowired
    public ConsultProductEndpoint(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "consultRequest")
    @ResponsePayload
    public ConsultResponse getProduct(@RequestPayload ConsultRequest request) {
        ConsultResponse response = new ConsultResponse();
        response.setProduct(productRepository.findProduct(request.getName()));
        // Implemente a lógica para obter os produtos da base de dados
        // e preencha a resposta

        return response;
    }
}
