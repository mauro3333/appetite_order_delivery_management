package com.appetite.appetite_order_delivery_management.entity;

<<<<<<< HEAD
import javax.persistence.Entity;
=======
>>>>>>> 28ae96c5778bf51f8e7c979ece45ce6ee569fd2f
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

<<<<<<< HEAD

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
=======
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String ingredients;
    private Double calories;
    private Double price;
    private Boolean isAvailable;
>>>>>>> 28ae96c5778bf51f8e7c979ece45ce6ee569fd2f

    public Food() {
    }

<<<<<<< HEAD
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
    


=======
    public Food(Long id, String name, String ingredients, Double calories, Double price, Boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Double getCalories() {
        return this.calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean isIsAvailable() {
        return this.isAvailable;
    }

    public Boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
>>>>>>> 28ae96c5778bf51f8e7c979ece45ce6ee569fd2f

}
