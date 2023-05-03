package com.example.laptopDemo.dao;




import org.springframework.data.jpa.repository.JpaRepository;

import com.example.laptopDemo.model.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop,Integer>{
	
	
	
}
