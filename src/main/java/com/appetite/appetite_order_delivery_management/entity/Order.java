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
