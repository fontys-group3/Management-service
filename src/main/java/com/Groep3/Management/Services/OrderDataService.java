package com.Groep3.Management.Services;
import com.Groep3.Management.Entities.OrderData;
import com.Groep3.Management.Repositories.OrderDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderDataService {
    @Autowired
    private OrderDataRepository orderDataRepository;

    public OrderData test(){
        OrderData orderData = new OrderData();
        return orderData;
    }

    public Iterable<OrderData> test2(){
        return orderDataRepository.findAll();
    }

}