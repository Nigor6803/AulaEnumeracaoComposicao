package aulaZeroUm;

import java.util.Date;

import entidade.Order;
import entidade.enums.OrderStatus;

public class Progama {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
	}

}
