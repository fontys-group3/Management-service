package com.Groep3.Management.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.Groep3.Management.Entities.OrderData;
import com.Groep3.Management.Entities.Order;
import com.Groep3.Management.Services.OrderDataService;

@Controller
@CrossOrigin
@RequestMapping("/api/v1")
public class OrderDataController {

    @Autowired
    private OrderDataService orderService;

    @GetMapping("/orderdata")
    public @ResponseBody Iterable<OrderData> getAllFood() {
        return orderService.allOrders();
    }

    @PostMapping("/neworder")
    public @ResponseBody OrderData addNewOrder(@RequestBody Order order) {
        return orderService.newOrder(order);
    }
    @PutMapping("/updateorder/{tableId}")
    public @ResponseBody OrderData updateOrder(@RequestBody Order order, @PathVariable Integer tableId) {
        return orderService.updateOrder(order, tableId);
    }
    @PutMapping("/finishorder/{tableId}")
    public @ResponseBody OrderData finishOrder(@RequestBody Order order, @PathVariable Integer tableId) {
        return orderService.finishOrder(order, tableId);
    }
}
