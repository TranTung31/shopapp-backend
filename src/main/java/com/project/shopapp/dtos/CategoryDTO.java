package com.project.shopapp.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data // toString
@Getter
@Setter
@AllArgsConstructor // Hàm khởi tạo có tham số
@NoArgsConstructor // Hàm khởi tạo không có tham số
public class CategoryDTO {
    @NotEmpty(message = "Category's name is required!")
    private String name;
}
