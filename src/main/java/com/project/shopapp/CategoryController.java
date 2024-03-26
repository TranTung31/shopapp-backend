package com.project.shopapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
    // Hiển thị tất cả categories
    @GetMapping("")
    public ResponseEntity<String> getAllCategories() {
        return  ResponseEntity.ok("gel all category product");
    }

    @PostMapping("")
    public ResponseEntity<String> insertCategory() {
        return  ResponseEntity.ok("insert category");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategory(@PathVariable Long id) {
        return  ResponseEntity.ok("update category with id = " + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        return  ResponseEntity.ok("delete category with id = " + id);
    }
}
