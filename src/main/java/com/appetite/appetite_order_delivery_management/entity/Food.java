package com.appetite.appetite_order_delivery_management.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Food {

    @Id // Makes the primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long foodId;

	private String name;
	private String ingredients;
	private Integer calories;
	private Double price;
    private String isAvailable;


    public Food(String name, String ingredients, Integer calories, Double price, String isAvailable) {
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Food() {
    }

    public Long getFoodId() {
        return foodId;
    }
    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIngredients() {
        return ingredients;
    }
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    public Integer getCalories() {
        return calories;
    }
    public void setCalories(Integer calories) {
        this.calories = calories;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getIsAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }
    



}
