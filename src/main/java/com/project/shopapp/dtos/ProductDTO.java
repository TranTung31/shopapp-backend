package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data // toString
@Getter
@Setter
@AllArgsConstructor // Hàm khởi tạo có tham số
@NoArgsConstructor // Hàm khởi tạo không có tham số
public class ProductDTO {
    @NotEmpty(message = "Name is required!")
    @Size(min = 3, max = 200, message = "Name is must between 3 and 200 characters!")
    private String name;
    @Min(value = 0, message = "Price must be greater than or equal to 0!")
    @Max(value = 10000000, message = "Price must be less than or equal 10,000,000!")
    private Float price;
    private String thumbnail;
    private String description;
    @JsonProperty("category_id")
    private String categoryId;

    private List<MultipartFile> files;

    public List<MultipartFile> getFiles() {
        return files;
    }
}
