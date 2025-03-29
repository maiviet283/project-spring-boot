package maiviet.com.chuyen_de.controller;

import maiviet.com.chuyen_de.models.Product;
import maiviet.com.chuyen_de.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Là nơi định nghĩa các API Endpoint (@RequestMapping).
// Nhận request từ client, gọi Service hoặc Repository để xử lý dữ liệu.


@RestController // Định nghĩa đây là API Controller.
@RequestMapping("/api/products/") // Tạo đường dẫn chung cho API.
public class ProductController {
    //  Tiêm ProductRepository vào controller.
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/{id}/")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}/")
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
}
