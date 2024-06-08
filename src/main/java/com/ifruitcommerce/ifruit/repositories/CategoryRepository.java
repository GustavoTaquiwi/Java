package com.ifruitcommerce.ifruit.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ifruitcommerce.ifruit.entities.Category;

public interface CategoryRepository  extends JpaRepository <Category,Long>{
}
