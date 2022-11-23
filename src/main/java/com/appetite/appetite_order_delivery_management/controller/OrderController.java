// package com.appetite.appetite_order_delivery_management.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// import com.appetite.appetite_order_delivery_management.dao.iOrderRepository;

// @Controller
// @RequestMapping("/order")
// public class OrderController {


//     @Autowired
//     iOrderRepository orderRepository;

//     @GetMapping("/new")
//     public String displayClientForm(Model model) {
//         model.addAttribute("order", new Order());
//         return "order/new-order";
//     }

//     @PostMapping("/save")
//     public String createOrder(Order order) {
//         orderRepository.save(order);
//         return "redirect:/order/new";
//     }



// }
