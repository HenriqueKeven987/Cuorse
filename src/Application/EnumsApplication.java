package Application;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Pedido;
import entities.enums.StatusPedido;

public class EnumsApplication {

	public static void main(String[] args) {
		
		SimpleDateFormat dataForm = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date data = new Date();
		StatusPedido status = StatusPedido.valueOf("ESPERANDO_PAGAMENTO");
		
		Pedido pedido = new Pedido(108, data, status);
		
		
		System.out.println(pedido);
		StatusPedido statusEntrege = StatusPedido.valueOf("ENTREGE");
		System.out.println(statusEntrege);

	}

}
