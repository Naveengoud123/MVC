package com.naveen.spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductOperations {

	
	@Autowired
	JdbcTemplate jdbcTemplate;

	// Db operations
	// 1. Add Product Details // Insertion of data

	
	public void addProduct() {

		String query = "insert into product values(1,'Mi',20000)";

		int count = jdbcTemplate.update(query);

		System.out.println("No of Recoreds inserted : " + count);
	}

	// 2. Delete ProductDetails

	public void deleteProduct(int Pid) {

	jdbcTemplate.update("delete from product where Pid=?", Pid);

	}

	// Add Product Details // Insertion of data
	// Data should be passed dynamicaly to query

	public void addProductsWithDynamicData(int Pid, String name, int price) {

		String query = "insert into product values(?,?,?)";

		int count = jdbcTemplate.update(query, Pid, name, price);

		System.out.println("No of Recoreds inserted : " + count);
	}

	// TODO : 3. Update ProductDetails

	// 4. Load all Product Details / select Query

	// as List of Product objects

	public void getAllProductAsListOfObjects() {

		String query = "select * from product ";

		List<Product> allProducts = jdbcTemplate.query(query, new BeanPropertyRowMapper<Product>(Product.class));

		System.out.println("No of Products : " + allProducts.size());

		System.out.println("Old Approach ");

		for (Product p : allProducts) {
			System.out.println(p.getPid());
			System.out.println(p.getName());
			System.out.println(p.getPrice());
		}

		System.out.println("Using Java8");

		// Java 8
		allProducts.stream().forEach(System.out::println);
	}

	// Collect Product names as List of Objects

	public void getAllProductNames() {

		String query = "select name from product ";

		List<String> allProductNames = jdbcTemplate.queryForList(query, String.class);

		allProductNames.stream().forEach(System.out::println);

	}

}