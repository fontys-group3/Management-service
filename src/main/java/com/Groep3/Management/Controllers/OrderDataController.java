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

    @GetMapping("/orderdata/all")
    public @ResponseBody Iterable<OrderData> getOrderData() {
        return orderService.getOrderData();
    }

    @PostMapping("/orderdata/neworder")
    public @ResponseBody OrderData addNewOrderData(@RequestBody Order order) {
        return orderService.addNewOrderData(order);
    }
}
