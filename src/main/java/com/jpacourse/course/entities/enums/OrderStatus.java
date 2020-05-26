package com.jpacourse.course.entities.enums;

public enum OrderStatus {
	
	//Status and code
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	//Code
	private int code;
	
	//Constructor
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//GetCode
	public int getCode() {
		return code;
	}
	
	/**
	 * valueOf
	 * @return OrderStatus
	 * @param int code
	 * @exception IllegalArgumentException
	 */
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value: OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}
