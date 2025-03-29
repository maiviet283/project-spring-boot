package maiviet.com.chuyen_de.models;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Entity
// Đánh dấu bằng @Entity để Hibernate quản lý.

@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// Dùng @Id, @Column, @GeneratedValue để định nghĩa các trường.

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(nullable = false)
    private Integer stock;
}

    // @Entity: Đánh dấu đây là bảng trong database.

    // @Table(name = "products"): Đặt tên bảng là products.

    // @Id: Khóa chính.

    // @GeneratedValue(strategy = GenerationType.IDENTITY): Tự động tăng ID.

    // @Data: Lombok giúp tự động tạo Getter/Setter.
