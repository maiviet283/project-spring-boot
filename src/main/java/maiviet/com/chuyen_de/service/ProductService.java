package maiviet.com.chuyen_de.service;

import maiviet.com.chuyen_de.models.Product;
import maiviet.com.chuyen_de.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
