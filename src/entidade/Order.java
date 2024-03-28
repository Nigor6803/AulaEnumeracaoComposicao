package entidade;

import java.util.Date;

import entidade.enums.OrderStatus;

public class Order {
	private Integer ID;
	private Date monento;
	private OrderStatus status;
	
	public Order() {
		}
	
	public Order(Integer ID, Date momento, OrderStatus status) {
		this.ID = ID;
		this.monento = momento;
		this.status = status;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Date getMonento() {
		return monento;
	}

	public void setMonento(Date monento) {
		this.monento = monento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ID = " + ID + ", MOMENTO DO PEDIDO = " + monento + ", STATUS = " + status;
	}
	
}
