package com.Groep3.Management.Services;
import com.Groep3.Management.Entities.Order;
import com.Groep3.Management.Entities.OrderData;
import com.Groep3.Management.Repositories.OrderDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderDataService {
    @Autowired
    private OrderDataRepository orderDataRepository;

    public OrderData addNewOrderData(Order order){
        OrderData orderData = new OrderData();
        orderData.setTableId(order.getTableId());
        orderData.setTime(order.getTime());
        orderDataRepository.save(orderData);
        return orderData;
    }

    public Iterable<OrderData> getOrderData(){
        return orderDataRepository.findAll();
    }

}