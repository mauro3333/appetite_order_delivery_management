<<<<<<< HEAD
// package com.appetite.appetite_order_delivery_management.entity;


// import java.util.Date;
// import java.util.List;

// import javax.persistence.CascadeType;
// import javax.persistence.Entity;
// import javax.persistence.FetchType;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinTable;
// import javax.persistence.ManyToMany;

// @Entity
// public class Order {
//     @Id // Makes the primary key
// 	@GeneratedValue(strategy = GenerationType.AUTO)
// 	private Long orderId;

//     private Date date;
//     private Double totalPrice;
//     private String status;




//     @ManyToMany(cascade = {
//         CascadeType.MERGE,
//         CascadeType.REFRESH,
//         CascadeType.PERSIST
//     }, 
//     fetch = FetchType.LAZY
//     )
//     @JoinTable(name="client_order",
//     joinColumns = @JoinColumn(name="clientId"),
//     inverseJoinColumns = @JoinColumn(name="foodId"))
//     List<Client> clients;




    
// }
=======
package com.appetite.appetite_order_delivery_management.entity;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long foodId;
    private int foodQuantity;
    private Long clientId;
    private Date date;
    private Double totalPrice;

    public Order() {
    }

    public Order(Long id, Long foodId, int foodQuantity, Long clientId, Date date, Double totalPrice) {
        this.id = id;
        this.foodId = foodId;
        this.foodQuantity = foodQuantity;
        this.clientId = clientId;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFoodId() {
        return this.foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public int getFoodQuantity() {
        return this.foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public Long getClientId() {
        return this.clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
>>>>>>> 28ae96c5778bf51f8e7c979ece45ce6ee569fd2f
