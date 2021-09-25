package com.SAH.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SAH.entity.Products;
@Repository
public interface ProductsCRUDRepository extends CrudRepository<Products, Long> {
	
}
