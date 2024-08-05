package com.iiht.rabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderStatus {
	
	
	private PurchaseOrder order;
	private String status;
	private String message;

}
