package com.iiht.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.iiht.rabbitmq.model.OrderStatus;

@Component
public class PurchaseOrderConsumer {
	
	
	@Value("${iiht.rabbitmq.queue}")
	String queuename;
	
	@Value("${iiht.rabbitmq.exchange}")
	String exchange;
	
	@Value("${iiht.rabbitmq.routingkey}")
	String routingkey;
	
	@RabbitListener(queues="ust_queue")
	public void ConsumerMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message received from queue: " + orderStatus);
	}
	

}
