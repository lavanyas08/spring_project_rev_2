package com.example.laptopDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
@Id
private int sNo;
private String brand;
private String processor;
private String core;
private String ram;
private String displaysize;
private String gen;
private String batterylife;
private String warrenty;
private String price;
private String discounts;
private String reviews;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
public String getCore() {
	return core;
}
public void setCore(String core) {
	this.core = core;
}
public String getRam() {
	return ram;
}
public void setRam(String ram) {
	this.ram = ram;
}
public String getDisplaysize() {
	return displaysize;
}
public void setDisplaysize(String displaysize) {
	this.displaysize = displaysize;
}
public String getGen() {
	return gen;
}
public void setGen(String gen) {
	this.gen = gen;
}
public String getBatterylife() {
	return batterylife;
}
public void setBatterylife(String batterylife) {
	this.batterylife = batterylife;
}
public String getWarrenty() {
	return warrenty;
}
public void setWarrenty(String warrenty) {
	this.warrenty = warrenty;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getReviews() {
	return reviews;
}
public void setReviews(String reviews) {
	this.reviews = reviews;
}
public String getDiscounts() {
	return discounts;
}
public void setDiscounts(String discounts) {
	this.discounts = discounts;
}




}
