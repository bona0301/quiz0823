package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductDao {
	public Integer save(Product product);
	
	public Integer count(String pCompany);
	
	public List<ProductDto.ForList> findAll(String pCompany, Integer start, Integer end);
	
	public Integer update(Product product);
	
	public Optional<Product.Read> findById(Integer pno);
	
	public Optional<String> findWriterById(Integer pno);
	
	public Integer deleteById(Integer bno);
}
