package com.Groep3.Management.Services;
import com.Groep3.Management.Entities.OrderData;
import com.Groep3.Management.Entities.Order;
import com.Groep3.Management.Repositories.OrderDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDataService {
    @Autowired
    private OrderDataRepository orderDataRepository;

    public OrderData newOrder(Order order){
        OrderData orderData = new OrderData();
        orderData.setStartTime(order.getTime());
        orderData.setTableId(order.getTableId());
        orderDataRepository.save(orderData);
        return orderData;
    }

    public Iterable<OrderData> allOrders(){
        return orderDataRepository.findAll();
    }

    public OrderData updateOrder(Order order, Integer id){
        OrderData orderData = orderDataRepository.getByTableId(id);
        orderData.setAssignTime(order.getTime());
        orderDataRepository.save(orderData);
        return orderData;
    }
    public OrderData finishOrder(Order order, Integer id){
        OrderData orderData = orderDataRepository.getByTableId(id);
        orderData.setFinishTime(order.getTime());
        orderDataRepository.save(orderData);
        return orderData;
    }
}