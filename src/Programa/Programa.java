package Programa;

import java.util.Date;

import Entidades.OrdemStatus;
import Entidades.Pedido;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedido pedido = new Pedido(1080, new Date(), OrdemStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		
		OrdemStatus os1 = OrdemStatus.ENTREGUE;
		
		OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
