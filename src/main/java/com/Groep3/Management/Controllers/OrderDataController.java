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

    @GetMapping("/orders/fooditems")
    public @ResponseBody Iterable<OrderData> getAllFood() {
        return orderService.test2();
    }

    @PostMapping("/order")
    public @ResponseBody OrderData addNewOrder(@RequestBody Order order) {
        return orderService.test();
    }
}
