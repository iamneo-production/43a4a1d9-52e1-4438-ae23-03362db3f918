package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Entity.ProductModel;

@Repository
public interface ProdeuctModelRepo extends JpaRepository<ProductModel, Integer>{

}
