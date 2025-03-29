package maiviet.com.chuyen_de.repository;

import maiviet.com.chuyen_de.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Đánh dấu đây là lớp làm việc với database.
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Giúp bạn có sẵn CRUD mà không cần code SQL.
    // JpaRepository<Product, Long> giúp bạn không cần viết SQL mà vẫn có thể:
    // findAll() -> Lấy toàn bộ dữ liệu.
    // findById(id) -> Lấy sản phẩm theo ID.
    // save(product) -> Thêm mới hoặc cập nhật sản phẩm.
    // deleteById(id) -> Xóa sản phẩm theo ID.

}
